'''
Created on 26/04/2019

@author: Ana Oliveira
'''
from controlo_react.reaccoes.aproximar_dir import AproximarDir
from ecr.prioridade import Prioridade
from psa.actuador import ESQ, DIR, FRT


class Aproximar(Prioridade):

    def __init__(self):
        super().__init__([AproximarDir(ESQ),AproximarDir(DIR),AproximarDir(FRT)])