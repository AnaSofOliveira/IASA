# -*- coding: utf-8 -*-
"""
Created on Thu May 28 22:00:46 2015

@author: anaas_000
"""
from memoria_aprend import MemoriaAprend

class MemoriaEsparsa(MemoriaAprend):
    
    def __init__(self, valor_omissao = 0):
        self.__memoria = {}
        self.__valor_omissao = valor_omissao