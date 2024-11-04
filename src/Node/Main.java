package Node;

public class Main {
    public static void main(String[] args) {
        ListaEncadeada lista = new ListaEncadeada();

        // Testando adicionar elementos no início da lista
        System.out.println("Adicionando elementos no início da lista:");
        lista.adicionarInicio("A");
        lista.adicionarInicio("B");
        lista.adicionarInicio("C");
        lista.imprimirLista(); // Esperado: C B A

        // Testando adicionar elementos no final da lista
        System.out.println("\nAdicionando elementos no final da lista:");
        lista.adicionarFim("D");
        lista.adicionarFim("E");
        lista.imprimirLista(); // Esperado: C B A D E

        // Testando remover elementos do início da lista
        System.out.println("\nRemovendo elementos do início da lista:");
        lista.removerInicio();
        lista.imprimirLista(); // Esperado: B A D E
        lista.removerInicio();
        lista.imprimirLista(); // Esperado: A D E

        // Testando remover elementos do final da lista
        System.out.println("\nRemovendo elementos do final da lista:");
        lista.removerFim();
        lista.imprimirLista(); // Esperado: A D
        lista.removerFim();
        lista.imprimirLista(); // Esperado: A

        // Testando se a lista está vazia
        System.out.println("\nRemovendo último elemento:");
        lista.removerInicio();
        lista.imprimirLista(); // Esperado: A lista está vazia.

        System.out.println("A lista está vazia? " + lista.isEmpty()); // Esperado: true

        // Adicionando mais elementos após esvaziar a lista
        System.out.println("\nAdicionando elementos após esvaziar a lista:");
        lista.adicionarFim("X");
        lista.adicionarInicio("Y");
        lista.imprimirLista(); // Esperado: Y X
    }
}
