package pee.modprob;

public abstract class Estado {
	
	public boolean equals(Object obj) {
		// funcionalidade de compara��o de 2 objetos
		if (obj instanceof Estado) {
			return this.hashCode() == obj.hashCode();
		}return false;
	}
	
	// Entidade por valor
	public abstract int hashCode();

}
