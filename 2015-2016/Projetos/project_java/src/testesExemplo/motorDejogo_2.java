package testesExemplo;

import java.util.Scanner;

public class motorDejogo_2 {
	
	final int PATRULHAR = 0;
	final int PROCURAR = 1;
	final int AVISAR = 2;
	final int ATACAR = 3;
	
	public int acao;
	private Scanner teclado;
	private String acaoInimigo;
	private int batalha;
	
	private boolean JOGO;
	
	
	public motorDejogo_2() {
		this.JOGO = true;
		this.acao = PATRULHAR;
		this.teclado = new Scanner(System.in);
		
	}
	
	private void patrulhaOuProcura(String acaoInimigo){
		
		if(acaoInimigo.equalsIgnoreCase("R")){ // Ruido -> Procura
			// TODO Colocar Sysout
			this.acao = PROCURAR;
		}else if(acaoInimigo.equalsIgnoreCase("S")){ // Silencio -> Patrulha
			// TODO Colocar Sysout
			this.acao = PATRULHAR;
		}else if(acaoInimigo.equalsIgnoreCase("A")){ // Aproxima -> Avisa
			// TODO Colocar Sysout
			this.acao = AVISAR;
		}
	}
	
	private void avisa(String acaoInimigo){
		if(acaoInimigo.equalsIgnoreCase("P")){ // Persistiu -> Ataca
			// TODO Colocar Sysout
			this.acao = ATACAR;
		}else if(acaoInimigo.equalsIgnoreCase("F")){ // Fugiu -> Patrulha
			// TODO Colocar Sysout
			this.acao = PATRULHAR;
		}
	}
	
	private int ataca(String acaoInimigo){
		int batalha = (Math.random()<0.5) ? 0 : 1;
		return batalha;
	}
	
	
	public void comecarJogo(){
		System.out.println("O Jogo está prestes a começar...");
		System.out.println("Tome atenção aos seguintes comandos: \n R - Ruído \n S - Silêncio \n A - Aproximar \n P - Persistir \n F - Fugir \n");
		
//		System.out.println("O Guarda está a " + this.acao + ".");
//		this.acaoInimigo = this.teclado.next();
		
		while(JOGO){
			System.out.println("O Guarda está a " + this.acao + ".");
			this.acaoInimigo = this.teclado.next();
			
			switch(this.acao){
				
				case PATRULHAR:
					this.patrulhaOuProcura(this.acaoInimigo);
					break;
					
				case PROCURAR:
					this.patrulhaOuProcura(this.acaoInimigo);
					break;
					
				case AVISAR:
					this.avisa(this.acaoInimigo);
					break;
					
				case ATACAR:
					this.batalha = this.ataca(this.acaoInimigo);
					if(this.batalha == 1){ // Ganhou a batalha
						this.acao = PATRULHAR;
					}else{ // Perdeu a batalha
						return;
					}
					break;
					
			}
			
			
		}
	}
	

	public static void main(String[] args) {
		motorDejogo_2 jogo = new motorDejogo_2();
		jogo.comecarJogo();

	}

}
