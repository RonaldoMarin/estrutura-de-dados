package Fila;

public class TestFila {
    public static void main(String[] args) {
        FilaArray fila = new FilaArray(10);

        System.out.println("Inserindo");
        System.out.println("Capacidade: " + fila.capacidade);

        long startTime = System.currentTimeMillis();
        for (int i = 0 ; i < 41 ; i++){
            fila.enqueue(i);
        }
        long endTime = System.currentTimeMillis();
        long executionTime = endTime - startTime;
        System.out.println("Tempo total: " + executionTime + "ms");

        fila.printQueue();

        System.out.println("\nRemovendo: " + fila.dequeue());
        System.out.println("Primeiro elemento: " + fila.first());
        System.out.println("Tá vazia? " + fila.isEmpty());
        System.out.println("Size: " + fila.size());

        fila.printQueue();
        System.out.println("Capacidade: " + fila.capacidade);
    }
}
