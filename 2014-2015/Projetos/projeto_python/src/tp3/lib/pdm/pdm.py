# -*- coding: utf-8 -*-
"""
Created on Fri May 29 21:12:33 2015

@author: anaas_000
"""

class PDM():
    
    def __init__(self, gama):
        self.__gama = gama
        #self.__delta_max = #por criar classe
    
    def utilidade(self):
        S, A = modelo.S, modelo.A
        U = {s : 0 for s in S}
        
        while True:
            U_ant = U.copy
            delta = 0
            for s in S:
                U[s] = max( util_accao(s, a, U_ant) for a in A)
                delta_s = abs(U_ant[s] - U[s])
                delta = max(delta, delta_s)
            if (delta < delta_max):
                break
        return U
        
    def __util_accao(self, s, a, U):
        return sum(p*(R(s,a,sn) + self.__gama*U[sn]) for (p, sn) in T(s,a))
        
    def politica(self, U):
        pi = {}
        for s in S():
            pi = psa.argmax(A(s), lambda a: self.__util_accao(s,a,U))
        return pi
        
            