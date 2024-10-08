package Pilha;

public interface Pilha {
    public int size();
    public boolean isEmpty();
    public void push(Object o);
    public Object pop() throws PilhaVaziaExcecao;
    public Object top() throws PilhaVaziaExcecao;
}
