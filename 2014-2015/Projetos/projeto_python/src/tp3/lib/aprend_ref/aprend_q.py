# -*- coding: utf-8 -*-
"""
Created on Thu May 28 22:00:57 2015

@author: anaas_000
"""
from aprend_ref import AprendRef

class AprendQ(AprendRef):
    
    def __init__(self, mem_aprend, sel_accao, alfa, gama):
        super(AprendQ, self).__init__(mem_aprend, sel_accao)
        self.__alfa = alfa
        self.__gama = gama
        
    def aprender(self, s, a, r, sn):
        qsa = self.__mem_aprend[(s,a)]
        max_accao = self.seleccionar_accao.max_accao(sn)
        max_qsa = self.__mem_aprend[(sn, max_accao)]
        self.__mem_aprend[(s,a)] = qsa + self.__alfa*( r + self.__gama * max_qsa - qsa)
        