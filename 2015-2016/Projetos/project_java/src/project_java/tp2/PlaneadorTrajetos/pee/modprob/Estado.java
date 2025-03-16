package project_java.tp2.PlaneadorTrajetos.pee.modprob;

/**
 * Defini��o geral de estado
 */
public abstract class Estado
{
	@Override
	public boolean equals(Object obj) {
		// Verifica��o de igualdade de valor (atrav�s da defini��o de hashCode)
		return hashCode() == obj.hashCode();
	}
	
	@Override
	public abstract int hashCode();
}
