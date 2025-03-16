package respuzzle;

import pee.PassoSolucao;
import pee.Solucao;
import pee.larg.ProcuraLarg;
import pee.melhorprim.ProcuraAA;
import pee.melhorprim.ProcuraCustoUnif;
import pee.melhorprim.ProcuraMelhorPrim;
import pee.melhorprim.ProcuraSofrega;
import pee.prof.ProcProfIter;
import pee.prof.ProcuraProf;
import puzzle.Puzzle.Movimento;
import respuzzle.modprob.EstadoPuzzle;
import respuzzle.modprob.OperadorMovPosVazia;
import respuzzle.modprob.ProblemaPuzzle;

public class resPuzzle {
	
	public static void main(String[] args) {
		
		OperadorMovPosVazia[] operadores = definirOperadores();
		
		int[][] confA = {{1, 2, 3},{8, 4, 5},{6, 7, 0}};
		EstadoPuzzle puzzleA = new EstadoPuzzle(confA);
		
		int[][] confB = {{8, 4, 5},{6, 1, 2},{3, 7, 0}};
		EstadoPuzzle puzzleB = new EstadoPuzzle(confB);

		int[][] confFinal = {{1, 2, 3},{4, 5, 6},{7, 8, 0}};
		EstadoPuzzle puzzleFinal = new EstadoPuzzle(confFinal);

		//ProblemaPuzzle problema = new ProblemaPuzzle(puzzleA, puzzleFinal, operadores);
		ProblemaPuzzle problema = new ProblemaPuzzle(puzzleB, puzzleFinal, operadores);
		
		//ProcuraLarg mecproc = new ProcuraLarg();
		//ProcuraProf mecproc = new ProcuraProf();
		//ProcProfIter mecproc = new ProcProfIter(5);
		//ProcProfIter mecproc = new ProcProfIter(10);
		//ProcuraCustoUnif mecproc = new ProcuraCustoUnif();
		ProcuraSofrega mecproc = new ProcuraSofrega();
		//ProcuraAA mecproc = new ProcuraAA();
		
		Solucao solucao = mecproc.resolver(problema);
		
		mostrarConfiguracoes(solucao);
		
		System.out.println("TERMINADO!");
	}
	
	private static OperadorMovPosVazia[] definirOperadores() {
		OperadorMovPosVazia[] operadores = {new OperadorMovPosVazia(Movimento.CIMA), 
				new OperadorMovPosVazia(Movimento.BAIXO), 
				new OperadorMovPosVazia(Movimento.DIR), 
				new OperadorMovPosVazia(Movimento.ESQ)};
		return operadores;
	}
	
	
	private static void mostrarConfiguracoes(Solucao solucao) {
		if (solucao != null) {
			for (PassoSolucao no : solucao) {
				//System.out.printf("Configuração Puzzle: %s\n", no.getEstado());
			}
			System.out.printf("Número de Movimentos: %d\n", solucao.getDimensao());
		} else{
			System.out.printf("NÃO ENCONTROU SOLUÇÃO! \n");
		
		}
	}
	
}
