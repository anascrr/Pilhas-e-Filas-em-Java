public class TesteFila {
    public static void main(String[] args) {
        FilaSequencial filaS = new FilaSequencial();
        
        System.out.println("\nTestando Fila Sequencial:");
        filaS.enqueue(10);
        filaS.enqueue(20);
        filaS.enqueue(30);
        filaS.enqueue(40);
        System.out.println(filaS.toString());
        System.out.println("Primeiro: " + filaS.obterPrimeiro());
        System.out.println("Removido: " + filaS.dequeue());
        System.out.println(filaS.toString());
        System.out.println("Fila está vazia? " + filaS.isEmpty());

        System.out.println(" ");
		System.out.println("-------------------------");
		System.out.println(" ");
        
        FilaEncadeada filaE = new FilaEncadeada();
        System.out.println("Testando Fila Encadeada:");
        filaE.enqueue(10);
        filaE.enqueue(20);
        filaE.enqueue(30);
        filaE.enqueue(40);
        System.out.println(filaS.toString());
        System.out.println("Primeiro: " + filaE.obterPrimeiro());
        System.out.println("Removido: " + filaE.dequeue());
        System.out.println(filaE.toString());
        System.out.println("Fila está vazia? " + filaE.isEmpty());
        
    }
}
