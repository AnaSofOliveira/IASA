'''
Created on 12/04/2019

@author: Ana Oliveira
'''
from controlo import Controlo


class ControloReact(Controlo):


    def __init__(self, comportamento):
        self._comportamento = comportamento
        
        
    def processar(self, percepcao):
        resposta = self._comportamento.activar(percepcao)
        return resposta.accao
        