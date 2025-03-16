'''
Created on 17/05/2019

@author: Ana Oliveira
'''
from pdm.modelo_pdm import ModeloPDM
from plan.modelo_plan import ModeloPlan


class ModeloPDMPlan(ModeloPDM, ModeloPlan):

    def __init__(self, modelo_plan, objectivos):
        self.r_max = 100
        
        self.__modelo_plan = modelo_plan
        self.__objectivos = objectivos
            
        self.__S = self.__modelo_plan.estados()
        self.__A = self.__modelo_plan.operadores()
        self.__T = {}
        self.__R = {}
        
#         for s in self.__S:
#             for a in self.__A:
#                 self.__T[(s, a)] = self.T(s, a)
# 
#                 sn = a.aplicar(s)
#                 self.__R[(s, a, sn)] = self.R(s, a, sn)
                
#                 self.__T[(s, a)] = self.T(s, a)
# 
#                 Tsa = self.__T[(s,a)][0]
#                 if Tsa is not None:
#                     self.__R[s, a, Tsa[1]] = self.R(s, a, Tsa[1])
        
    def estados(self):
        self.__modelo_plan.estados()
        
        
    def operadores(self):
        self.__modelo_plan.operadores()
        
        
    def S(self):
        return self.__S
    
    
    def A(self, estado):
        return self.__A
        
        
    def T(self, s, a):
        sn = a.aplicar(s)
        if (sn):
            return [(1, sn)]
        return []
        
    def R(self, s, a, sn):
        if sn is not None: 
            if(sn in self.__objectivos):
                return (- a.custo(s, sn) + self.r_max)
            return a.custo(s, sn)
        
        
        
        