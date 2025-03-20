public class FilaEncadeada implements InterfaceFila {
    private No inicio; // nó cabeça
    private No fim; // nó cauda

    public FilaEncadeada() { // construtor
        this.inicio = null; // estão vazios
        this.fim = null;
    }

    @Override
    public boolean enqueue(int dado) { // enfileirar
        No novoNo = new No(dado); // criar novo nó com o valor recebido por parâmetro
        if (this.inicio == null) { // verificar se a fila está vazia, poderia ser !isEmpty também
            this.inicio = novoNo; // o novo nó será inserido tanto no início quanto no fim pois a fila está vazia
            this.fim = novoNo;
        } else { // caso contrário
            this.fim.definirProximo(novoNo); // o último nó atual vai apontar para o novo nó
            this.fim = novoNo; // atualiza o fim da fila para o novo nó
        }
        return true; // bem-sucedido
    }

    @Override
    public int dequeue() { // desenfileirar
        if (!isEmpty()) { // se a fila não estiver vazia
            int valorRemovido = this.inicio.obterDado(); // auxiliar para guardar o início
            this.inicio = this.inicio.obterProximo(); // atualiza para o próximo da fila
            if (this.inicio == null) { // se após a operação o início ficar vazio, então o fim recebe null
                this.fim = null;
            }
            return valorRemovido; // retorna o valor
        }
        throw new IllegalStateException("A fila está vazia."); // exceção
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
    public String toString() { // representação
        String elementos = new String(); // armazenar elementos da fila na string vazia
        No noAtual = this.inicio; // ponteiro para percorrer a fila, começando do início
        while (noAtual != null) { // percorre enquanto houver nós
            elementos = elementos + noAtual.obterDado() + " "; // adiciona o dado na string
            noAtual = noAtual.obterProximo(); // aponta para o próximo nó
        }
        return elementos; // retorna a string construída
    }
}
