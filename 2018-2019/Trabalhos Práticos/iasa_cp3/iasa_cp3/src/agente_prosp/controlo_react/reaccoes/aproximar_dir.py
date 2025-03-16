'''
Created on 26/04/2019

@author: Ana Oliveira
'''
from ecr.reaccao import Reaccao
from ecr.resposta import Resposta
from psa.accao import Mover


class AproximarDir(Reaccao):
    
    def __init__(self, angulo):
        self.__angulo = angulo
        self.__gama = 0.9
    
    def _detectar_estimulo(self, percepcao):
        if (percepcao[self.__angulo].alvo):
            return percepcao[self.__angulo].distancia
        
    def _gerar_resposta(self, estimulo):
        distancia = estimulo
        prioridade = 1.0/(1 + distancia)
        #prioridade = (self.__gama ** distancia)
        
        accao = Mover(self.__angulo)
            
        return Resposta(accao, prioridade)
        