package project_java.tp2.PlaneadorTrajetos.plantraj.modprob;

import project_java.tp2.PlaneadorTrajetos.pee.modprob.Estado;

/**
 * Estado representante de localidade
 */
public class EstadoLocalidade extends Estado
{
	private String localidade;

	public EstadoLocalidade(String localidade) {
		this.localidade = localidade;
	}

	@Override
	public int hashCode() {
		return localidade.hashCode();
	}
	
	@Override
	public String toString() {
		return localidade;
	}
}
