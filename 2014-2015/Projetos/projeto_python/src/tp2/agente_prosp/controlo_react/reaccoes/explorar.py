# -*- coding: utf-8 -*-
"""
Created on Wed May 27 01:46:34 2015

@author: anaas_000
"""
import random
from ecr.resposta import Resposta
from ecr.esquema_comport import EsquemaComport
from psa.agente import ESQ, FRT, DIR

class Explorar(EsquemaComport):
    
    def ativar(self, percepcao):
        resposta = Resposta(random.choice([(1,ESQ),(1,FRT),(1,DIR)]))
        return resposta