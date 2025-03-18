public class PilhaEncadeada implements InterfacePilha {

	No noTopo = null;
	int totalDeElementos = 0;

	@Override
	public void push(int dado) {
		No novoNo = new No(dado);
		novoNo.definirProximo(this.noTopo);
		this.noTopo = novoNo;
		this.totalDeElementos++;
	}

	@Override
	public int pop() {
		if (this.noTopo != null) {
			int dado = this.noTopo.obterDado();
			this.noTopo = this.noTopo.obterProximo();
			return dado;
		}
		return -1;
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
	public String toString() {
		String elementos = new String();
		No noAtual = this.noTopo;
		while (noAtual != null) {
			elementos = elementos + noAtual.obterDado() + " ";
			noAtual = noAtual.obterProximo();
		}
		return "Pilha Encadeada: [ " + elementos + "]";
	}
}
