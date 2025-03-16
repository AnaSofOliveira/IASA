# -*- coding: utf-8 -*-
"""
Created on Wed May 27 23:27:22 2015

@author: anaas_000
"""
from ecr.reaccao import Reaccao
from ecr.resposta import Resposta

class AproximarAlvoDir(Reaccao):
    
    def __init__(self, direcao):
        self.__direcao = direcao
        
    def detectar_estimulo(self, percepcao):
        if (percepcao[self.__direcao].alvo):
            return percepcao[self.__direcao].distancia
            
    def gerar_resposta(self, estimulo_dist):
        prioridade = 1./(1 + estimulo_dist)
        accao = (1, self.__direcao)
        return Resposta(accao, prioridade)