'''
Created on 12/04/2019

@author: Ana Oliveira
'''
from ecr.comport_comp import ComportComp
from ecr.resposta import Resposta
from psa.actuador import Mover, FRT


class Prioridade(ComportComp):


    def __init__(self, comportamentos):
        super().__init__(comportamentos)
        
    
    def seleccionar_resposta(self, respostas):
        # Devolve a resposta que tenha maior prioridade no array de respostas
        # funcao lambda responsavel por definir o elemento compar�vel (prioridade)
        return max(respostas, key = lambda resp : resp.prioridade)
    
    
    
    
    
            
            
        