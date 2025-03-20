public class TestePilha {
	public static void main(String[] args) {
		PilhaEncadeada pilhaE = new PilhaEncadeada(); // Usar InterfacePilha pilha1 = new PilhaSequencial();
	    					              // usar InterfacePilha pilha2 = new PilhaEncadeada();
	    					             // para garantir que ambas filas estão sendo implementadas corretamente

		System.out.println("Pilha vazia? " + pilhaE.isEmpty());
		pilhaE.push(10);
		pilhaE.push(20);
		pilhaE.push(30);
		System.out.println("Topo da pilha: " + pilhaE.obterTopo());
		System.out.println(pilhaE.toString());

		pilhaE.pop();
		System.out.println(pilhaE.toString());

		System.out.println(" ");
		System.out.println("-------------------------");
		System.out.println(" ");
		
		PilhaSequencial pilhaS = new PilhaSequencial();

		pilhaS.push(60);
		pilhaS.push(70);
		pilhaS.push(80);
		pilhaS.push(90);
		pilhaS.push(100);

		System.out.println(pilhaS.toString());
		System.out.println("Topo: " + pilhaS.obterTopo());
		System.out.println("Está vazia? " + pilhaS.isEmpty());
		// pilhaS.pop();
		// System.out.println("Novo topo: " + pilhaS.obterTopo());
		// pilhaE.pop();
		// pilhaE.pop();
		// pilhaE.pop();
		// pilhaE.pop();
		// System.out.println("Pilha Sequencial: [ " + pilhaS.toString() + "]");
	}
}
