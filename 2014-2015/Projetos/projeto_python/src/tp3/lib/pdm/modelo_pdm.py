# -*- coding: utf-8 -*-
"""
Created on Fri May 29 21:12:45 2015

@author: anaas_000
"""

class ModeloPDM():
    
    def S(self) :
        abstract
    
    def A(self, s):
        abstract
        
    def T(self, s, a):
        abstract
        
    def R(self, s, a, sn):
        abstract
        
        