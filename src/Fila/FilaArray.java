package Fila;

public class FilaArray implements Fila{

    Object[] filaLista;
    int inicio;
    int capacidade;
    int fim;
    int incremento;

    public FilaArray(int capacidade){
        this.capacidade = capacidade;
        this.filaLista = new Object[capacidade];
        this.inicio = 0;
        this.fim = 0;
        this.incremento = 0;
    }

    @Override
    public boolean isEmpty() {
        return this.inicio == this.fim;
    }

    @Override
    public int size(){
        return (this.filaLista.length - this.inicio + this.fim) % this.filaLista.length;
    }

    @Override
    public Object first(){
        if (this.isEmpty()){
            throw new FilaVaziaExcecao("Fila se encontra vazia!");
        }
        return this.filaLista[this.inicio];
    }

    @Override
    public Object dequeue(){
        if (this.isEmpty()){
            throw new FilaVaziaExcecao("Fila se encontra vazia!");
        }
        Object o = this.filaLista[this.inicio];
        this.inicio = (this.inicio + 1) % this.filaLista.length;
        return o;
    }

    @Override
    public void enqueue(Object o){
        if(this.filaLista.length == this.capacidade){
            Object[] newFila = new Object[this.capacidade*2];

            int aux = this.inicio;
            for (int i = 0; i < this.capacidade; i++){
                newFila[i] = this.filaLista[aux];
                aux = (aux + 1) % this.capacidade;
            }
            this.fim = size();

            this.inicio = 0;
            this.capacidade *= 2;
            this.filaLista = newFila;
        }
        this.filaLista[this.fim] = o;
        this.fim = (this.fim + 1) % this.filaLista.length;
    }

    public void printQueue() {
        if (this.inicio == this.fim) {
            System.out.println("A fila está vazia.");
            return;
        }
        System.out.print("Fila: ");
        int aux = inicio;
        while (aux != fim) {
            System.out.print(filaLista[aux] + " ");
            aux = (aux + 1) % this.capacidade;
        }
        System.out.println();
    }
}