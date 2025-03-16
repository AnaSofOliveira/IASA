'''
Created on 26/04/2019

@author: Ana Oliveira
'''
from random import choice

from ecr.comportamento import Comportamento
from ecr.resposta import Resposta
from psa.accao import Mover
from psa.actuador import ESQ, FRT, DIR


class Explorar(Comportamento):

    def activar(self, percepcao):
        angulo = choice([ESQ, FRT, DIR])
        accao = Mover(angulo)
        
        return Resposta(accao)
        