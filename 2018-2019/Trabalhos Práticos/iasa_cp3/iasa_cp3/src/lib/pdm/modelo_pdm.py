'''
Created on 17/05/2019

@author: Ana Oliveira
'''

class ModeloPDM:

    def S(self):
        raise NotImplementedError("Abstract")        
    
    
    def A(self, estado):
        raise NotImplementedError("Abstract")
        
        
    def T(self, s, a):
        raise NotImplementedError("Abstract")
        
        
    def R(self, s, a, sn):
        raise NotImplementedError("Abstract")
        
        
        