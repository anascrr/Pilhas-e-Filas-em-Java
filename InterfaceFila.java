public interface InterfaceFila {
    public boolean enqueue(int dado);
    public int dequeue();
    public int obterPrimeiro();
    public boolean isEmpty();
    @Override
    public String toString();
}
