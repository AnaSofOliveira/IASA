package project_java.tp2.PlaneadorTrajetos.pee.modprob;



/**
 * Definição geral da funcionalidade de um operador
 */
public interface Operador
{
	/**
	 * Aplicar operador a estado gerando um novo estado
	 * @param 	estado	Estado a aplicar operador
	 * @return			Novo estado
	 */
	Estado aplicar(Estado estado);

	/**
	 * Custo de aplicação do operador
	 * @param 	estado		Estado antecessor
	 * @param 	estadoSuc	Estado sucessor
	 * @return				Custo de aplicação do operador	
	 */
	float custo(Estado estado, Estado estadoSuc);
}
