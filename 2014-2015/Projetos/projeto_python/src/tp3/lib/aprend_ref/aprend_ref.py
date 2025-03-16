# -*- coding: utf-8 -*-
"""
Created on Thu May 28 21:57:32 2015

@author: anaas_000
"""

class AprendRef(object):
    
    def __init__(self, mem_aprend, sel_accao):
        self.__mem_aprend = mem_aprend
        self.__sel_accao = sel_accao
        
    def aprender(self, s, a, r, sn): #s - estado / a - accao / r - recompensa / sn - proximo estado
        abstract