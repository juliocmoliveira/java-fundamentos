public class Funcionario {
    String nome;
    String cargo;
    double salario;

    public Funcionario(String nome, String cargo, double salario) {
        this.nome = nome;
        this.cargo = cargo;
        this.salario = salario;
    }

    public Funcionario(String nome, String cargo) {
        this.nome = nome;
        this.cargo = cargo;
        this.salario = 0;
    }

    public Funcionario(String nome) {
        this.nome = nome;
        this.cargo = "cargo não informado";
        this.salario = 0;
    }

    public void exibir () {
        System.out.println("Nome: " + nome);
        System.out.println("Cargo: " + cargo);
        System.out.println("Salário: R$" + salario);
        System.out.println();
    }
}
