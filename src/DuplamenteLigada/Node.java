package DuplamenteLigada;

public class Node {

    public Node(String nome, int numero) {
        this.nome = nome;
        this.numero = numero;
        this.next = null;
        this.prev = null;
    }

    private String nome;
    private int numero;
    private Node next;
    private Node prev;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Node getnext() {
        return next;
    }

    public void setnext(Node next) {
        this.next = next;
    }

    public Node getprev() {
        return prev;
    }

    public void setprev(Node prev) {
        this.prev = prev;
    }

}

