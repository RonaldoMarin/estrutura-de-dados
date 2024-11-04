package Node;

public interface ListaEncadeadaInterface {
    void adicionarInicio(Object elemento);
    void adicionarFim(Object elemento);
    Object removerInicio();
    Object removerFim();
    boolean isEmpty();
    void imprimirLista();
}