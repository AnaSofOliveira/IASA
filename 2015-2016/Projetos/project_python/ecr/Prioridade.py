# -*- coding: utf-8 -*-
"""
Created on Tue Jun 07 19:16:28 2016

@author: AnaS
"""
from ComportComp import ComportComp

class Prioridade(ComportComp):
    
    def seleccionar_resposta(self, respostas):
        resp_prioritaria = sorted(respostas, key = lambda resposta: resposta.prioridade)
        
        if resp_prioritaria:
            return resp_prioritaria[-1]
            
        else:
            return None