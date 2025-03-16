package plantraj.modprob;

import pee.modprob.Estado;

public class EstadoLocalidade extends Estado{
	
	private String localidade;
	
	/*
	 * Cria um novo objeto EstadoLocalidade que representa
	 * uma determinada localidade no Planeador de Trajetos
	 * 
	 * @param String localidade - nome da localidade 
	 */
	public EstadoLocalidade(String localidade) {
		this.localidade = localidade;
	}


	/*
	 * @see java.lang.Object#toString()
	 * 
	 * @return String localidade - nome da localidade que caracteriza o objeto
	 */
	public String toString() {
		return this.localidade;
	}	
	
	
	/*
	 * @see pee.modprob.Estado#hashCode()
	 * 
	 * Concretiza a implementação da função supra para o domínio do problema
	 * 
	 * @return int hashCode
	 */
	@Override
	public int hashCode() {
		return this.localidade.hashCode();
	}

}
