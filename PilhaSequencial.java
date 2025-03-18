public class PilhaSequencial implements InterfacePilha {
	private int[] vetor;
	private int topo;

	public PilhaSequencial() {
		this.vetor = new int[20];
		this.topo = -1;
	}

	@Override
	public void push(int dado) {
		this.topo++;
		this.vetor[topo] = dado;
	}

	@Override
	public int pop() {
		int aux = vetor[topo];
		topo--;
		return aux;
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
	public String toString() {
		String elementos = new String();
		for (int i = 0; i <= topo; i++) {
			elementos += vetor[i] + " ";
		}
		return "Pilha Sequencial (max 20): [ " + elementos + "]";
	}
}