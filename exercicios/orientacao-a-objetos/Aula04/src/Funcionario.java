public class Funcionario {
    String nome;
    String cargo;
    double salario;

    public  Funcionario(String nome){
        this.nome = nome;
    }

    public Funcionario(String nome, String cargo){
        this.nome = nome;
        this.cargo = cargo;
    }

    public Funcionario(String nome, String cargo, double salario){
        this.nome = nome;
        this.cargo = cargo;
        this.salario = salario;
    }

    public void exibirDados() {
        System.out.println(nome);

        if (cargo != null){
            System.out.println(cargo);
        } else {
            System.out.println("Não possui cargo");
        } if (salario != 0) {
            System.out.println(salario);
        } else {
            System.out.println("Não possui salario");
        }


    }
}
