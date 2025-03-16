# -*- coding: utf-8 -*-
"""
Created on Mon May 30 21:49:44 2016

@author: AnaS
"""
from psa.agente import Agente
from psa.actuador import AVANCAR
       
class AgenteProspector(Agente):
    
    
    def executar(self):
        percepcao = self.__percepcionar()
        accao = self.__processar(percepcao)
        
        if accao is not None:
            self.__actuar(accao)
        
        
    def __percepcionar(self):
        percepcao = self.sensor_multiplo.detectar()
        print percepcao.posicao
        print percepcao.orientacao
        print "carga" + percepcao.carga.__str__()
        print percepcao.colisao.__str__()
        print "*****"
             
        return percepcao
        
        
    def __processar(self, percepcao):
        accao = AVANCAR
        return accao
        
        
    def __actuar(self, accao):
        self.actuador.actuar(accao)
        
