import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Ex1 Divisão com tratamento de exceção
        //Solicite dois números inteiros e realize a divisão.
        //Trate o caso em que o segundo número seja zero com um try/catch.

        try {
            double ex1N1 = 2 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Dividido por zero");
        }

        //-------------------------------------------------------------//
        //Ex2 Conversão segura
        //Peça ao usuário que digite um valor e tente convertê-lo para inteiro.
        //Trate o erro caso a entrada não seja um número.
        try {
        System.out.println("Digite um numero: ");
        int ex2N1 = sc.nextInt();
        }catch (InputMismatchException e){
            System.out.println("Entrada invalidade. Apenas numeros");
        }
        //-------------------------------------------------------------------------//
        //Ex3 Uso de finally
        //Crie um programa que leia um número e divida 100 por ele.
        //Use try/catch/finally e imprima uma mensagem no finally que sempre será exibida.

        try {
            System.out.println("Digite um numero: ");
            int ex3N1 = sc.nextInt();
            double ex3Resultado = 100 / ex3N1;
        }catch (ArithmeticException e){
            System.out.println("não pode ser dividido por zero");
        }finally {
            System.out.println("Fim do programa");
        }
        //----------------------------------------------------------------------------------//
        //Ex4 Ambiguidade entre variável e parâmetro
        //Crie uma classe Pessoa com um atributo nome.
        //No construtor, receba um parâmetro nome e utilize this para diferenciar o atributo do parâmetro.

        Pessoa pessoa = new Pessoa("Chico");
        System.out.println("O nome da pessoa é: " + pessoa.nome);

        //---------------------------------------------------------------------------------//
        //Ex5 Chamar métodos com this
        //Adicione um metodo exibirNome() na classe Pessoa
        //e chame-o a partir de outro metodo utilizando this.exibirNome().
        pessoa.Apresentar();

        //-------------------------------------------------------------------------------//
        //Ex6 Exercício 1 – Conceito prático
        //Explique com código simples a diferença entre uma classe e um objeto em Java.
        //Classe = Pessoa
        //Objeto = pessoa

        //--------------------------------------------------------------------------------//
        //Ex7 Classe Livro

        //Crie uma classe Livro com atributos e crie 3 objetos diferentes dela no main.
        Livro livro1 = new Livro("Livro 1");
        Livro livro2 = new Livro("Livro 2");
        Livro livro3 = new Livro("Livro 3");
        System.out.println(livro1.nome + " " + livro2.nome + " " + livro3.nome);
        //----------------------------------------------------------------------------------//

        //Ex8 Classe Carro
        //Crie uma classe Carro com os atributos marca e ano.
        //Instancie dois objetos da classe e imprima suas informações.
        Carro carro1 = new Carro("Gol", 1995);
        Carro carro2 = new Carro("Fiat", 1987);
        System.out.println("Carro marca: " + carro1.marca + " Ano: " + carro1.ano + "\n" +
                "Carro marca: " + carro2.marca + " Ano: " + carro2.ano);
        //-----------------------------------------------------------------------------------//
        //Ex9 Classe Aluno
        //Crie uma classe Aluno, com nome e nota.
        //Crie um metodo que calcule se ele está aprovado (nota >= 6).
        Aluno aluno = new Aluno("Chico", 6);
        aluno.Aprovado();
        //-----------------------------------------------//

        //Ex10 Classe Produto
        //Crie uma classe Produto com atributos nome, preco e quantidade.
        //Inicialize-os com valores e imprima.
        Produto produto = new Produto("coca", 9.50, 2);
        produto.Imprimir();

        //---------------------------------------------------------------//

        //Ex11Classe ContaBancaria
        //Crie uma classe ContaBancaria com saldo como atributo.
        //Crie métodos para depositar e sacar.

        ContaBancaria contaBancaria = new ContaBancaria();
        contaBancaria.Deposito(500);
        contaBancaria.Saque(260);

        //----------------------------------------------------------------//

        //Ex12 Classe Calculadora
        //Crie uma classe Calculadora com métodos soma(), subtrai() e multiplica().

        Calculadora calculadora = new Calculadora(10,2);
        calculadora.soma();
        calculadora.subtrair();
        calculadora.multiplica();

        //-----------------------------------------------------------------//

        //Ex13 Classe Funcionário
        //Crie uma classe Funcionário com metodo calculaSalario()
        //que recebe horas e valor/hora como parâmetro.

        Funcionario funcionario = new Funcionario(220, 12);
        funcionario.CalcularSalario();

        //----------------------------------------------------------------//

        //Ex14 Classe Pessoa
        //Crie uma classe Pessoa com atributo idade privado.
        //Crie métodos setIdade e getIdade.

        PessoaEncap pessoaEncap = new PessoaEncap();
        pessoaEncap.setIdade(28);
        System.out.println(pessoaEncap.getIdade());

        //----------------------------------------------------------------//

        //Ex15 Classe Conta
        //Crie uma classe Conta com atributos numero e saldo.
        //Torne-os privados e acesse-os por métodos públicos.

        Conta conta = new Conta();
        conta.setNumero(84848);
        conta.setSaldo(998.50);
        System.out.println(conta.getNumero());
        System.out.println(conta.getSaldo());

        //----------------------------------------------------------------//

        //Ex16 Classe Produto
        //Na classe Produto, use get e set para modificar e exibir o valor de preco.

        ProdutoEncap produtoEncap = new ProdutoEncap("Pepsi", 3);
        produtoEncap.setPreco(8.50);
        double precoProduto = produtoEncap.getpreco();
        System.out.println(produtoEncap.nome + "\n" + produtoEncap.quantidade + "\n" + precoProduto);

        //--------------------------------------------------------------------//

        //Ex17 Classe Aluno
        //Crie uma classe Aluno com nota privada.
        //Crie métodos setNota() com validação (0 a 10) e getNota().

        AlunoEncap alunoEncap = new AlunoEncap("Chico");
        alunoEncap.setNota(11);
        alunoEncap.ResumoAluno();


    }
}



