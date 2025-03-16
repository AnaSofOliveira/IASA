package PlaneadorTrajetos.plantraj.modprob;

import PlaneadorTrajetos.pee.Estado;
import PlaneadorTrajetos.pee.Operador;

public class OperadorLigacao implements Operador{
	
	//private float custo;
	private EstadoLocalidade estadoOrigem;
	private EstadoLocalidade estadoDestino;
	
	public OperadorLigacao(String localidadeOrigem,String localidadeDestino,float custo){
		estadoOrigem = new EstadoLocalidade(localidadeOrigem);
		estadoDestino = new EstadoLocalidade(localidadeDestino);
		//this.custo = custo;
	}

	@Override
	public Estado aplicar(Estado estado) {
		if(estado.equals(estadoOrigem)){
			return estadoDestino;
		} return null;
	}
}
