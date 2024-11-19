package Deque;

public interface DequeInterface {
    // Operações principais
    public void insertFirst(Object o);
    public Object removeFirst();
    public void insertLast(Object o);
    public Object removeLast();

    // Operações auxiliares
    public Object first();
    public Object last();
    public int size();
    public boolean isEmpty();
}
