# -*- coding: utf-8 -*-
"""
Created on Thu May 28 22:01:27 2015

@author: anaas_000
"""
import choice
from aprend_q import AprendQ

class AprendDynaQ(AprendQ):
    
    def __init__(self, mem_aprend, sel_accao, alfa, gama, num_sim):
        super(AprendDynaQ, self).__init__(mem_aprend, sel_accao, alfa, gama)
        self.__T = []
        self.__R = []        
        self.__num_sim = num_sim
        
    def __iniciar_modelo(self):
        self.__T = {}
        self.__R = {}
        
    def __actualizar_modelo(self, s, a, r, sn):
        self.__T[(s, a)] = sn
        self.__R[(s, a)] = r
        
    def aprender(self, s, a, r, sn):
        super(AprendDynaQ, self).aprender(self, s, a, r, sn)
        self.__actualizar_modelo(s, a, r, sn)
        self.__simular()
        
    def __simular(self):
        for i in range(self._num_sim):
            (s, a) = choice(self._T.keys())
            sn = self._T[(s,a)]
            r = self._R[(s,a)]
            super(AprendDynaQ, self).aprender(s, a, r, sn)