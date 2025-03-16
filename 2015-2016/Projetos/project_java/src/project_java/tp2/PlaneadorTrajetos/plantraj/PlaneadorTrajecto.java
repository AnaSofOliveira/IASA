package project_java.tp2.PlaneadorTrajetos.plantraj;

import project_java.tp2.PlaneadorTrajetos.pee.PassoSolucao;
import project_java.tp2.PlaneadorTrajetos.pee.Procura;
import project_java.tp2.PlaneadorTrajetos.pee.Solucao;
import project_java.tp2.PlaneadorTrajetos.pee.prof.ProcuraProf;
import project_java.tp2.PlaneadorTrajetos.plantraj.modprob.OperadorLigacao;
import project_java.tp2.PlaneadorTrajetos.plantraj.modprob.ProblemaPlanTraj;

/**
 * Planeador de trajecto com base em ligações entre localidades
 */
public class PlaneadorTrajecto
{
	public static void main( String[] args )
	{
		// Definir operadores
		OperadorLigacao[] operadores = definirOperadores();
		
		// Definir problema	
		ProblemaPlanTraj problema = new ProblemaPlanTraj("loc4", "loc6", operadores);
			
		// Procurar solução
		Procura mecProcura = new ProcuraProf();
		Solucao solucao = mecProcura.resolver(problema);

		// Mostrar trajecto correspondente à solução
		mostrarTrajecto(solucao);
	}

	/**
	 * Definir operadores de ligação entre localidades
	 * @return operadores definidos
	 */
	private static OperadorLigacao[] definirOperadores() {
		OperadorLigacao[] operadores = {
				new OperadorLigacao("loc0", "loc2", 25),
				new OperadorLigacao("loc0", "loc1", 5),
				new OperadorLigacao("loc1", "loc3", 12),
				new OperadorLigacao("loc1", "loc6", 5),
				new OperadorLigacao("loc2", "loc4", 30),
				new OperadorLigacao("loc3", "loc2", 10),
				new OperadorLigacao("loc3", "loc5", 5),
				new OperadorLigacao("loc4", "loc3", 2),
				new OperadorLigacao("loc5", "loc6", 8),
				new OperadorLigacao("loc5", "loc4", 10),
				new OperadorLigacao("loc6", "loc3", 15) };
		return operadores;
	}

	/**
	 * Mostrar trajecto
	 * @param solucao	Solução da procura de trajecto
	 */
	private static void mostrarTrajecto(Solucao solucao) {
		if(solucao != null) {
			System.out.printf("Trajecto:\n");
			for(PassoSolucao no : solucao)
				System.out.print(" >> " + no.getEstado());
		}
		else
			System.out.println("Trajecto não encontrado");
	}
}
