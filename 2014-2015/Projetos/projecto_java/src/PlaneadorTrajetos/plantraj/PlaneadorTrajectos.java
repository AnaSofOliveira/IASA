package PlaneadorTrajetos.plantraj;

import PlaneadorTrajetos.pee.MecanismoProcura;
import PlaneadorTrajetos.pee.No;
import PlaneadorTrajetos.pee.Solucao;
import PlaneadorTrajetos.plantraj.modprob.OperadorLigacao;
import PlaneadorTrajetos.plantraj.modprob.ProblemaTrajecto;

public class PlaneadorTrajectos {
	
	public static void main(String [ ] args){
		
		OperadorLigacao[] operadores = definirOperadores();
		
		String locInicial = "loc-0";
		String locFinal  = "loc-2";
		
		ProblemaTrajecto problema = new ProblemaTrajecto(locInicial, locFinal, operadores);
		
		MecanismoProcura mecProc = new MecanismoProcura();
		
		Solucao solucao = mecProc.procurar(problema);
		
		mostrarTrajeto(solucao);
	}
	
	public static OperadorLigacao[] definirOperadores(){
		int numOperardores = 11;
		
		OperadorLigacao[] operadores = new OperadorLigacao[numOperardores];
		
		String[] locIniciais = {"loc-0", "loc-0", "loc-1", "loc-1", "loc-2", "loc-3", "loc-3", "loc-4", "loc-5", "loc-5", "loc-6"};
		String[] locFinais = {"loc-1", "loc-2", "loc-3", "loc-6", "loc-4", "loc-2", "loc-5", "loc-3", "loc-6", "loc-4", "loc-3"};
		int[] custo = {5, 25, 12, 5, 30, 10, 5, 2, 8, 10, 15};
		
		for (int i = 0; i < numOperardores; i++){
			operadores[i] = new OperadorLigacao(locIniciais[i], locFinais[i], custo[i]);
		}
		
		return operadores;
	}
	
	
	public static void mostrarTrajeto(Solucao solucao){
		if(solucao == null)
			System.out.printf("Não há solução");
		else{
			for (No no: solucao){
				System.out.printf("Localidade: %s\n", no.getEstado());
			}
		}
	}
	
}
