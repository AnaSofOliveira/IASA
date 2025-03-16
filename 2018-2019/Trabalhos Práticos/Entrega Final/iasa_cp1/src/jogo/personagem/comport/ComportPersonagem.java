package jogo.personagem.comport;

import jogo.ambiente.EventoAmb;
import jogo.maquest.Estado;
import jogo.maquest.MaquinaEstados;
import jogo.reaccao.ComportMaqEst;
import jogo.reaccao.Estimulo;

public class ComportPersonagem extends ComportMaqEst{

	@Override
	protected MaquinaEstados<Estimulo> iniciar() {
		
		Estado<Estimulo> patrulha = new Estado<Estimulo>("Patrulhar");
		Estado<Estimulo> combate = new Estado<Estimulo>("Combater");
		Estado<Estimulo> defesa = new Estado<Estimulo>("Defender");
		Estado<Estimulo> inspeccao = new Estado<Estimulo>("Inspeccionar");
		
		patrulha
			.transicao(EventoAmb.RUIDO, inspeccao)
			.transicao(EventoAmb.INIMIGO, defesa)
			.transicao(EventoAmb.SILENCIO, patrulha);
		
		inspeccao
			.transicao(EventoAmb.SILENCIO, patrulha)
			.transicao(EventoAmb.RUIDO, inspeccao)
			.transicao(EventoAmb.INIMIGO, defesa);

		defesa
			.transicao(EventoAmb.FUGA, inspeccao)
			.transicao(EventoAmb.INIMIGO, combate);
		
		combate
			.transicao(EventoAmb.FUGA, patrulha)
			.transicao(EventoAmb.VITORIA, patrulha)
			.transicao(EventoAmb.DERROTA, patrulha)
			.transicao(EventoAmb.INIMIGO, combate);
		
		comport(patrulha, new Patrulhar());
		comport(inspeccao, new Inspeccionar());
		comport(defesa, new Defender());
		comport(combate, new Combater());
		
		return new MaquinaEstados<Estimulo>(patrulha);
	}
	
	
}
