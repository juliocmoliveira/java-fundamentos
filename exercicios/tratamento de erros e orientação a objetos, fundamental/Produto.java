public class Produto {
    String nome;
    double preco;
    int quantidade;

    public Produto(String nome, double preco, int quantidade){
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }
    public void Imprimir(){
        System.out.println(nome);
        System.out.println(preco);
        System.out.println(quantidade);
    }
}
