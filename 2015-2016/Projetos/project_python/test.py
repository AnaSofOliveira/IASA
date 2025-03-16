# -*- coding: utf-8 -*-

import psa
from agente_prosp.AgenteProspector import AgenteProspector


#iniciar psa com o ambiente
psa.iniciar("amb/amb1.das")

#fazes executar à psa
psa.executar(AgenteProspector())


