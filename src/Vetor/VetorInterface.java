package Vetor;

public interface VetorInterface {
    public Object atRank(int rank);
    public void insertAtRank(int rank, Object o);
    public Object removeAtRank(int rank);
    public void replaceAtRank(int rank, Object o);
    public int size();
    public boolean isEmpty();
}
