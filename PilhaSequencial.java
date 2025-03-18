public class PilhaSequencial implements InterfacePilha {
	private int[] vetor; // variável vetor para armazenar a pilha
	private int topo; // índice de topo, último elemento inserido

	public PilhaSequencial() { // construtor
		this.vetor = new int[20]; // definir tamanho fixo
		this.topo = -1; // pilha vazia
	}

	@Override
	public void push(int dado) { // empilhar
		this.topo++; // incrementa a variável topo para apontar para a próxima posição, move o topo para a próxima posição disponível
		this.vetor[topo] = dado; // insere o dado na nova posição do topo
	}

	@Override
	public int pop() { // desempilhar
		int aux = vetor[topo]; // auxiliar para guardar o valor do elemento do topo
		topo--; // decrementa o topo, posição anterior pois o último foi removido
		return aux; // retorna o valor removido
	}

	@Override
	public int obterTopo() {
		return vetor[topo];
	}

	@Override
	public boolean isEmpty() {
		if (this.topo == -1) {
			return true;
		}
		return false;
	}

	@Override
	public String toString() { // representação
		String elementos = new String(); // string vazia para armazenar elementos da pilha
		for (int i = 0; i <= topo; i++) { // loop para percorrer toda a pilha
			elementos += vetor[i] + " "; // constrói uma string com todos os elemntos da pilha, pegando na posição
		}
		return "Pilha Sequencial (max 20): [ " + elementos + "]"; // retorna representação
	}
}
