public class Pessoa {
    String nome;

    public Pessoa(String nome) {
        this.nome = nome;
    }

    public void ExibirNome(){
        System.out.println("O nome é: " + nome);
    }

    public void Apresentar(){
        this.ExibirNome();
    }

}
