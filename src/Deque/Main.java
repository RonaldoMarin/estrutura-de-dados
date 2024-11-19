package Deque;

public class Main {
    public static void main(String[] args){
        Deque deque = new Deque();

        System.out.println("Tá vazio? " + deque.isEmpty());


        deque.insertFirst(10);
        deque.insertLast(30);
        deque.insertLast(40);
        deque.insertLast(50);

        System.out.println("Tamanho: " + deque.size());


        System.out.println("Primeiro: " + deque.first());
        System.out.println("Ultimo: " + deque.last());


        System.out.println("Removendo o primeiro: " + deque.removeFirst());
        System.out.println("Removendo o ultimo: " + deque.removeLast());

        
        System.out.println("Tá vazio? " + deque.isEmpty());
    }
}
