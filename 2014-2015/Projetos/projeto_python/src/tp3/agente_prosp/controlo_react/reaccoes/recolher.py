# -*- coding: utf-8 -*-
"""
Created on Wed May 27 22:01:54 2015

@author: anaas_000
"""
from ecr.comportamento import Comportamento
from ecr.coord.hierarquia import Hierarquia

class Recolher(Comportamento):
    
    def __init__(self, reaccoes):
        super(Recolher, self).__init__(Hierarquia(), reaccoes)