package HashTable;

public class Elemento {

    public Elemento(int numero, String nome) {
        this.numero = numero;
        this.nome = nome;
    }

    private int numero;
    private String nome;
    private String infos;

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getInfos() {
        return infos;
    }

    public void setInfos(String infos) {
        this.infos = infos;
    }

}

