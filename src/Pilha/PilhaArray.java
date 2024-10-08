package Pilha;

public class PilhaArray implements Pilha{
    private int tamanhoPilha;
    private Object[] lista;
    private int topo = -1;

    public PilhaArray(int capacidade){
        this.tamanhoPilha = capacidade;
        this.lista = new Object[this.tamanhoPilha];
    }

    //Retorna true or false if top
    @Override
    public boolean isEmpty() {
        return this.topo == -1;
    }

    //Return sum top + 1
    @Override
    public int size() {
        return this.topo + 1;
    }

    //Verify
    @Override
    public Object top(){
        if(this.isEmpty()){
            throw new PilhaVaziaExcecao("A pilha está vazia!");
        }
        return this.lista[this.topo];
    }

    @Override
    public void push(Object elemento) {
        if (this.topo == this.tamanhoPilha - 1) {
            throw new PilhaVaziaExcecao("Agora ta cheinha cheinha");
        }
        this.topo = this.topo + 1;
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