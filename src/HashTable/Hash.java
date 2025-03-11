package HashTable;

public class Hash {

    public Hash(int tamanho){
        this.tabHash = new Elemento[tamanho];
        this.size = 0;
    }

    private final Elemento[] tabHash;
    private int size;

    private int fHash(int e){
        return e % this.tabHash.length;
    }


    public int insert(Elemento e){
        if (this.size == this.tabHash.length){
            return 3;
        }

        int nr = e.getNumero(); //Aqui eu dou um get no meu número do objeto
        int h = fHash(nr); //Aqui aplico a função hash para saber a posição

        boolean inserido = false;
        for (int i = h ; i < this.tabHash.length ; i++){
            if (this.tabHash[i] == null){
                this.tabHash[i] = e;
                inserido = true;
                break;
            }
        }
        if (!inserido){
            for (int i = 0; i < this.tabHash.length ; i++){
                if (this.tabHash[i] == null){
                    this.tabHash[i] = e;
                    break;
                }
            }
        }

        size++;
        return 1;
    }

    public int localiza(int nr){

        int h = fHash(nr);

        for (int i = h ; i < this.tabHash.length ; i++){
            if (this.tabHash[h].getNumero() == nr){
                return i;
            }
        }
        for (int i = 0; i < h ; i++){
            if (this.tabHash[h].getNumero() == nr){
                return i;
            }
        }
        return -1;
    }

    public Elemento remove(int nr){
        int i = localiza(nr);
        if (i == -1){
            return null;
        }
        Elemento e = this.tabHash[i];
        tabHash[i] = null;
        return e;
    }
}
