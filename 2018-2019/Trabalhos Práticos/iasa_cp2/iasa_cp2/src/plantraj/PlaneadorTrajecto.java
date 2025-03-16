package plantraj;

import java.util.Scanner;

import pee.PassoSolucao;
import pee.Solucao;
import pee.melhorprim.ProcuraCustoUnif;
import pee.prof.ProcuraProf;
import plantraj.modprob.OperadorLigacao;
import plantraj.modprob.ProblemaPlanTraj;

public class PlaneadorTrajecto {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		// Receber Localicações
		System.out.println("Indique a localidade origem...");
		String locIni = scanner.next();
		
		System.out.println("Indique a localidade destino...");
		String locFin = scanner.next();
		
		System.out.println("Quer a viagem mais barata ou mais curta? Insira 'b' para mais barata ou 'c' para mais curta.");
		String custo = scanner.next();
		
		scanner.close();
		
		// Criar operadores
		OperadorLigacao[] operadores = definirOperadores();
		
		
		// Definir problema
		ProblemaPlanTraj problema = new ProblemaPlanTraj(locIni, locFin, operadores);
		
		if(custo.equals("b")) {
			ProcuraCustoUnif mecProcura = new ProcuraCustoUnif();
			
			Solucao solucao = mecProcura.resolver(problema);
			
			mostrarTrajecto(solucao);
			
		}else if (custo.contentEquals("c")){
			// instanciar mecanismo de procurar e depois fazer resolver
			ProcuraProf mecProcura = new ProcuraProf();
			//ProcuraProf mecProcura = new ProcProfIter(1);
			
			Solucao solucao = mecProcura.resolver(problema);
			
			mostrarTrajecto(solucao);
			
		}else {
			System.out.println("Não inseriu uma restrição à procura válida.");
		}
		
	}
	 
	
	/*
	 * Define os OperadoresLigação a serem usados no domínio do problema
	 * 
	 * @return OperadoresLigação[] - Operadores
	 */
	private static OperadorLigacao [] definirOperadores() {
		
		return new OperadorLigacao[] {
				new OperadorLigacao("Loc-0", "Loc-1", 5),
				new OperadorLigacao("Loc-0", "Loc-2", 25),
				new OperadorLigacao("Loc-1", "Loc-3", 12),
				new OperadorLigacao("Loc-1", "Loc-6", 5),
				new OperadorLigacao("Loc-2", "Loc-4", 30),
				new OperadorLigacao("Loc-3", "Loc-2", 10),
				new OperadorLigacao("Loc-3", "Loc-5", 5),
				new OperadorLigacao("Loc-4", "Loc-3", 2),
				new OperadorLigacao("Loc-5", "Loc-6", 8),
				new OperadorLigacao("Loc-5", "Loc-4", 10),
				new OperadorLigacao("Loc-6", "Loc-3", 15)
		};
	}

	
	/*
	 * Printa o trajeto obtido para chegar à Solução
	 * 
	 * @param Solucao solucao - solução do problema 
	 */
	private static void mostrarTrajecto(Solucao solucao) {
		
		if(solucao != null) {
			System.out.printf("Trajecto:\n");
			for(PassoSolucao no : solucao)
				System.out.print(" >> " + no.getEstado());
			System.out.println("\n");
		}
		else {
			System.out.println("Trajecto não encontrado\n");
		}
	}
	
}
