# -*- coding: utf-8 -*-
"""
Created on Thu May 28 21:22:26 2015

@author: anaas_000
"""

import psa
from random import choice
from ecr.reaccao import Reaccao
from ecr.resposta import Resposta
from psa.agente import ESQ, FRT, DIR


class EvitarPosMemoria(Reaccao):
    
    def __init__(self):
        self._memoria = []
        
    def detectar_estimulo(self, percepcao):
        return percepcao.posicao
    
    def gerar_resposta(self, estimulo):
        memoria = self._activar_memoria(estimulo)
        if memoria is not None:
            return Resposta(choice([(1,ESQ),(1,FRT),(1,DIR)]), estimulo) # aqui em vez de ser uma posicao fixa tem de fazer aleatoriamente
            
    def _activar_memoria(self, posicao):
        memoria_posicao = self._recordar(posicao)
        self._memorizar(posicao)
        self._esquecer()
        return memoria_posicao
        
    def _recordar(self, posicao):
        if posicao in self._memoria:
            return posicao
        
    def _memorizar(self, posicao):
        self._memoria.append(posicao)
            
    def _esquecer(self):
        self._mostrar_memoria()
        if(len(self._memoria) > 50):
            self._memoria.pop(0)
                
    def _mostrar_memoria(self):
        psa.vismod.limpar()
        psa.vismod.marcar(self._memoria)