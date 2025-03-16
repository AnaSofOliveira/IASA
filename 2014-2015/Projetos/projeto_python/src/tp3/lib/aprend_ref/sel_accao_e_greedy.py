# -*- coding: utf-8 -*-
"""
Created on Thu May 28 22:01:14 2015

@author: anaas_000
"""
from random import uniform, choice
from sel_accao import SelAccao

class SelAccaoEGreedy(SelAccao):
    
    def __init__(self, mem_aprend, accoes, epsilon):
        super(SelAccaoEGreedy, self).__init__(mem_aprend, accoes)
        self.__epsilon = epsilon
        
    def seleccionar_accao(self, s):
        valor = uniform(0,1)
        if(valor < self.__epsilon):
            return self.explorar(s)
        return self.max_accao(s)
        
    def explorar(self, s):
        return choice(self.__accoes)