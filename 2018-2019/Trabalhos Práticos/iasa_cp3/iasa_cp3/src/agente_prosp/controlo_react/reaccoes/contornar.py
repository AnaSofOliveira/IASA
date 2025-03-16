'''
Created on 26/04/2019

@author: Ana Oliveira
'''
from ecr.reaccao import Reaccao
from ecr.resposta import Resposta
from psa.accao import Mover
from psa.actuador import ESQ, FRT, DIR


class Contornar(Reaccao):

    #@override  
    def _detectar_estimulo(self, percepcao):
        return ((percepcao[ESQ].obstaculo and percepcao[ESQ].contacto) or (percepcao[DIR].obstaculo and percepcao[DIR].contacto))
    
    #@override  
    def _gerar_resposta(self, estimulo):
        accao = Mover(FRT)
        return Resposta(accao)