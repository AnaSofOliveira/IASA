'''
Created on May 27, 2019

@author: anaso
'''
from aprend_ref.memoria_esparsa import MemoriaEsparca
from aprend_ref.sel_accao_e_greedy import SelAccaoEGreedy
from aprend_ref.aprend_q import AprendQ
from psa import vis


class MecAprend:

    def __init__(self, accoes):
        self.__accoes = accoes
        
        alpha = 0.5
        gama = 0.9
        epsilon = 0.01
        
        self.__mem_aprend = MemoriaEsparca()
        self.__sel_accao = SelAccaoEGreedy(self.__mem_aprend, self.__accoes, epsilon)
        self.__aprend_ref = AprendQ(self.__mem_aprend, self.__sel_accao, alpha, gama)
        
        
    def aprender (self, s, a, r, sn):
        self.__aprend_ref.aprender(s, a, r, sn)
        self.mostrar(sn)
        
        
    def seleccionar_accao(self, s):
        return self.__sel_accao.seleccionar_accao(s)
        
        
    def mostrar(self, s):
        vis(1).limpar()
        vis(1).aprendref(self.__aprend_ref)
        vis(2).accoesestado(s, self.__accoes, self.__mem_aprend.memoria)
        
        
        