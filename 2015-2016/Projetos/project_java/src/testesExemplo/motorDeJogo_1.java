package testesExemplo;

import java.util.Scanner;

public class motorDeJogo_1 {

	private String nextState;
	private String action;
	private Scanner keyboard;
	private int game = 1;
	
	public motorDeJogo_1() {
		this.nextState = null;
		this.action = "PATRULHAR";
		keyboard = new Scanner(System.in);
	}
	
	public void comecarJogo(){
		
		System.out.println("O Jogo está prestes a começar...");
		System.out.println("Tome atenção aos seguintes comandos: \n R - Ruído \n S - Silêncio \n A - Aproximar \n P - Persistir \n F - Fugir \n");
		
		System.out.println("O Guarda está a " + action + ".");
		
		while(game == 1){
			
			System.out.println("\n\n* Insira uma acção para o Inimigo entre [R, S, A]!");
			
			// Obter input da consola
			nextState = keyboard.next();
			
			while(!(nextState.equalsIgnoreCase("R") || nextState.equalsIgnoreCase("S") || nextState.equalsIgnoreCase("A"))){
				System.out.println("Introduziu uma opção errada...");
				System.out.println("\n\n* Insira uma acção para o Inimigo entre [R, S, A]!");
				nextState = keyboard.next();
			}
			
			// Ler/Analisar resposta da consola
			if(nextState.equalsIgnoreCase("R")){ // Ruido -> Procura Alvo
				action = "PROCURAR ALVO";
			}else if(nextState.equalsIgnoreCase("S")){ // Silencio -> Patrulha
				action = "PATRULHAR";
			}else if(nextState.equalsIgnoreCase("A")){ // Aproxima -> Detecta e Avisa
				System.out.println("O Guarda DETETOU INIMIGO E AVISA-O.");
				System.out.println("\n\n* Insira uma acção para o Inimigo entre [P, F]!");
				nextState = keyboard.next();
				
				while(!(nextState.equalsIgnoreCase("P") || nextState.equalsIgnoreCase("F"))){
					System.out.println("Introduziu uma opção errada...");
					System.out.println("\n\n* Insira uma acção para o Inimigo entre [P, F]!");
					nextState = keyboard.next();
				}
				
				if(nextState.equalsIgnoreCase("P")){ // Persiste -> Ataca
					action = "ATACAR INIMIGO";
					game = (Math.random()<0.5) ? 0 : 1; // TODO Rever random
					if(game == 1){
						action = action + ".\nO Guarda GANHOU AO INIMIGO\nO Guarda está a PARTULHAR";
						System.out.println("O Guarda ganhou ao Inimigo.");
					}
				}else if(nextState.equalsIgnoreCase("F")){ // Fugiu -> Patrulha
					System.out.println("Inimigo Fugiu.");
					action = "PATRULHAR";
				}else{
					System.out.println("\n\n* Insira uma acção para o Inimigo entre [P, F]!");
				}
			}else{
				
			}
			
			// Retornar output
			System.out.println("O Guarda está a " + action + ".");
			
			
		}
		
		System.out.println("O Inimigo Ganhou!");
		System.out.println("GAME OVER!!!!");
	}
	
	public static void main(String[] args) {
		
		motorDeJogo_1 jogo = new motorDeJogo_1();
		jogo.comecarJogo();

	}

}
