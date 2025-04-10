public class Pessoa {
    private String name;

    public Pessoa(String name) {
        this.name = name;
    }

    public void ixibirName() {
        System.out.println("Nome: " + name);
    }
    public void apresentar() {
        this.ixibirName();
    }
}


NA CLASS MAIN
public class Main {
    public static void main(String[] args) {
    Pessoa pessoa = new Pessoa("Allan");
    pessoa.apresentar();
    }


}
