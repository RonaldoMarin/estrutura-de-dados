package Deque;
import java.util.ArrayList;

public class Deque implements DequeInterface{
    ArrayList<Object> deque;
    Object primeiro;
    Object ultimo;

    public Deque(){
        deque = new ArrayList<>();
    }

    @Override
    public void insertFirst(Object o){
        deque.add(0, o);
    }

    @Override
    public Object removeFirst(){
        if(isEmpty()){
            throw  new DequeException("Índice inexistente no Deque");
        }
        this.primeiro = this.first();
        deque.remove(this.first());
        return this.primeiro;
    }

    @Override
    public void insertLast(Object o){
        deque.add(o);
    }

    @Override
    public Object removeLast(){
        if(isEmpty()){
            throw  new DequeException("Índice inexistente no Deque");
        }
        this.ultimo = this.last();
        deque.remove(this.last());
        return this.ultimo;
    }

    @Override
    public Object first(){
        if(isEmpty()){
            throw  new DequeException("Índice inexistente no Deque");
        }
        return deque.get(0);
    }

    @Override
    public Object last(){
        if(isEmpty()){
            throw  new DequeException("Índice inexistente no Deque");
        }
        return deque.get(size() - 1);
    }

    @Override
    public int size(){
        return deque.size();
    }

    @Override
    public boolean isEmpty(){
        return deque.isEmpty();
    }

}
