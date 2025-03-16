# -*- coding: utf-8 -*-
"""
Created on Mon May 30 22:20:18 2016

@author: AnaS
"""
import Controlo

class ControloReact(Controlo):
    
    def __init__(self, comportamento):
        self.__comportamento = comportamento
        
    def processar(self, percepcao):
        resposta = self.__comportamento.activar(percepcao)
        return resposta.accao