package project_java.tp2.Puzzle.puzzle;

import project_java.tp2.Puzzle.pee.Solucao;
import project_java.tp2.Puzzle.pee.larg.ProcuraLarg;
import project_java.tp2.Puzzle.pee.melhorprim.ProcuraCustoUnif;
import project_java.tp2.Puzzle.pee.prof.ProcuraProf;
import project_java.tp2.Puzzle.pee.prof.ProcuraProfIter;
import project_java.tp2.Puzzle.puzzle.modprob.EstadoPuzzle;
import project_java.tp2.Puzzle.puzzle.modprob.OperadorMoverPosVazia;
import project_java.tp2.Puzzle.puzzle.modprob.ProblemaPuzzle;
import puzzle.Puzzle;
import puzzle.Puzzle.Movimento;

public class resPuzzle {

	public static OperadorMoverPosVazia[] definirOperadores() {
		OperadorMoverPosVazia[] operadores = { new OperadorMoverPosVazia(Movimento.CIMA),
				new OperadorMoverPosVazia(Movimento.BAIXO), new OperadorMoverPosVazia(Movimento.ESQ),
				new OperadorMoverPosVazia(Movimento.DIR) };
		return operadores;
	}

	public static void mostrarConfigurações() {

	}

	public static void main(String[] args) {
		OperadorMoverPosVazia[] operadores = definirOperadores();

		// PUZZLE FINAL - OBJETIVO
		int[][] configFinal = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 0 } };
		Puzzle puzzleFinal = new Puzzle(configFinal);

		
		
		
		/**
		 * CONFIGURAÇÃO A
		 */

		// PUZZLE - ESTADO INICIAL
		int[][] configInicialA = { { 1, 2, 3 }, { 8, 4, 5 }, { 6, 7, 0 } };
		Puzzle puzzleInicialA = new Puzzle(configInicialA);

		
		// PROBLEMA
		ProblemaPuzzle problemaA = new ProblemaPuzzle(puzzleInicialA, puzzleFinal, operadores);

		
		// PROCURA EM LARGURA
		ProcuraLarg procLarg = new ProcuraLarg();
		Solucao solucaoALarg = procLarg.resolver(problemaA);

		// PROCURA EM PROFUNDIDADE
		ProcuraProf procProf = new ProcuraProf();
		Solucao solucaoAProf = procProf.resolver(problemaA);
		
		// PROCURA EM PROFUNDIDADE ITERATIVA
		ProcuraProfIter procProfIter = new ProcuraProfIter();
		Solucao solucaoAProfIter = procProfIter.resolver(problemaA);
		
		// PROCURA DE CUSTO UNIFORME
		ProcuraCustoUnif<EstadoPuzzle> procCustUnif = new ProcuraCustoUnif<EstadoPuzzle>();
		Solucao solucaoAProfCustUnif = procCustUnif.resolver(problemaA);
		

		// ANÁLISES
		System.out.println("ANÁLISES PUZZLE A \n");
		
		System.out.println("PESQUISA POR LARGURA:");
		System.out.println("Custo da Solução (Número de Movimentos): " + (int) solucaoALarg.getCusto());
		System.out.println("Complexidade Espacial (Número Máximo de Nós na Fronteira de Exploração): " + procLarg.getMemoriaProcura().getNumMaxNosFronteira());
		System.out.println("Complexidade Temporal (Número de Nós Expandidos): " + procLarg.getMemoriaProcura().getNumEstadosExplorados() + "\n");

		System.out.println("PESQUISA POR PROFUNDIDADE:");
		System.out.println("Custo da Solução (Número de Movimentos): " + (int) solucaoAProf.getCusto());
		System.out.println("Complexidade Espacial (Número Máximo de Nós na Fronteira de Exploração): " + procProf.getMemoriaProcura().getNumMaxNosFronteira());
		System.out.println("Complexidade Temporal (Número de Nós Expandidos): " + procProf.getMemoriaProcura().getNumEstadosExplorados() + "\n");
		
		System.out.println("PESQUISA POR PROFUNDIDADE ITERATIVA:");
		System.out.println("Custo da Solução (Número de Movimentos): " + (int) solucaoAProfIter.getCusto());
		System.out.println("Complexidade Espacial (Número Máximo de Nós na Fronteira de Exploração): " + procProfIter.getMemoriaProcura().getNumMaxNosFronteira());
		System.out.println("Complexidade Temporal (Número de Nós Expandidos): " + procProfIter.getMemoriaProcura().getNumEstadosExplorados() + "\n");
		
		System.out.println("PESQUISA POR CUSTO UNIFORME:");
		System.out.println("Custo da Solução (Número de Movimentos): " + (int) solucaoAProfCustUnif.getCusto());
		System.out.println("Complexidade Espacial (Número Máximo de Nós na Fronteira de Exploração): " + procCustUnif.getMemoriaProcura().getNumMaxNosFronteira());
		System.out.println("Complexidade Temporal (Número de Nós Expandidos): " + procCustUnif.getMemoriaProcura().getNumEstadosExplorados() + "\n");
		
		System.out.println(" ");
		
		/**
		 * CONFIGURAÇÃO B
		 */

		// PUZZLE INICIAL - ESTADO INICIAL
		int[][] configInicialB = { { 8, 4, 5 }, { 6, 1, 2 }, { 3, 7, 0 } };
		Puzzle puzzleInicialB = new Puzzle(configInicialB);

		
		// PROBLEMA
		ProblemaPuzzle problemaB = new ProblemaPuzzle(puzzleInicialB, puzzleFinal, operadores);

		
		// PROCURA EM LARGURA
		Solucao solucaoBLarg = procLarg.resolver(problemaB);
		
		// PROCURA EM PROFUNDIDADE
		Solucao solucaoBProf = procProf.resolver(problemaB);
		
		// PROCURA EM PROFUNDIDADE ITERATIVA
		Solucao solucaoBProfIter = procProf.resolver(problemaB);
		
		// PROCURA DE CUSTO UNIFORME
		Solucao solucaoBProfCustUnif = procCustUnif.resolver(problemaA);
		
		
		// ANÁLISES
		System.out.println("ANÁLISES PUZZLE B \n");
		
		System.out.println("PESQUISA POR LARGURA:");
		System.out.println("Custo da Solução (Número de Movimentos): " + (int) solucaoBLarg.getCusto());
		System.out.println("Complexidade Espacial (Número Máximo de Nós na Fronteira de Exploração): " + procProf.getMemoriaProcura().getNumMaxNosFronteira());
		System.out.println("Complexidade Temporal (Número de Nós Expandidos): " + procProf.getMemoriaProcura().getNumEstadosExplorados() + "\n");

		System.out.println("PESQUISA POR PROFUNDIDADE:");
		System.out.println("Custo da Solução (Número de Movimentos): " + (int) solucaoBProf.getCusto());
		System.out.println("Complexidade Espacial (Número Máximo de Nós na Fronteira de Exploração): " + procProf.getMemoriaProcura().getNumMaxNosFronteira());
		System.out.println("Complexidade Temporal (Número de Nós Expandidos): " + procProf.getMemoriaProcura().getNumEstadosExplorados() + "\n");
		
		System.out.println("PESQUISA POR PROFUNDIDADE ITERATIVA:");
		System.out.println("Custo da Solução (Número de Movimentos): " + (int) solucaoBProfIter.getCusto());
		System.out.println("Complexidade Espacial (Número Máximo de Nós na Fronteira de Exploração): " + procProfIter.getMemoriaProcura().getNumMaxNosFronteira());
		System.out.println("Complexidade Temporal (Número de Nós Expandidos): " + procProfIter.getMemoriaProcura().getNumEstadosExplorados() + "\n");
		
		System.out.println("PESQUISA POR CUSTO UNIFORME:");
		System.out.println("Custo da Solução (Número de Movimentos): " + (int) solucaoBProfCustUnif.getCusto());
		System.out.println("Complexidade Espacial (Número Máximo de Nós na Fronteira de Exploração): " + procCustUnif.getMemoriaProcura().getNumMaxNosFronteira());
		System.out.println("Complexidade Temporal (Número de Nós Expandidos): " + procCustUnif.getMemoriaProcura().getNumEstadosExplorados() + "\n");
		
	}

}
