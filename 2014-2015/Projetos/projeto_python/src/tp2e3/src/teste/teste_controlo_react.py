# -*- coding: latin-1 -*-

import sys
sys.path.append("../lib")
sys.path.append("../agente_prosp")

import psa

from agente_prospector import AgenteProspector
from controlo_react.controlo_react import ControloReact as controlo


#_____________________________________________________
# Activacao

psa.iniciar("amb/amb1.das")
psa.executar(AgenteProspector(controlo()))

