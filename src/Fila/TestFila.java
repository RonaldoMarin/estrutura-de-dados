package Fila;

public class TestFila {
    public static void main(String[] args) {
        FilaArray fila = new FilaArray(11);

        System.out.println("Inserindo");

        long startTime = System.currentTimeMillis();
        for (int i = 0 ; i < 10 ; i++){
            fila.enqueue(i);
        }
        long endTime = System.currentTimeMillis();
        long executionTime = endTime - startTime;
        System.out.println("Tempo total: " + executionTime + "ms");

        System.out.println("\nRemovendo: " + fila.dequeue());
        System.out.println("Primeiro elemento: " + fila.first());
        System.out.println("Tá vazia? " + fila.isEmpty());
        System.out.println("Size: " + fila.size());

    }
}
