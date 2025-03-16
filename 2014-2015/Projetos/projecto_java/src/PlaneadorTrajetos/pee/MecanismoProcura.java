package PlaneadorTrajetos.pee;

public class MecanismoProcura {
	
	private MemoriaProcura memoriaProcura = new MemoriaProcura(); // Porque forma uma composição, não existe se não existir MemoriaProcura
	protected Problema problema;
	
	public Solucao procurar(Problema problema){ // Verificar sem procurar(problema) ou procurar(no)
		this.problema = problema;
		
		memoriaProcura.limpar();
		Estado estadoInicial = problema.getEstadoInicial();
		No noInicial = new No(estadoInicial);
		memoriaProcura.inserir(noInicial);
		
		while(!memoriaProcura.fronteiraVazia()){
			No no = memoriaProcura.remover();
			Estado estado = no.getEstado();
			boolean resultado = problema.objectivo(estado); 
			
			
			if (resultado == true){
				return gerarSolucao(no);
			}else{
				expandir(no);
			}
		}
		return null;
	}

	private void expandir(No no) {
		
		Estado estado = no.getEstado();
		Operador[] operadores = problema.getOperadores();
		
		for (Operador operador : operadores){
			Estado estadoSuc = operador.aplicar(estado);
			
			if(estadoSuc != null){
				memoriaProcura.inserir(new No(estadoSuc, operador, no));
			}
		}
	}

	private Solucao gerarSolucao(No no) {

		Solucao solucao = new Solucao();
		Estado estado = no.getEstado();
		No antecessor = no.getAntecessor();
		Operador operador = no.getOperador();
		
		No noTemp = new No(estado, operador, antecessor); // Erro Aqui, estava No noTemp = new No(estado) e assim não gerava o antecessor para fazer o caminho inverso
		
		while(noTemp != null){
			solucao.juntarAoIncio(noTemp);
			
			noTemp = noTemp.getAntecessor();
		}
		
		return solucao;
	}
}
