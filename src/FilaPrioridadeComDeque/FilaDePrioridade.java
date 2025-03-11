package FilaPrioridadeComDeque;

import java.util.ArrayList;

class No {
    int chave;

    public No(int chave) {
        this.chave = chave;
    }
}

public class FilaDePrioridade {
    private ArrayList<No> heap;

    public FilaDePrioridade() {
        this.heap = new ArrayList<>();
    }

    public int size() {
        return heap.size();
    }

    public boolean isEmpty() {
        return heap.isEmpty();
    }

    public No min() {
        if (isEmpty()) {
            throw new IllegalStateException("Fila de prioridade está vazia.");
        }
        return heap.get(0);
    }

    public void insert(int chave) {
        No novoNo = new No(chave);
        heap.add(novoNo);
        upHeap(heap.size() - 1);
    }

    public No removeMin() {
        if (isEmpty()) {
            throw new IllegalStateException("Fila de prioridade está vazia.");
        }

        No min = heap.get(0);
        No ultimo = heap.remove(heap.size() - 1);

        if (!isEmpty()) {
            heap.set(0, ultimo);
            downHeap(0);
        }

        return min;
    }

    private void upHeap(int index) {
        while (index > 0) {
            int parentIndex = (index - 1) / 2;
            if (heap.get(index).chave >= heap.get(parentIndex).chave) {
                break;
            }
            swap(index, parentIndex);
            index = parentIndex;
        }
    }

    private void downHeap(int index) {
        int tamanho = heap.size();

        while (true) {
            int menor = index;
            int esquerdo = 2 * index + 1;
            int direito = 2 * index + 2;

            if (esquerdo < tamanho && heap.get(esquerdo).chave < heap.get(menor).chave) {
                menor = esquerdo;
            }

            if (direito < tamanho && heap.get(direito).chave < heap.get(menor).chave) {
                menor = direito;
            }

            if (menor == index) {
                break;
            }

            swap(index, menor);
            index = menor;
        }
    }

    private void swap(int i, int j) {
        No temp = heap.get(i);
        heap.set(i, heap.get(j));
        heap.set(j, temp);
    }

    public static void main(String[] args) {
        FilaDePrioridade fila = new FilaDePrioridade();

        fila.insert(10);
        fila.insert(5);
        fila.insert(20);
        fila.insert(3);

        System.out.println("Menor elemento: " + fila.min().chave); // Deve exibir 3

        System.out.println("Removendo: " + fila.removeMin().chave); // Deve remover 3
        fila.insert(99);
        fila.insert(-20);
        System.out.println("Menor elemento agora: " + fila.min().chave); // Deve exibir 5

        System.out.println("Tamanho: " + fila.size()); // Deve exibir 3
        System.out.println("Está vazia? " + fila.isEmpty()); // Deve exibir false
    }
}
