'''
Created on May 24, 2019

@author: anaso
'''
from controlo import Controlo
from psa.accao import Avancar
from psa import dirmov
from controlo_aprend_ref.mec_aprend import MecAprend

class ControloAprendRef (Controlo):


    def __init__(self):
        self.__rmax = 100.0
        self.__s = None
        self.__a = None
        
        accoes = [Avancar(ang) for ang in dirmov()]
        self.__mec_aprend = MecAprend(accoes)

    
    def processar(self, percepcao):
        sn = percepcao.posicao
        
        if self.__a is not None:
            r = self.__gerar_reforco(percepcao)
            self.__mec_aprend.aprender(self.__s, self.__a, r, sn)
            
        an = self.__mec_aprend.seleccionar_accao(sn)
        self.__s = sn
        self.__a = an
        
        return an
        
        
    def __gerar_reforco(self, percepcao):
        reforco = -percepcao.custo_mov

        if percepcao.colisao:
            reforco += -(self.__rmax)
        
        if percepcao.carga:
            reforco += self.__rmax
        
        return reforco
    
    
    