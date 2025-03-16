'''
Created on 03/05/2019

@author: Ana Oliveira
'''
from pee.modprob.operador import Operador
from psa.accao import Avancar
from psa.elementos import ALVO, VAZIO
from psa.util import mover, dist


class OperadorMover(Operador):

    def __init__(self, modelo_mundo, ang):
        self._modelo_mundo = modelo_mundo
        self.___ang = ang
        self.__accao = Avancar(self.___ang)
        
    def aplicar(self, estado):
        # Criar o novo estado --> psa.util.mover(pos, ang) -> nova posicao
        # Validar qual o elemento no novo estado. 
        # Se elemento vazio ou alvo: 
            # return novo estado --> Elemento dentro do modelo do mundo e numa posi��o para onde pode avan�ar
        # se n�o for: return None --> N�o � poss�vel aplicar o operador

        novo_estado = mover(estado, self.___ang)
        elemento = self._modelo_mundo.obter_elem(novo_estado)
        if (elemento in [VAZIO, ALVO]):
            return novo_estado
        return None
        
        
    def custo(self, estado, novo_estado):
        # psa.util.dist(posini, posfin) -> distancia euclidiana
        # max(distancia, min) -> maximo entre distancia e min
            # Se distancia < 1: retorna 1
            # Se distancia > 1: retorna distancia
            # Se n�o houver distancia: return None
        distancia = dist(estado, novo_estado)
        return max(distancia, 1) 

        
    @property
    def accao(self):
        return self.__accao
        
        