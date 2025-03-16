# -*- coding: utf-8 -*-
"""
Created on Wed May 27 20:48:50 2015

@author: anaas_000
"""
from psa.agente import ESQ, FRT, DIR
from ecr.reaccao import Reaccao
from ecr.resposta import Resposta

class Contornar(Reaccao):
    
    def detectar_estimulo(self, percepcao):
        return (percepcao[ESQ].obstaculo or percepcao[DIR].obstaculo)
    
    def gerar_resposta(self, estimulo):
        return Resposta((1, FRT)) ## Avança ou não avança (?)