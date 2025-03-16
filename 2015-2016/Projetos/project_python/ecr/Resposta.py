# -*- coding: utf-8 -*-
"""
Created on Tue Jun 07 19:15:56 2016

@author: AnaS
"""

class Resposta():
    
    def __init__(self, accao, prioridade = 0):
        self.__accao = accao
        self.__priopridade = prioridade
        
    @property
    def accao(self):
        return self.__accao
        
    @property
    def prioridade(self):
        return self.__priopridade