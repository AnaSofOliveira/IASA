package project_java.tp1.ambiente;

import java.util.Scanner;

public class Ambiente {

	private EventoAmb evento;

	public void evoluir() {
		gerarEvento();
		mostrar();
	}

	public EventoAmb obterEvento() {
		return this.evento;
	}

	public void executarAccao(AccaoAmb accao) {
		
	}

	private EventoAmb gerarEvento() {
		// Gerar do Evento do Ambiente no ambito do Jogo em questão

				System.out.println("-----------------------------");
				System.out.print("Insira um comando --> ");
				Scanner keyboard = new java.util.Scanner(System.in);
				String comando = keyboard.next();
				switch (comando) {
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
					evento = EventoAmb.TERMINAR;
					break;
				default:
					System.out.println("O comando não é valido " + comando);
					return this.obterEvento();
				}
				keyboard.close();
				return evento;
	}

	private void mostrar() {

	}

}
