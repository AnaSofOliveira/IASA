# -*- coding: utf-8 -*-
"""
Created on Thu May 28 20:46:29 2015

@author: anaas_000
"""
from ecr.reaccao import Reaccao
from ecr.resposta import Resposta

class SeguirPotencialDir(Reaccao):
    
    def __init__(self, direccao):
        self.__direccao = direccao
        
    def detectar_estimulo(self, percepcao):
        if (percepcao[self.__direccao].potencial > 0):
            return percepcao[self.__direccao].potencial
    
    def gerar_resposta(self, estimulo_dist):
        prioridade = estimulo_dist
        accao = (1, self.__direccao)
        
        return Resposta(accao, prioridade)
        