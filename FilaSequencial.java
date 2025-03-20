public class FilaSequencial implements InterfaceFila {
    private int[] vetor; // vetor para armazenar os elementos da fila
    private int inicio; // cabeça
    private int fim; // cauda
    private int tamanho; // quantidade de elementos

    public FilaSequencial() { // construtor
        this.vetor = new int[20]; // tamanho máximo
        this.inicio = 0; // iniciam com 0, estão vazios
        this.fim = 0;
        this.tamanho = 0;
    }

    @Override
    public boolean enqueue(int dado) { // enfileirar recebe o dado
        if (tamanho < vetor.length) { // verifica se o tamanho da fila é menor que a capacidade do vetor
            this.vetor[fim] = dado; // insere o dado no fim
            this.fim = (fim + 1) % vetor.length; // mover para a próxima posição, fila circular = garatinr que o índice volte ao início quando atingir o final
            tamanho++; // incrementa o tamanho da fila
            return true; // bem-sucedido
        }
        return false; // fila cheia
    }

    @Override
    public int dequeue() { // desenfileirar
        if (!isEmpty()) { // se a fila não estiver vazia
            int aux = vetor[inicio]; // auxiliar para guardar o valor do início
            this.inicio = (inicio + 1) % vetor.length; // aponta para o próximo do início
            tamanho--; // decrementa o valor da fila
            return aux; // retorna o valor removido
        }
        throw new IllegalStateException("A fila está vazia."); // exceção

    @Override
    public int obterPrimeiro() {
        return vetor[inicio];
    }

    @Override
    public boolean isEmpty() {
        return tamanho == 0;
    }

    @Override
    public String toString() { // representação
        String resultado = "Fila: ["; // string para armazenar os elementos
        for (int i = 0; i < tamanho; i++) { // loop para percorrer a fila
            resultado += vetor[(inicio + i) % vetor.length]; // armazenar o valor atual na string
            if (i < tamanho - 1) { // apenas para formatação casjo não seja o último elemento
                resultado += ", ";
            }
        }
        resultado += "]"; // fechar a string 
        return resultado; // retorna a representação
    }
}
