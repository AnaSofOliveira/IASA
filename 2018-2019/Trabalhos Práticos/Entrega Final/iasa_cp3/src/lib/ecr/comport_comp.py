'''
Created on 12/04/2019

@author: Ana Oliveira
'''
from ecr.comportamento import Comportamento


class ComportComp(Comportamento):


    def __init__(self, comportamentos):
        self.__comportamentos = comportamentos
        
    
    def seleccionar_resposta(self, respostas):
        raise NotImplementedError("Abstract")
        
        
    def activar(self, percepcao):
        self.respostas = []
        for comportamento in self.__comportamentos:
            resposta = comportamento.activar(percepcao)
            if(resposta is not None):
                self.respostas.append(resposta)
        if(self.respostas):
            return self.seleccionar_resposta(self.respostas)