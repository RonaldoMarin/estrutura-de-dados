package Fila;

public interface Fila {
    public boolean isEmpty();
    public int size();
    public Object first();
    public void enqueue(Object o);
    public Object dequeue();
}
