package project_java.tp2.PlaneadorTrajetos.pee.mecproc.mem;

import java.util.HashMap;
import java.util.Map;
import java.util.Queue;

import project_java.tp2.PlaneadorTrajetos.pee.mecproc.No;
import project_java.tp2.PlaneadorTrajetos.pee.modprob.Estado;

/**
 * Memória de suporte à procura
 */
public class MemoriaProcura
{
	/** Fronteira de exploração (definição geral) */
	protected Queue<No> fronteira;
	/** Memória de estados explorados e respectivos nós */
	protected Map<Estado, No> explorados = new HashMap<Estado, No>();
	/** Número máximo de nós na fronteira */
	private int numMaxNosFronteira = 0;
	/** Número de nós gerados */
	private int numNosGerados = 0;

	public int getNumMaxNosFronteira() {
		return numMaxNosFronteira;
	}

	public int getNumNosGerados() {
		return numNosGerados;
	}

	public int getNumEstadosExplorados() {
		return explorados.size();
	}

	public Map<Estado, No> getExplorados() {
		return explorados;
	}

	/**
	 * Construtor
	 * @param fronteira	Contentor de fronteira de exploração
	 */
	public MemoriaProcura(Queue<No> fronteira) {
		this.fronteira = fronteira;
	}

	/**
	 * Limpar memória
	 */
	public void limpar() {
		fronteira.clear();
		explorados.clear();
	}

	/**
	 * Inserir nó na memória
	 * @param no	Nó a inserir
	 */
	public void inserir(No no) {
		Estado estado = no.getEstado();
		No noMem = explorados.get(estado);
        if(noMem == null ? true : no.getCusto() < noMem.getCusto()) {
        	fronteira.add(no);
        	explorados.put(estado, no);
            
            // Actualizar dimensão máxima da fronteira
            if(fronteira.size() > numMaxNosFronteira)
            	numMaxNosFronteira = fronteira.size();
        }
        
        // Actualizar número de nós processados
        numNosGerados += 1;
	}

	/**
	 * Remover primeiro nó da fronteira de exploração
	 * @return	Nó removido
	 */
	public No remover() {
		return fronteira.poll();
	}

	/**
	 * Indicação de fronteira de exploração vazia
	 * @return	Fronteira de exploração vazia (sim/não)
	 */
	public boolean fronteiraVazia() {
		return fronteira.isEmpty();
	}
}
