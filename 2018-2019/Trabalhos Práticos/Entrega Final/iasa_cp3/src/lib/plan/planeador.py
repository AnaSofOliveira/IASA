'''
Created on 03/05/2019

@author: Ana Oliveira
'''

class Planeador:

    def planear(self, modelo_plan, estado_inicial, objectivos):
        raise NotImplementedError("Abstract")
    
    def obter_accao (self, estado):
        raise NotImplementedError("Abstract")
    
    def plano_pendente(self):
        raise NotImplementedError("Abstract")
        
    def terminar_plano(self):
        raise NotImplementedError("Abstract")