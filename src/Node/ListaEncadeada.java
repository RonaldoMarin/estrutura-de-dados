package Node;

public class ListaEncadeada implements ListaEncadeadaInterface {
    private No inicio;
    private No fim;

    public ListaEncadeada() {
        this.inicio = null;
        this.fim = null;
    }

    @Override
    public void adicionarInicio(Object elemento) {
        No novoNo = new No(elemento);
        if (isEmpty()) {
            inicio = novoNo;
            fim = novoNo;
        } else {
            novoNo.setProximo(inicio);
            inicio = novoNo;
        }
    }

    @Override
    public void adicionarFim(Object elemento) {
        No novoNo = new No(elemento);
        if (isEmpty()) {
            inicio = novoNo;
            fim = novoNo;
        } else {
            fim.setProximo(novoNo);
            fim = novoNo;
        }
    }

    @Override
    public Object removerInicio() {
        if (isEmpty()) {
            return null;
        }
        Object elemento = inicio.getElemento();
        inicio = inicio.getProximo();
        if (inicio == null) {
            fim = null;
        }
        return elemento;
    }

    @Override
    public Object removerFim() {
        if (isEmpty()) {
            return null;
        }
        Object elemento = fim.getElemento();

        if (inicio == fim) {
            inicio = null;
            fim = null;
        } else {
            No atual = inicio;
            while (atual.getProximo() != fim) {
                atual = atual.getProximo();
            }
            fim = atual;
            fim.setProximo(null);
        }
        return elemento;
    }

    @Override
    public boolean isEmpty() {
        return inicio == null;
    }

    @Override
    public void imprimirLista() {
        if (isEmpty()) {
            System.out.println("A lista está vazia.");
            return;
        }

        No atual = inicio;
        System.out.print("Lista: ");
        while (atual != null) {
            System.out.print(atual.getElemento() + " ");
            atual = atual.getProximo();
        }
        System.out.println();
    }
}

