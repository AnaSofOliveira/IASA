'''
Created on 17/05/2019

@author: Ana Oliveira
'''

class PDM:

    def __init__(self, gama, delta_max):
        self.__gama = gama
        self.__delta_max = delta_max
        
    
    def utilidade(self, modelo):

        S = modelo.S()
        A = modelo.A(S)
        
        U = {s: 0 for s in S}
        
        while True: 
            Uant = U.copy()
            delta = 0
            
            for s in S:
                U[s] = max(self.util_accao(s, a, Uant, modelo) for a in A)
                delta = max(delta, abs(U[s] - Uant[s]))
            
            if delta < self.__delta_max:
                break 

        return U
            
    
    def util_accao(self, s, a, U, modelo):
        
        soma = 0
        for (prob, sn) in modelo.T(s, a):
            
            
            R = modelo.R(s, a, sn)
            Usn = U[sn]
            soma  = soma + (prob*(R + self.__gama*Usn))
        return (soma)
        
        
    def politica(self, U, modelo):
        #para cada estado no conjunto de estados. A politica � a acao que maximiza a utilidade da a��o para aquele estado
        S = modelo.S()
        A = modelo.A(S)
        politica = {}
        
        for s in S:
            politica[s] = max(A, key = lambda a: self.util_accao(s, a, U, modelo))
        
        return politica
        
        
    def resolver(self, modelo):
        utilidade = self.utilidade(modelo)
        pol = self.politica(utilidade, modelo)
        
        return utilidade, pol
        
        
        
        
        
        
        
        
        
        
        
        