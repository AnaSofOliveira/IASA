package project_java.tp2.PlaneadorTrajetos.plantraj.modprob;

import project_java.tp2.PlaneadorTrajetos.pee.modprob.Estado;
import project_java.tp2.PlaneadorTrajetos.pee.modprob.Operador;

public class OperadorLigacao implements Operador
{
	/** Estado origem da ligação */
	private EstadoLocalidade estadoOrigem;
	/** Estado destino da ligação */
	private EstadoLocalidade estadoDestino;
	/** Custo da ligação */
	private int custoLigacao;
	
	/**
	 * Construtor
	 * @param locIni	Localidade inicial
	 * @param locFin	Localidade final
	 */
	public OperadorLigacao(String locIni, String locFin, int custo)
	{
		this.estadoOrigem = new EstadoLocalidade(locIni);
		this.estadoDestino = new EstadoLocalidade(locFin);
		this.custoLigacao = custo;
	}

	@Override
	public Estado aplicar(Estado estado) {
		if(estado.equals(estadoOrigem))
			return estadoDestino;
		return null;
	}

	@Override
	public float custo(Estado estado, Estado estado_suc) {
		return custoLigacao;
	}
}
