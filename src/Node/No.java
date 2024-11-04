package Node;

public class No {
    Object elemento;
    No proximo;

    public No(Object elemento){
        this.elemento = elemento;
        this.proximo = null;
    }

    // Getter next element
    public Object getElemento() {
        return elemento;
    }

    // Setter next element
    public void setElemento(Object elemento) {
        this.elemento = elemento;
    }

    // Getter next node
    public No getProximo() {
        return proximo;
    }

    // Setter next node
    public void setProximo(No proximo) {
        this.proximo = proximo;
    }
}
