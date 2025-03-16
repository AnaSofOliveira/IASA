package project_java.tp2.PlaneadorTrajetos.pee.modprob;



/**
 * Defini��o geral da funcionalidade de um operador
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
	 * Custo de aplica��o do operador
	 * @param 	estado		Estado antecessor
	 * @param 	estadoSuc	Estado sucessor
	 * @return				Custo de aplica��o do operador	
	 */
	float custo(Estado estado, Estado estadoSuc);
}
