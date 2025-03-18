public class FilaSequencial implements InterfaceFila {
    private int[] vetor;
    private int inicio;
    private int fim;
    private int tamanho;

    public FilaSequencial() {
        this.vetor = new int[20];
        this.inicio = 0;
        this.fim = 0;
        this.tamanho = 0;
    }

    @Override
    public boolean enqueue(int dado) {
        if (tamanho < vetor.length) {
            this.vetor[fim] = dado;
            this.fim = (fim + 1) % vetor.length;
            tamanho++;
            return true;
        }
        return false;
    }

    @Override
    public int dequeue() {
        if (!isEmpty()) {
            int aux = vetor[inicio];
            this.inicio = (inicio + 1) % vetor.length;
            tamanho--;
            return aux;
        }
        throw new IllegalStateException("A fila está vazia.");
    }

    @Override
    public int obterPrimeiro() {
        return vetor[inicio];
    }

    @Override
    public boolean isEmpty() {
        return tamanho == 0;
    }

    @Override
    public String toString() {
        String resultado = "Fila: [";
        for (int i = 0; i < tamanho; i++) {
            resultado += vetor[(inicio + i) % vetor.length];
            if (i < tamanho - 1) {
                resultado += ", ";
            }
        }
        resultado += "]";
        return resultado;
    }
}