package Vetor;

public class Vetor implements VetorInterface{
    Object[] vetorArray;
    int inicio = 0;
    int fim = 0; //n
    int tamanhoArray; //N

    public Vetor(int capacidade) {
        this.vetorArray = new Object[capacidade];
        this.tamanhoArray = capacidade;
    }

    @Override
    public boolean isEmpty(){
        return this.inicio == this.fim;
    }

    @Override
    public int size(){
        return (this.vetorArray.length - this.inicio + this.fim) % this.vetorArray.length;
    }

    @Override
    public Object atRank(int rank){
        if (isEmpty()){
            throw new VetorException("Vetor vazio");
        }
        // Isso aqui considerando que n-1 é onde está contido o último elemento do array;
        if (rank < 0 || rank >= this.fim){
            throw new VetorException("Índice inexistente no vetor");
        }
        int rankCircular = (this.inicio + rank) % this.vetorArray.length;
        return this.vetorArray[rankCircular];
    }

    @Override
    public void insertAtRank(int rank, Object o){
        // Verifica se o rank é maior que a capacidade do array
        if (rank >= this.vetorArray.length){
            throw  new VetorException("Índice inexistente no vetor");
        }

        // Aqui é pra se o elemento estiver no fim, ele so insere sem precisar copiar o array
        if (rank >= this.fim){
            this.vetorArray[rank] = o;
            return;
        }

        Object[] arrayAux = new Object[this.tamanhoArray];
        for (int i = 0; i < this.tamanhoArray; i++){
            if (rank == i){
                arrayAux[i] = o;
            }else{
                arrayAux[i] = this.vetorArray[i];
            }
        }


    }

    @Override
    public Object removeAtRank(int rank){
        return 1;
    }

    @Override
    public void replaceAtRank(int rank, Object o){
        if (rank >= this.fim){
            throw new VetorException("Índice inexistente no vetor");
        }
        this.vetorArray[rank] = o;
    }
}
