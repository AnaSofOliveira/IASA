'''
Created on 12/04/2019

@author: Ana Oliveira
'''

from agente_prospector import AgenteProspector
from controlo_react.controlo_react import ControloReact
from controlo_react.reaccoes.recolher import Recolher
import psa
from psa.accao import Avancar
from psa.agente import Agente


# Iniciar Plataforma
psa.iniciar("amb/amb1.das")

# Executar Agente
comportamento = Recolher()
controlo = ControloReact(comportamento)

agente = AgenteProspector(controlo)

psa.executar(agente)