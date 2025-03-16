'''
Created on 12/04/2019

@author: Ana Oliveira
'''

from agente_prospector import AgenteProspector
import psa
from controlo_delib.controlo_delib import ControloDelib
from plan.plan_pdm.plan_pdm import PlanPDM


# Iniciar Plataforma
psa.iniciar("amb/amb3.das")

planeador = PlanPDM()

controlo = ControloDelib(planeador)

# Executar Agente
psa.executar(AgenteProspector(controlo))