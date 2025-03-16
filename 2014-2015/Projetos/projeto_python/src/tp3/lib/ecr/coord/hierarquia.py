# -*- coding: utf-8 -*-
"""
Created on Mon May 25 23:42:49 2015

@author: anaas_000
"""
from esquema_coord import EsquemaCoord

class Hierarquia(EsquemaCoord):
    
    def selecionar_resposta(self, respostas):
        return respostas[0]