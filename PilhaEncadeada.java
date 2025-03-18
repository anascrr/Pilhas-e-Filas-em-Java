public class PilhaEncadeada implements InterfacePilha {
	No noTopo = null; // pilha inicia vazia
	int totalDeElementos = 0; // contador inicia vazio

	@Override
	public void push(int dado) { // empilhadar dado
		No novoNo = new No(dado); // novo nó criado com o valor recebido por parâmetro
		novoNo.definirProximo(this.noTopo);
		this.noTopo = novoNo;
		this.totalDeElementos++;
	}

	@Override
	public int pop() { // desempilhar
		if (this.noTopo != null) { // se o topo não estiver vazio
			int dado = this.noTopo.obterDado(); // armazena o valor do dado no topo
			this.noTopo = this.noTopo.obterProximo(); // atualiza o topo da pilha para o próximo nó
			return dado; // retorna o dado
		}
		return -1; // erro
	}

	@Override
	public int obterTopo() {
		return this.noTopo.obterDado();
	}

	@Override
	public boolean isEmpty() {
		if (this.noTopo != null) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() { // representação
		String elementos = new String(); // string para armazenar os elementos da pilha
		No noAtual = this.noTopo; // ponteiro para percorrer a pilha, começando do topo
		while (noAtual != null) { // enquanto houve nós, percorra
			elementos = elementos + noAtual.obterDado() + " "; // adiciona o valor do nó à string
			noAtual = noAtual.obterProximo(); // avança para o próximo
		}
		return "Pilha Encadeada: [ " + elementos + "]"; // retorna a representação
	}
}
