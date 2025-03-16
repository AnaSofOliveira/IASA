# -*- coding: utf-8 -*-
"""
Created on Tue Jun 07 19:16:22 2016

@author: AnaS
"""
from ComportComp import ComportComp

class Hierarquia(ComportComp):
    
    def seleccionar_resposta(self, respostas):
        return respostas[0]
        