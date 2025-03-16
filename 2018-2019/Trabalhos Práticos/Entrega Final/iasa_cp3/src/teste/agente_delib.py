'''
Created on 12/04/2019

@author: Ana Oliveira
'''

from agente_prospector import AgenteProspector
from controlo_delib.controlo_delib import ControloDelib
from pee.melhorprim.procura_aa import ProcuraAA
from plan.plan_pee.plan_pee import PlanPEE
import psa
from psa.accao import Avancar
from psa.agente import Agente


# Iniciar Plataforma
psa.iniciar("amb/amb1.das")

mec_proc = ProcuraAA()
planeador = PlanPEE(mec_proc)
controlo = ControloDelib(planeador)

agente = AgenteProspector(controlo)

psa.executar(agente)