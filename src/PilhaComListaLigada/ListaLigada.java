package PilhaComListaLigada;

public class ListaLigada {

    private Node first;

    public void push(Node no){
        no.setNext(first);
        first = no;
    }

    public Node pop(){
        if (first == null){
            return null;
        }
        Node aux = first;
        first = aux.getNext();
//        aux.setNext(null);
        return aux;
    }

}
