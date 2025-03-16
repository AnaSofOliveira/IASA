'''
Created on 03/05/2019

@author: Ana Oliveira
'''

from controlo_delib.operador_mover import OperadorMover
from plan.modelo_plan import ModeloPlan
from psa import dirmov


class ModeloMundo(ModeloPlan):

    def __init__(self):
        self.__alterado = False
        self.__elementos = None
        self.__estado = None
        self.__operadores = [OperadorMover(self, mov) for mov in dirmov()] #self = instancia da classe ModeloMundo
        
    @property
    def estado(self):
        return self.__estado
    
    
    @property
    def alterado(self):
        return self.__alterado


#     @property
#     def _elementos(self):
#         return self.__elementos
    
    
    def obter_elem(self, estado):
        return self.__elementos.get(estado)
        
        
    def actualizar(self, percepcao):
        self.__estado = percepcao.posicao
        self.__alterado = not (self.__elementos == percepcao.imagem)
        
        if(self.__alterado):
            self.__elementos = percepcao.imagem
            self.__estados = percepcao.imagem.keys()
        
    def operadores(self):
        return self.__operadores
    
    def estados(self):
        return self.__elementos.keys()
        