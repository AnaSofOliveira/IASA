# -*- coding: utf-8 -*-
"""
Created on Mon May 25 23:42:29 2015

@author: anaas_000
"""

class Resposta():
    
    def __init__(self, accao, prioridade = 0):
        self.__accao = accao
        self.__prioridade = prioridade
        
    @property
    def accao(self):
        return self.__accao 
        
    @property
    def prioridade(self):
        return self.__prioridade
        
    