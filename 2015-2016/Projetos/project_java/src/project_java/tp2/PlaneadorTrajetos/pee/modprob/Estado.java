package project_java.tp2.PlaneadorTrajetos.pee.modprob;

/**
 * Definição geral de estado
 */
public abstract class Estado
{
	@Override
	public boolean equals(Object obj) {
		// Verificação de igualdade de valor (através da definição de hashCode)
		return hashCode() == obj.hashCode();
	}
	
	@Override
	public abstract int hashCode();
}
