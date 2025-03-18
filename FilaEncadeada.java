public class FilaEncadeada implements InterfaceFila {
    private No inicio;
    private No fim;

    public FilaEncadeada() {
        this.inicio = null;
        this.fim = null;
    }

    @Override
    public boolean enqueue(int dado) {
        No novoNo = new No(dado);
        if (this.inicio == null) {
            this.inicio = novoNo;
            this.fim = novoNo;
        } else {
            this.fim.definirProximo(novoNo);
            this.fim = novoNo;
        }
        return true;
    }

    @Override
    public int dequeue() {
        if (!isEmpty()) {
            int valorRemovido = this.inicio.obterDado();
            this.inicio = this.inicio.obterProximo();
            if (this.inicio == null) {
                this.fim = null;
            }
            return valorRemovido;
        }
        throw new IllegalStateException("A fila está vazia.");
    }

    @Override
    public int obterPrimeiro() {
        if (!isEmpty()) {
            return this.inicio.obterDado();
        }
        return -1;
    }

    @Override
    public boolean isEmpty() {
        if (this.inicio == null) {
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        String elementos = new String();
        No noAtual = this.inicio;
        while (noAtual != null) {
            elementos = elementos + noAtual.obterDado() + " ";
            noAtual = noAtual.obterProximo();
        }
        return elementos;
    }
}
