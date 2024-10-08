package Pilha;

public class PilhaArray implements Pilha{
    private Object[] lista;
    private int topo = -1;
    private int incremento;

    public PilhaArray(int capacidade){
        this.lista = new Object[capacidade];
        this.incremento = 0;
    }

    @Override
    public boolean isEmpty() {
        return this.topo == -1;
    }

    @Override
    public int size() {
        return this.topo + 1;
    }

    @Override
    public Object top(){
        if(this.isEmpty()){
            throw new PilhaVaziaExcecao("A pilha está vazia!");
        }
        return this.lista[this.topo];
    }

    @Override
    public void push(Object elemento) {
        if (this.topo == this.lista.length - 1) {
            Object[] newStack;
            if (this.incremento > 0){
                newStack = new Object[this.lista.length + this.incremento];
            } else{
                newStack = new Object[this.lista.length * 2];
            }
            for (int i = 0; i < this.lista.length; i++) {
                newStack[i] = this.lista[i];
            }
            this.lista = newStack;
        }
        this.topo++;
        this.lista[this.topo] = elemento;
    }

    @Override
    public Object pop() {
        if(this.isEmpty()){
            throw new PilhaVaziaExcecao("A pilha está vazia!");
        }
        Object temp = lista[this.topo];
        this.lista[this.topo] = null;
        this.topo--;
        return temp;
    }

    public void printPilha(){
        if (this.isEmpty()){
            throw new PilhaVaziaExcecao("A pilha está vazia!");
        }
        for (int i = 0 ; i < this.size() ; i++){
            System.out.print(this.lista[i] + " ");
        }
    }
}