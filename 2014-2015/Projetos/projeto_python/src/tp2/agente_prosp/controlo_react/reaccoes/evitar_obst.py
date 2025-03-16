# -*- coding: utf-8 -*-
"""
Created on Wed May 27 21:54:12 2015

@author: anaas_000
"""
from psa.agente import FRT, ESQ
from ecr.reaccao import Reaccao
from ecr.resposta import Resposta

class EvitarObstaculo(Reaccao):
    
    def detectar_estimulo(self, percepcao):
        ## contacto -> Colisao
        return percepcao[FRT].contacto and percepcao[FRT].obstaculo
        
    def gerar_resposta(self, estimulo):
        return Resposta((0, ESQ))
            