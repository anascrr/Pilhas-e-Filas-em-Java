public class No {
    private int dado; // variável dado
    private No proximo; // referência para o próximo nó da lista

    public No(int dado) { // construtor
        this.dado = dado;
        this.proximo = null; // iniciado com null indicando que está vazio
    }

    public int obterDado() { // armazenar valor do nó
        return dado;
    }

    public void definirDado(int dado) { // definir valor no nó
        this.dado = dado;
    }

    public No obterProximo() { // refência para o próximo nó da lista
        return proximo;
    }

    public void definirProximo(No proximo) { // define o próximo nó na sequência
        this.proximo = proximo;
    }
}
