package jogo.ambiente;

import java.util.Scanner;

public class Ambiente {
	
	private EventoAmb evento;
	private Scanner scanner;
	
	
	public Ambiente() {
		scanner = new Scanner(System.in);
	}
	
	public EventoAmb getEvento() {
		return this.evento;
	}
	
	public void evoluir() {
		evento = this.gerarEvento();
		
		this.mostrar();
	}
	
	private EventoAmb gerarEvento() {
		System.out.print("\nEvento? ");
		String comando = scanner.next();	
		
		switch(comando) {
		case "s":
			evento = EventoAmb.SILENCIO;
			break;
		case "r":
			evento = EventoAmb.RUIDO;
			break;
		case "i":
			evento = EventoAmb.INIMIGO;
			break;
		case "f":
			evento = EventoAmb.FUGA;
			break;
		case "v":
			evento = EventoAmb.VITORIA;
			break;
		case "d":
			evento = EventoAmb.DERROTA;
			break;
		case "t":
			evento = EventoAmb.TERMIINAR;
			break;
		default:
			System.out.printf("Comando não reconhecido\n");
			evento = null;
		}
		
		return evento;
		
	}
	
	private void mostrar() {
		if(evento != null)
			System.out.printf("Evento: %s\n", evento);
	}

}
