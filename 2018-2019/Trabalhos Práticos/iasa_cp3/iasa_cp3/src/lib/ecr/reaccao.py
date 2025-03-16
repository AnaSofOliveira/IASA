'''
Created on 12/04/2019

@author: Ana Oliveira
'''
from ecr.comportamento import Comportamento


class Reaccao(Comportamento):


    def _detectar_estimulo(self, percepcao):
        raise NotImplementedError("Abstract")
        
        
    def _gerar_resposta(self, estimulo):
        raise NotImplementedError("Abstract")
        
        
    def activar(self, percepcao):
        estimulo = self._detectar_estimulo(percepcao)
        
        if ((estimulo is not None) and (estimulo is not False)):
            return self._gerar_resposta(estimulo)
        return None