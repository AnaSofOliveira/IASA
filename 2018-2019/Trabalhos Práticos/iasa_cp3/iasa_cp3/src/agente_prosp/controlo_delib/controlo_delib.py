'''
Created on 03/05/2019

@author: Ana Oliveira
'''

#!/usr/bin/python
# -*- coding: utf-8 -*-

from controlo import Controlo
from controlo_delib.modelo_mundo import ModeloMundo
import psa
from psa.elementos import ALVO


#from psa.visualizador import Visualizador
class ControloDelib(Controlo):

    def __init__(self, planeador):
        self.__modelo_mundo = ModeloMundo()
        self.__planeador = planeador
        self.__objectivos = []
        

    def reconsiderar(self):
        # mundo alterado, n�o h� objectivos, n�o ha plano
        return self.__modelo_mundo.alterado
        #return (not(self.__objectivos) or not(self.__planeador.plano) or self.__modelo_mundo.alterado)

        
    def __deliberar(self):
        # Observa o modelo do mundo e recolhe a lista de objectivos (lista de alvos)
        self.__objectivos = [estado for estado in self.__modelo_mundo.estados() if self.__modelo_mundo.obter_elem(estado) == ALVO]
        
        
    def __planear(self):
        # Valida objectivos: 
            # Se existir objetivo: coloca o planeador a planear com o modelo do mundo, o estado atual do sistema e a lista de objectivos
            # Se n�o existirem objectivos: N�o h� plano   
        if (self.__objectivos):
            self.__planeador.planear(self.__modelo_mundo, self.__modelo_mundo.estado, self.__objectivos)
        else: 
            self.__planeador.terminar_plano()

        
    def __executar(self):
        # Executa a accao planeada
        return self.__planeador.obter_accao(self.__modelo_mundo.estado)
        
        
    def processar(self, percepcao):
        self.__assimilar(percepcao)
        
        if(self.reconsiderar()):
            self.__deliberar()
            self.__planear()
        
        self.mostrar()
        return self.__executar()
        
        
    def __assimilar(self, per):
        self.__modelo_mundo.actualizar(per)
        
        
    def mostrar(self):
        vis = psa.vis(1)
        vis.limpar()
        self.__planeador.mostrar(vis, self.__modelo_mundo.estado)
        
        
        