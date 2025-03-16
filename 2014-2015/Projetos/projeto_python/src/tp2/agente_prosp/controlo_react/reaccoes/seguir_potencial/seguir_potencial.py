# -*- coding: utf-8 -*-
"""
Created on Thu May 28 20:46:07 2015

@author: anaas_000
"""
from ecr.comportamento import Comportamento
from ecr.coord.prioridade import Prioridade
from psa.agente import ESQ, FRT, DIR
from seguir_potencial_dir import SeguirPotencialDir

class SeguirPotencial(Comportamento):
    
    def __init__(self):
        super(SeguirPotencial, self).__init__(Prioridade(), [SeguirPotencialDir(ESQ), SeguirPotencialDir(FRT), SeguirPotencialDir(DIR)])