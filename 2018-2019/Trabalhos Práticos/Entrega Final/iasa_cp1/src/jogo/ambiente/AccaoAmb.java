	package jogo.ambiente;

import jogo.reaccao.Accao;

public enum AccaoAmb implements Accao{
	PATRULHAR, APROXIMAR, AVISAR, DEFENDER, ATACAR, PROCURAR, INICIAR;

	@Override
	public void executar() {
		
	}
}
