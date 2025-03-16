package PlaneadorTrajetos.plantraj.modprob;

import PlaneadorTrajetos.pee.Estado;
import PlaneadorTrajetos.pee.Problema;

public class ProblemaTrajecto extends Problema{
	
	public EstadoLocalidade estadoFinal;
	
	public ProblemaTrajecto(String localidadeInicial, String localidadeFinal, OperadorLigacao[] operadores) { 
		super(operadores, new EstadoLocalidade(localidadeInicial)); 
		estadoFinal = new EstadoLocalidade(localidadeFinal);
		
	}
	
	@Override
	public boolean objectivo(Estado estado) {
		return estado.equals(estadoFinal);
	}
}


