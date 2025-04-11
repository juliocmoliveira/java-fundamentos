//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Livro livro = new Livro("1984", "george orwell", 1949);
        System.out.println(livro.titulo);
        System.out.println(livro.autor);
        System.out.println(livro.anoPublicacao);

        Funcionario funcionario1 = new Funcionario("carinha que mora logo ali", "repositor", 2000);
        Funcionario funcionario2 = new Funcionario("julius", "entregador");
        Funcionario funcionario3 = new Funcionario("roberto");

        funcionario1.exibir();
        funcionario2.exibir();
        funcionario3.exibir();
    }
}