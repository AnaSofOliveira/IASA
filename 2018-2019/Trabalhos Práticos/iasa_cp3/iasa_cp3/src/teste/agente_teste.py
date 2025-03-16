'''
Created on 12/04/2019

@author: Ana Oliveira
'''

import psa
from psa.accao import Avancar
from psa.agente import Agente


#__________________________________________
# Agente de teste
class AgenteTeste(Agente):

    def executar(self):
        self.actuador.actuar(Avancar())
   
#__________________________________________
# Activacao     

# Iniciar Plataforma
psa.iniciar("amb/amb1.das")

# Executar Agente
psa.executar(AgenteTeste())