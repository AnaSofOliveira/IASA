# -*- coding: utf-8 -*-
"""
Created on Fri Apr 04 16:48:38 2014

@author: Frank
"""

import sys
sys.path.append('..')
sys.path.append("../agente_prosp")

import psa
from agente_prosp.agente_prospector import AgenteProspector
from controlo_react.controlo_recolher import ControloRecolher
#_____________________________________________________
# Activacao

psa.iniciar("C:\Directorio\\amb1.das")
controlo=ControloRecolher()
agenteProspector = AgenteProspector(controlo)

psa.executar(agenteProspector)