package Puzzle.puzzle;

import Puzzle.pee.larg.ProcLarg;
import Puzzle.pee.mecproc.MecanismoProcura;
import Puzzle.pee.mecproc.No;
import Puzzle.pee.mecproc.Solucao;
import Puzzle.pee.melhorprim.ProcAA;
import Puzzle.pee.melhorprim.ProcCustoUnif;
import Puzzle.pee.melhorprim.ProcSofrega;
import Puzzle.pee.modprob.Problema;
import Puzzle.pee.prof.ProcProf;
import Puzzle.pee.prof.ProcProfIter;
import Puzzle.puzzle.modprob.EstadoPuzzle;
import Puzzle.puzzle.modprob.OperadorMoverPosVazia;
import Puzzle.puzzle.modprob.ProblemaPuzzle;
import puzzle.Puzzle;


public class resPuzzle {

	public static void main (String[] args){
		
		OperadorMoverPosVazia[] movimentos = definirMovimentos();
		
		int[][] confPuzzleA = { { 1, 2, 3 }, { 8, 4, 5 }, { 6, 7, 0 } };
		Puzzle puzzleA = new Puzzle(confPuzzleA);
		
		int[][] confPuzzleB = { { 8, 4, 5 }, { 6, 1, 2 }, { 3, 7, 0 } };
		Puzzle puzzleB = new Puzzle(confPuzzleB);

		int[][] confPuzzleFinal = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 0 } };
		Puzzle puzzleFin = new Puzzle(confPuzzleFinal);
		
		
		// ANALISE DE PUZZLE A PARA PUZZLE FINAL
		ProblemaPuzzle A_problema = new ProblemaPuzzle(puzzleA, puzzleFin, movimentos);
		
		ProcLarg<EstadoPuzzle> A_mecProcLarg = new ProcLarg<EstadoPuzzle>();
		ProcProf<EstadoPuzzle> A_mecProcProf = new ProcProf<EstadoPuzzle>();
		ProcProfIter<EstadoPuzzle> A_mecProcProfIter = new ProcProfIter<EstadoPuzzle>();
		ProcCustoUnif<EstadoPuzzle> A_mecProcCustoUnif = new ProcCustoUnif<EstadoPuzzle>();
		ProcSofrega<EstadoPuzzle> A_mecProcSofrega = new ProcSofrega<EstadoPuzzle>();
		ProcAA<EstadoPuzzle> A_mecProcAA = new ProcAA<EstadoPuzzle>();
		
		Solucao<EstadoPuzzle> A_solucaoLarg = A_mecProcLarg.procurar(A_problema);
		Solucao<EstadoPuzzle> A_solucaoProf = A_mecProcProf.procurar(A_problema);
		Solucao<EstadoPuzzle> A_solucaoProfIter = A_mecProcProfIter.procurar(A_problema);
		Solucao<EstadoPuzzle> A_solucaoCustoUnif = A_mecProcCustoUnif.procurar(A_problema);
		Solucao<EstadoPuzzle> A_solucaoSofrega = A_mecProcSofrega.procurar(A_problema);
		Solucao<EstadoPuzzle> A_solucaoAA = A_mecProcAA.procurar(A_problema);
		
		
		System.out.println("DE A PARA FINAL:");
		
		System.out.println("Configurações de Pesquisa em Largura:");
		mostrarConfiguracoes(A_solucaoLarg);
		System.out.printf("Número Máximo Nós na Fronteira: %d\n", A_mecProcLarg.nroMaxFront);
		System.out.printf("Número de Nós Expandidos: %d\n", A_mecProcLarg.nroExpacoes);
		System.out.println();
		
		System.out.println("Configurações de Pesquisa em Profundidade:");
		mostrarConfiguracoes(A_solucaoProf);
		System.out.printf("Número Máximo Nós na Fronteira: %d\n", A_mecProcProf.nroMaxFront);
		System.out.printf("Número de Nós Expandidos: %d\n", A_mecProcProf.nroExpacoes);
		System.out.println();
		
		System.out.println("Configurações de Pesquisa em Profundidade Iterativa:");
		mostrarConfiguracoes(A_solucaoProfIter);
		System.out.printf("Número Máximo Nós na Fronteira: %d\n", A_mecProcProfIter.nroMaxFront);
		System.out.printf("Número de Nós Expandidos: %d\n", A_mecProcProfIter.nroExpacoes);
		System.out.println();
		
		System.out.println("Configurações de Pesquisa de Custo Uniforme:");
		mostrarConfiguracoes(A_solucaoCustoUnif);
		System.out.printf("Número Máximo Nós na Fronteira: %d\n", A_mecProcCustoUnif.nroMaxFront);
		System.out.printf("Número de Nós Expandidos: %d\n", A_mecProcCustoUnif.nroExpacoes);
		System.out.println();
		
		System.out.println("Configurações de Pesquisa Sofrega:");
		mostrarConfiguracoes(A_solucaoSofrega);
		System.out.printf("Número Máximo Nós na Fronteira: %d\n", A_mecProcSofrega.nroMaxFront);
		System.out.printf("Número de Nós Expandidos: %d\n", A_mecProcSofrega.nroExpacoes);
		System.out.println();
		
		System.out.println("Configurações de Pesquisa AA:");
		mostrarConfiguracoes(A_solucaoAA);
		System.out.printf("Número Máximo Nós na Fronteira: %d\n", A_mecProcAA.nroMaxFront);
		System.out.printf("Número de Nós Expandidos: %d\n", A_mecProcAA.nroExpacoes);
		System.out.println();
		
		
		// ANALISE DE PUZZLE B PARA PUZZLE FINAL
		
		ProblemaPuzzle B_problema = new ProblemaPuzzle(puzzleA, puzzleFin, movimentos);
		
		ProcLarg<EstadoPuzzle> B_mecProcLarg = new ProcLarg<EstadoPuzzle>();
		ProcProf<EstadoPuzzle> B_mecProcProf = new ProcProf<EstadoPuzzle>();
		ProcProfIter<EstadoPuzzle> B_mecProcProfIter = new ProcProfIter<EstadoPuzzle>();
		ProcCustoUnif<EstadoPuzzle> B_mecProcCustoUnif = new ProcCustoUnif<EstadoPuzzle>();
		ProcSofrega<EstadoPuzzle> B_mecProcSofrega = new ProcSofrega<EstadoPuzzle>();
		ProcAA<EstadoPuzzle> B_mecProcAA = new ProcAA<EstadoPuzzle>();
		
		Solucao<EstadoPuzzle> B_solucaoLarg = B_mecProcLarg.procurar(B_problema);
		Solucao<EstadoPuzzle> B_solucaoProf = B_mecProcProf.procurar(B_problema);
		Solucao<EstadoPuzzle> B_solucaoProfIter = B_mecProcProfIter.procurar(B_problema);
		Solucao<EstadoPuzzle> B_solucaoCustoUnif = B_mecProcCustoUnif.procurar(B_problema);
		Solucao<EstadoPuzzle> B_solucaoSofrega = B_mecProcSofrega.procurar(B_problema);
		Solucao<EstadoPuzzle> B_solucaoAA = B_mecProcAA.procurar(B_problema);
		
		
		System.out.println("DE B PARA FINAL:");

		System.out.println("Configurações de Pesquisa em Largura:");
		mostrarConfiguracoes(B_solucaoLarg);
		System.out.printf("Número Máximo Nós na Fronteira: %d\n", B_mecProcLarg.nroMaxFront);
		System.out.printf("Número de Nós Expandidos: %d\n", B_mecProcLarg.nroExpacoes);
		System.out.println();
		
		System.out.println("Configurações de Pesquisa em Profundidade:");
		mostrarConfiguracoes(B_solucaoProf);
		System.out.printf("Número Máximo Nós na Fronteira: %d\n", B_mecProcProf.nroMaxFront);
		System.out.printf("Número de Nós Expandidos: %d\n", B_mecProcProf.nroExpacoes);
		System.out.println();
		
		System.out.println("Configurações de Pesquisa em Profundidade Iterativa:");
		mostrarConfiguracoes(B_solucaoProfIter);
		System.out.printf("Número Máximo Nós na Fronteira: %d\n", B_mecProcProfIter.nroMaxFront);
		System.out.printf("Número de Nós Expandidos: %d\n", B_mecProcProfIter.nroExpacoes);
		System.out.println();
		
		System.out.println("Configurações de Pesquisa de Custo Uniforme:");
		mostrarConfiguracoes(B_solucaoCustoUnif);
		System.out.printf("Número Máximo Nós na Fronteira: %d\n", B_mecProcCustoUnif.nroMaxFront);
		System.out.printf("Número de Nós Expandidos: %d\n", B_mecProcCustoUnif.nroExpacoes);
		System.out.println();
		
		System.out.println("Configurações de Pesquisa Sofrega:");
		mostrarConfiguracoes(B_solucaoSofrega);
		System.out.printf("Número Máximo Nós na Fronteira: %d\n", B_mecProcSofrega.nroMaxFront);
		System.out.printf("Número de Nós Expandidos: %d\n", B_mecProcSofrega.nroExpacoes);
		System.out.println();
		
		System.out.println("Configurações de Pesquisa AA:");
		mostrarConfiguracoes(B_solucaoAA);
		System.out.printf("Número Máximo Nós na Fronteira: %d\n", B_mecProcAA.nroMaxFront);
		System.out.printf("Número de Nós Expandidos: %d\n", B_mecProcAA.nroExpacoes);
		System.out.println();
		
		
	}

	private static void mostrarConfiguracoes(Solucao<EstadoPuzzle> solucao) {
		int nroMovOtim = 0;
		if (solucao != null) {
			for (No<EstadoPuzzle> no : solucao) {
//				System.out.printf("Configuração Puzzle: %s\n", no.getEstado());
				nroMovOtim += 1;
			}
		} else{
			System.out.printf("Não há solução! ");
		
		}System.out.printf("Número de Movimentos: %d\n", nroMovOtim);
	}

	private static OperadorMoverPosVazia[] definirMovimentos() {
		OperadorMoverPosVazia[] operadores = {
				new OperadorMoverPosVazia(Puzzle.Movimento.CIMA),
				new OperadorMoverPosVazia(Puzzle.Movimento.BAIXO),
				new OperadorMoverPosVazia(Puzzle.Movimento.ESQ),
				new OperadorMoverPosVazia(Puzzle.Movimento.DIR)};

		return operadores;
	}
	
}
