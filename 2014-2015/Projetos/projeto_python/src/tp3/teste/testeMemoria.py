# -*- coding: utf-8 -*-
"""
Created on Thu May 28 21:32:24 2015

@author: anaas_000
"""

import sys

sys.path.append("../lib")
sys.path.append("../agente_prosp")

from agente_prospector import AgenteProspector
from controlo_aprend.controlo_aprend_ref import ControloAprendRef
from controlo_react.reaccoes.recolher import Recolher
from controlo_react.reaccoes.seguir_potencial.seguir_potencial import SeguirPotencial
from controlo_react.reaccoes.evitar_pos_memoria import EvitarPosMemoria

from controlo_react.reaccoes.evitar_obst import EvitarObstaculo
from controlo_react.reaccoes.contornar import Contornar
from controlo_react.reaccoes.explorar import Explorar
from controlo_react.reaccoes.aproxim_alvo.aproxim_alvo import AproximarAlvo


#_____________________________________________________
# Activacao
import psa
psa.iniciar("amb/amb1.das")

reaccoes = [AproximarAlvo(), EvitarObstaculo(), Contornar(), EvitarPosMemoria(), SeguirPotencial(), Explorar()]
controlo = ControloAprendRef()

psa.executar(AgenteProspector(controlo))
