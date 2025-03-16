package plantraj.modprob;

import pee.modprob.Estado;
import pee.modprob.Operador;

public class OperadorLigacao implements Operador{
	
	private EstadoLocalidade estadoOrigem;
	private EstadoLocalidade estadoDestino;
	private int custo;
	
	/*
	 * Cria um objeto OperadorLigacao que representa o trajeto
	 * entre duas localidades e tem um custo de deslocacao associado
	 * 
	 * @param String locIni - Localidade Inicial
	 * @param String locFin - Localidade Final
	 * @param int Custo - Custo da deslocação 
	 */
	public OperadorLigacao(String locIni, String locFin, int custo){
		this.estadoOrigem = new EstadoLocalidade(locIni);
		this.estadoDestino = new EstadoLocalidade(locFin);
		this.custo = custo;
	}

	
	/*
	 * @see pee.modprob.Operador#aplicar(pee.modprob.Estado)
	 * 
	 * Concretiza a implementação da função supra para o domínio do problema
	 * 
	 * @param Estado estado - estado a ser aplicado
	 *  
	 * @return Estado estadoDestino - @param == estadoDestino do OperadorLigação
	 * @return null - @param != estadoDestino do OperadorLigação
	 */
	@Override
	public Estado aplicar(Estado estado) {
		if (estado.equals(estadoOrigem)) {
			return this.estadoDestino;
		}return null;
	}
	
	
	/*
	 * @see pee.modprob.Operador#custo(pee.modprob.Estado, pee.modprob.Estado)
	 * 
	 * Concretiza a implementação da função supra para o domínio do problema
	 * 
	 * @param Estado estado - estado origem
	 * @param Estado estadoSuc - estado sucessor
	 * 
	 * @return int custo - Custo da aplicação do operador
	 */
	@Override
	public float custo(Estado estado, Estado estadoSuc) {
		return this.custo;
	}


}
