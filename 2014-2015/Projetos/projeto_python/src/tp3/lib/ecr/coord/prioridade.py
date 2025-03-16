# -*- coding: utf-8 -*-
"""
Created on Mon May 25 23:42:59 2015

@author: anaas_000
"""
from esquema_coord import EsquemaCoord

class Prioridade(EsquemaCoord):
    
    def selecionar_resposta(self, respostas):
        ## verificar funçao lambda
        resp_prio = sorted(respostas, key = lambda resposta: resposta.prioridade)
        
        if (resp_prio):
            return resp_prio[-1]
        else:
            return None