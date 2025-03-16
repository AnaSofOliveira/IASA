'''
Created on 26/04/2019

@author: Ana Oliveira
'''
from ecr.reaccao import Reaccao
from ecr.resposta import Resposta
from psa.accao import Rodar
from psa.actuador import ESQ, FRT, DIR


class Evitar(Reaccao):

    #@override
    def _detectar_estimulo(self, percepcao):
        # percepcao[FRT].obstaculo and percepcao[FRT].contacto - ja retorna condi��o booleana
        return percepcao[FRT].obstaculo and percepcao[FRT].contacto
        
    #@override  
    def _gerar_resposta(self, estimulo):
        accao = Rodar(ESQ)
        return Resposta(accao)