package ArvoreAVL;

public class Node {
    private Object elemento;
    private Node direito;
    private Node esquerdo;
    private Node pai;
    private int fatorBalanceamento;

    public Node(Object elemento) {
        this.elemento = elemento;
        this.direito = null;
        this.esquerdo = null;
        this.pai = null;
        this.fatorBalanceamento = 0;
    }

    public Node(Object elemento, Node pai) {
        this.elemento = elemento;
        this.direito = null;
        this.esquerdo = null;
        this.pai = pai;
        this.fatorBalanceamento = 0;
    }

    public Object getElemento() {
        return elemento;
    }

    public void setElemento(Object elemento) {
        this.elemento = elemento;
    }

    public Node getDireito() {
        return direito;
    }

    public void setDireito(Node direito) {
        this.direito = direito;
    }

    public Node getEsquerdo() {
        return esquerdo;
    }

    public void setEsquerdo(Node esquerdo) {
        this.esquerdo = esquerdo;
    }

    public Node getPai() {
        return pai;
    }

    public void setPai(Node pai) {
        this.pai = pai;
    }

    public int getFatorBalanceamento() {
        return fatorBalanceamento;
    }

    public void setFatorBalanceamento(int fatorBalanceamento) {
        this.fatorBalanceamento = fatorBalanceamento;
    }

    @Override
    public String toString() {
        return String.valueOf(elemento);
    }
}
