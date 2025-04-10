public class Livro {
    String nome;
    int preco;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getPreco() {
        return preco;
    }

    public void setPreco(int preco) {
        this.preco = preco;
    }

    public Livro(String nome, int preco){
        this.nome = nome;
        this.preco = preco;
    }

}
