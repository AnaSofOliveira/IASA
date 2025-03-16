# -*- coding: utf-8 -*-
"""
Created on Mon May 25 23:42:24 2015

@author: anaas_000
"""
from esquema_comport import EsquemaComport
 
class Reaccao(EsquemaComport):
    
    def ativar(self, percepcao):
        estimulo = self.detectar_estimulo(percepcao)
        if (estimulo is not None) and (estimulo != False):
            return self.gerar_resposta(estimulo)
        else:
            return None
            
    def detectar_estimulo(self, percepcao):
        abstract
        # return percepcao[FRT].contacto and percepcao[FRT].obstaculo
        
    def gerar_resposta(self, estimulo):
        abstract
        # return (1, ESQ)
