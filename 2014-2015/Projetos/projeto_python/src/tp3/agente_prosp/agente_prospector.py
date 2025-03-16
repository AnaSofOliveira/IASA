# -*- coding: utf-8 -*-
"""
Created on Wed May 27 00:20:02 2015

@author: anaas_000
"""
from psa.agente import Agente
 
class AgenteProspector(Agente):
    
    def __init__(self, controlo):
        self.__controlo = controlo
      
    def __percepcionar(self):
        
        ## Verificar SensorMultiplo
        percepcao = self.sensor_multiplo.detectar()
        return percepcao
       
    def __processar(self, percepcao):
        accao = self.__controlo.processar(percepcao)
        return accao
        
    def __actuar(self, accao):
        if accao is not None:
            ## Verificar actuador
            self.actuador.actuar(accao)
        
    def executar(self):
        percepcao = self.__percepcionar()
        accao = self.__processar(percepcao)
        self.__actuar(accao)
