'''
Created on May 24, 2019

@author: anaso
'''
from aprend_ref.aprend_ref import AprendRef

class AprendQ(AprendRef):


    def __init__(self, mem_aprend, sel_accao, alpha, gama):
        super().__init__(mem_aprend, sel_accao)
        self.__alpha = alpha
        self.__gama = gama
        
        
    def aprender(self, s, a, r, sn):
        
        # Obtem a ação maximizada para o estado sn 
        an = self._sel_accao.max_accao(sn)
        
        #Obtém o valor de Q(s,a) para o estado s através da acção a
        Qs_a = self._mem_aprend.obter(s, a)
        
        #Obtém o valor de Q(s,a) para o estado sn através da acção an
        Qsn_an = self._mem_aprend.obter(sn, an)
        
        #Calcula a expressão Q-Learning
        Q = Qs_a + self.__alpha*( r + self.__gama*Qsn_an - Qs_a)
        
        #atualiza na memória de aprendizagem os valores de Q(s, a)
        self._mem_aprend.actualizar(s, a, Q)
        