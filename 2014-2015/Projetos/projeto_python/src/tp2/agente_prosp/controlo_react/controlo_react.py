# -*- coding: utf-8 -*-
"""
Created on Wed May 27 01:33:23 2015

@author: anaas_000
"""
from controlo import Controlo

class ControloReact(Controlo):
    
    def __init__(self, reaccoes):
        self.__reaccoes = reaccoes
    
    def processar(self, percepcao):
        reaccoes = self.__reaccoes.ativar(percepcao)
        return reaccoes.accao
