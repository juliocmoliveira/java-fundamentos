public class ProdutoEncap {
    String nome;
    private double preco;
    int quantidade;

    public ProdutoEncap(String nome, int quantidade){
        this.nome = nome;
        this.quantidade = quantidade;
    }

    public void setPreco(double preco){
        this.preco = preco;
    }

    public double getpreco() {
        return preco ;
    }
}
