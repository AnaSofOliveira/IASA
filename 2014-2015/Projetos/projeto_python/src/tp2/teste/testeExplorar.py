# -*- coding: utf-8 -*-
"""
Created on Wed May 27 00:02:23 2015

@author: anaas_000
"""


import sys
sys.path.append("../lib")
sys.path.append("../agente_prosp")

import psa

from agente_prospector import AgenteProspector
from controlo_react.controlo_react import ControloReact
from controlo_react.reaccoes.explorar import Explorar


#_____________________________________________________
# Activacao

psa.iniciar("amb/amb1.das")

controlo = ControloReact(Explorar())

psa.executar(AgenteProspector(controlo))

