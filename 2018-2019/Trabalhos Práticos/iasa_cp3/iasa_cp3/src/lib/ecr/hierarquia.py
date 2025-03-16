'''
Created on 12/04/2019

@author: Ana Oliveira
'''
from ecr.comport_comp import ComportComp


class Hierarquia(ComportComp):


    def __init__(self, comportamentos):
        super().__init__(comportamentos)

    def seleccionar_resposta(self, respostas):
        return respostas[0]