package DuplamenteLigada;

public class ListaDuplamenteLigada {

    private Node first;
    private Node last;
    private int size;

    public void insereInicio(Node no){
        if (first == null) {
            //Ajusta os ponteiros para ambos apontarem para o mesmo elemento
            first = no;
            last = no;
        }

        no.setnext(first);
        first.setprev(no);
        first = no;
        size++;
    }

    public void insereFim(Node no){
        if (last == null) {
            first = no;
            last = no;
        }
        no.setprev(last);
        last.setnext(no);
        last = no;
        size++;
    }

    public Node removeInicio(){
        if (first == null) {
            return null;
        }
        Node aux = first;
        //first = first.getNext();
        aux.setnext(null);
        if (first != null) first.setprev(null);
        else last = null;
        return aux;
    }

}
