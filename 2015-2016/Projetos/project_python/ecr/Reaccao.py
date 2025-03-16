# -*- coding: utf-8 -*-
"""
Created on Tue Jun 07 19:16:04 2016

@author: AnaS
"""
from Comportamento import Comportamento
## FAZER IMPORT AOS MOVIMENTOS

class Reaccao(Comportamento):
    
    def ativar(self, percepcao):
        estimulo = self.detectar_estimulo(percepcao)
        
        if(estimulo is not None) and (estimulo != False):
            return self.gerar_resposta(estimulo)
        
        else:
            return None
        
    
    def gerar_resposta(self, percepcao):
        return percepcao[FRT].contacto and percepcao[FRT].obstaculo
        #pass
        
        
    def detectar_estimulo(self, estimulo):
        return (1, ESQ)   
        #pass