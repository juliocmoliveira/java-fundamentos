public class Pessoa {
    private String nome;

    public Pessoa (String nome){
        this.nome = nome;
    }

    public void exibirNome(){
        System.out.println("Nome: "+this.nome);
    }
    public void chamarExibirNome(){
        this.exibirNome();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
