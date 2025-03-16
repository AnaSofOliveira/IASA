'''
Created on May 24, 2019

@author: anaso
'''

from agente_prospector import AgenteProspector
import psa
from controlo_aprend_ref.controlo_aprend_ref import ControloAprendRef


# Iniciar Plataforma
psa.iniciar("amb/amb3.das", reiniciar = True)

controlo = ControloAprendRef()

agente = AgenteProspector(controlo)

psa.executar(agente)