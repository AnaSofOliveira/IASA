# -*- coding: utf-8 -*-
"""
Created on Wed May 27 22:07:54 2015

@author: anaas_000
"""

import sys
sys.path.append("../lib")
sys.path.append("../agente_prosp")

import psa

from agente_prospector import AgenteProspector
from controlo_react.controlo_react import ControloReact
from controlo_react.reaccoes.recolher import Recolher

from controlo_react.reaccoes.evitar_obst import EvitarObstaculo
from controlo_react.reaccoes.contornar import Contornar
from controlo_react.reaccoes.explorar import Explorar
from controlo_react.reaccoes.aproxim_alvo.aproxim_alvo import AproximarAlvo


#_____________________________________________________
# Activacao

psa.iniciar("amb/amb1.das")

reaccoes = [AproximarAlvo(), EvitarObstaculo(), Contornar(), Explorar()]
controlo = ControloReact(Recolher(reaccoes))

psa.executar(AgenteProspector(controlo))
