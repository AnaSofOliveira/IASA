package PlaneadorTrajetos.plantraj.modprob;

import PlaneadorTrajetos.pee.Estado;

public class EstadoLocalidade extends Estado{
	public String localidade;
	
	public EstadoLocalidade(String localidade) {
		this.localidade = localidade;
	}
	
	@Override
	public int hashCode(){
		return localidade.hashCode();
	}
	
	@Override
	public String toString() {
		return localidade;
	}
	
	
	
}
