package Pilha;
import Pilha.PilhaVaziaExcecao;

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

}
