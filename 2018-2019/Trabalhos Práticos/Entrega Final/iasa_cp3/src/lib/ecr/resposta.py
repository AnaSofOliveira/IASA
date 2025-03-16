'''
Created on 12/04/2019

@author: Ana Oliveira
'''

class Resposta:
    
    def __init__(self, accao, prioridade = 0):
        self.__accao = accao
        self.__prioridade = prioridade
        
    @property
    def accao(self):
        return self.__accao
    
    @property
    def prioridade(self):
        return self.__prioridade