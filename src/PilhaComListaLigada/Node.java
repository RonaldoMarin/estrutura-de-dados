package PilhaComListaLigada;

public class Node {
    public Node(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
        this.next = null;
    }

    private String nome;
    private int idade;
    private Node next;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade(){
        return idade;
    }

    public void setIdade(int idade){
        this.idade = idade;
    }

    public Node getNext(){
        return next;
    }

    public void setNext(Node next){
        this.next = next;
    }
}
