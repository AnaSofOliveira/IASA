# -*- coding: utf-8 -*-
"""
Created on Wed May 27 23:27:07 2015

@author: anaas_000
"""
from ecr.comportamento import Comportamento
from ecr.coord.prioridade import Prioridade
from aproxim_alvo_dir import AproximarAlvoDir
from psa.agente import ESQ, FRT, DIR

class AproximarAlvo(Comportamento):
    
    def __init__(self):
        super(AproximarAlvo, self).__init__(Prioridade(), [AproximarAlvoDir(ESQ),AproximarAlvoDir(FRT),AproximarAlvoDir(DIR)])