'''
Created on 17/05/2019

@author: Ana Oliveira
'''
from pdm.pdm import PDM
from plan.planeador import Planeador
from plan.plan_pdm.modelo_pdm_plan import ModeloPDMPlan


class PlanPDM(Planeador):

    def __init__(self):
        self.__gama = 0.9
        self.__delta_max = 1
        self.__utilidade = {}
        self.__politica = {}
        self.__pdm = PDM(self.__gama, self.__delta_max)
        
        
    def planear(self, modelo_plan, estado, objectivos):
        if objectivos:
            modelo = ModeloPDMPlan(modelo_plan, objectivos)
            self.__utilidade, self.__politica = self.__pdm.resolver(modelo)
        
        
    def obter_accao(self, s):
        #se tiver politica retorna a politica para esse estado
        if self.__politica:
            return self.__politica.get(s).accao
        
        
    def plano_pendente(self):
        return self.__politica
        
        
    def terminar_plano(self):
        self.__politica = {}
        self.__utilidade = {}
        
        
    def mostrar(self, vis, estado):
        vis.limpar()
        vis.campo(self.__utilidade)
        vis.politica(self.__politica)
        