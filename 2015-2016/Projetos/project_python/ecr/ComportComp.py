# -*- coding: utf-8 -*-
"""
Created on Tue Jun 07 19:16:13 2016

@author: AnaS
"""
from Comportamento import Comportamento
from Resposta import Resposta

class ComportComp(Comportamento):
    
    def __init__(self, comportamentos):
        self.__comportamentos = comportamentos
        
        
    def activar(self, percepcao):
        respostas = []
        
        for comportamento in self.__comportamentos:
            resposta = comportamento.ativar(percepcao)
            
            if resposta:
                respostas.append(resposta)
                
        return self.seleccionar_resposta(respostas)
        
        
    def seleccionar_resposta(self, respostas):
        pass
