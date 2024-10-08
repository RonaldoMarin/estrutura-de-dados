package Fila;

public class FilaArray implements Fila{

    Object[] filaLista;
    int inicio;
    int fim;
    int incremento;

    public FilaArray(int capacidade){
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
        return (this.filaLista.length - this.inicio +this.fim) % this.filaLista.length;
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
        if (this.isEmpty()){
            this.inicio = 0;
        }
        this.fim = (this.fim + 1) % this.filaLista.length;
        this.filaLista[this.fim] = o;
    }
}
