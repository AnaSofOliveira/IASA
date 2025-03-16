# -*- coding: utf-8 -*-
"""
Created on Thu May 28 22:02:35 2015

@author: anaas_000
"""
import psa
from psa.actuador import MOVER
from controlo import Controlo
from aprend_ref.memoria_esparsa import MemoriaEsparsa
from aprend_ref.sel_accao_e_greedy import SelAccaoEGreedy
from aprend_ref.aprend_q import AprendQ

class ControloAprendRef(Controlo):
    
    def __init__(self):
        self.__r_max = 100
        self.__s = None
        self.__a = None
        self.__mem_aprend  = MemoriaEsparsa()
        self.__accoes = psa.dirmov()
        self.__mec_sel_accao = SelAccaoEGreedy(self.__mem_aprend, self.__accoes, 0.01)
        self.__mec_aprend = AprendQ(self.__mem_aprend, self.__mec_sel_accao, 0.5, 0.95)
        
        
    def processar(self, percepcao):
        sn = percepcao.colisao
        
        if self.__a is not None:
            r = self.reforco(percepcao, self.__s, sn)
            self.__mec_aprend.aprender(self.__s, self.__a, r, sn)
            psa.vismod.accaovalordir(self.__mem_aprend.memoria, self.__accoes)
        
        an = self.__mec_sel_accao.seleccionar_accao(sn)
        self.__a = an
        self.__s = sn
        
        if an is not None:
            return MOVER(an)
        
        
    def reforco(self, percepcao, s, sn):
        if percepcao.colisao:
            return -1 * self.__r_max
        elif percepcao.carga:
            return self.__r_max
        else:
            return -1 * psa.dist(s, sn)
        
        