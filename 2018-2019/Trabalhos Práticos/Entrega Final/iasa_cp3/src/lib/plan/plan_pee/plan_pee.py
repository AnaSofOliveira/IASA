'''
Created on 03/05/2019

@author: Ana Oliveira
'''
from plan.plan_pee.problema_plan import ProblemaPlan
from plan.planeador import Planeador


class PlanPEE (Planeador):

    def __init__(self, mec_pee):
        self.__mec_pee = mec_pee
        self.__plano = None

    def planear(self, modelo_plan, estado_inicial, objectivos):
        # Definir o objectivo
        # Definir os operadores
        # Definir o problema 
        
        # Resolver o problema atrav�s do mecanismo de procura : Solu��o
        
        # Validar se existe solu��o
            # Se existe: O plano = pr�ximas ac��es a serem tomadas (NOTA: o n� raiz n�o tem operador na solucao)
            
        objectivo = objectivos[0] 
        operadores = modelo_plan.operadores()
        problema = ProblemaPlan(estado_inicial, objectivo, operadores)
        
        solucao = self.__mec_pee.resolver(problema)
        
        if(solucao):
            self.__plano = [passo.operador for passo in solucao[1:]]
                
    
    def obter_accao(self, estado):
        if(self.__plano):
            return self.__plano.pop(0).accao
        

    def plano_pendente(self):
        # existe plano pendente quando exista plano com elementos
        return (self.__plano)


    def terminar_plano(self):
        self.__plano = None
        
    def mostrar(self, vis, estado):
        vis.campo(self.__mec_pee.obter_explorados())
        vis.plano(estado, self.__plano)
        vis.marcar([estado], linha = 1)
