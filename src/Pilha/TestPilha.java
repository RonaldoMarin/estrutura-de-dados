package Pilha;

public class TestPilha {
    public static void main(String[] args) {
        PilhaArray pilha = new PilhaArray(1000000000);

        System.out.println("Inserindo");
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < 100000000; i++) {
            pilha.push(i);
        }
        long endTime = System.currentTimeMillis();
        long executionTime = endTime - startTime;
        System.out.println("Tempo total: " + executionTime + "ms");
//
//        pilha.printPilha();
//
//        System.out.println("\nRemovendo: " + pilha.pop());
//        System.out.println("Top: " + pilha.top());
//        System.out.println("Tá vazia? " + pilha.isEmpty());
//        System.out.println("Tamanho: " + pilha.size());
//
//        pilha.printPilha();
    }
}
