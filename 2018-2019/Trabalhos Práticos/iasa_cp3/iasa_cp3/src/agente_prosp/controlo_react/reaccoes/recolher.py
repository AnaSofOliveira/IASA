'''
Created on 26/04/2019

@author: Ana Oliveira
'''
from controlo_react.reaccoes.aproximar import Aproximar
from controlo_react.reaccoes.contornar import Contornar
from controlo_react.reaccoes.evitar import Evitar
from controlo_react.reaccoes.explorar import Explorar
from ecr.hierarquia import Hierarquia


class Recolher(Hierarquia):

    def __init__(self):
        super().__init__([Aproximar(), Evitar(), Contornar(), Explorar()])
        
