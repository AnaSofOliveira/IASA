'''
Created on May 24, 2019

@author: anaso
'''

from random import choice, uniform
from aprend_ref.sel_accao import Sel_Accao

class SelAccaoEGreedy(Sel_Accao):

    def __init__(self, mem_aprend, accoes, epsilon):
        self.__mem_aprend = mem_aprend
        self.__accoes = accoes
        self.__epsilon = epsilon
        
        
    def seleccionar_accao(self, s):
        # gera numero aleatório entre 0 e 1 para validar se está no domínio do epsilon ou não
        greedy = uniform(0,1)
        
        if (greedy < self.__epsilon):
            return self.max_accao(s)
        else:
            return self.explorar(s)
        
        
    def max_accao(self, s):
        # argumento que máximiza a função Q(s,a)
        return max(self.__accoes, key = lambda a : self.__mem_aprend.obter(s,a))
        
        
    def explorar(self, s):
        return choice(self.__accoes)
    
    
    @property
    def accoes(self):
        return self.__accoes
        
        