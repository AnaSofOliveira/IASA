# -*- coding: utf-8 -*-
"""
Created on Thu May 28 21:57:44 2015

@author: anaas_000
"""
from psa.util import argmax

class SelAccao(object):
    
    def __init__(self, mem_aprend, accoes):
        self.__mem_aprend = mem_aprend
        self.__accoes = accoes
        
    def max_accao(self, s):
        return argmax(self.__accoes, lambda a: self.__mem_aprend[(s,a)])
            
    def seleccionar_accao(self, s):
        abstract
        
    def explorar(self, s):
        abstract