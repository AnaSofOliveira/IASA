package project_java.tp2.PlaneadorTrajetos.pee.mecproc.mem;

import java.util.HashMap;
import java.util.Map;
import java.util.Queue;

import project_java.tp2.PlaneadorTrajetos.pee.mecproc.No;
import project_java.tp2.PlaneadorTrajetos.pee.modprob.Estado;

/**
 * Mem�ria de suporte � procura
 */
public class MemoriaProcura
{
	/** Fronteira de explora��o (defini��o geral) */
	protected Queue<No> fronteira;
	/** Mem�ria de estados explorados e respectivos n�s */
	protected Map<Estado, No> explorados = new HashMap<Estado, No>();
	/** N�mero m�ximo de n�s na fronteira */
	private int numMaxNosFronteira = 0;
	/** N�mero de n�s gerados */
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
	 * @param fronteira	Contentor de fronteira de explora��o
	 */
	public MemoriaProcura(Queue<No> fronteira) {
		this.fronteira = fronteira;
	}

	/**
	 * Limpar mem�ria
	 */
	public void limpar() {
		fronteira.clear();
		explorados.clear();
	}

	/**
	 * Inserir n� na mem�ria
	 * @param no	N� a inserir
	 */
	public void inserir(No no) {
		Estado estado = no.getEstado();
		No noMem = explorados.get(estado);
        if(noMem == null ? true : no.getCusto() < noMem.getCusto()) {
        	fronteira.add(no);
        	explorados.put(estado, no);
            
            // Actualizar dimens�o m�xima da fronteira
            if(fronteira.size() > numMaxNosFronteira)
            	numMaxNosFronteira = fronteira.size();
        }
        
        // Actualizar n�mero de n�s processados
        numNosGerados += 1;
	}

	/**
	 * Remover primeiro n� da fronteira de explora��o
	 * @return	N� removido
	 */
	public No remover() {
		return fronteira.poll();
	}

	/**
	 * Indica��o de fronteira de explora��o vazia
	 * @return	Fronteira de explora��o vazia (sim/n�o)
	 */
	public boolean fronteiraVazia() {
		return fronteira.isEmpty();
	}
}
