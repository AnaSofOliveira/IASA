# -*- coding: utf-8 -*-
"""
Created on Mon May 25 23:41:53 2015

@author: anaas_000
"""

from esquema_comport import EsquemaComport

class Comportamento(EsquemaComport):
    
    def __init__(self, esq_coord, reaccoes):
        
        self.__esq_coord = esq_coord
        self.__reaccoes = reaccoes
        
    def ativar(self, percepcao):
        respostas = []
        
        for reaccao in self.__reaccoes:
            print type(reaccao)
            resposta = reaccao.ativar(percepcao)
            
            if resposta:
                respostas.append(resposta)
                
        return self.__esq_coord.selecionar_resposta(respostas)
        