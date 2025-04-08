//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Exercicio 1 Crie três variáveis com seus dados e imprima no console.
        String nome = "Ricardo";
        int idade = 28;
        String cep = "89087-110";

        System.out.println("Meu nome é " + nome);
        System.out.println("Minha idade é " + idade);
        System.out.println("Meu cep é " + cep);
        //------------------------------------------------------------------//

        //Exercicio 2 Calcule o valor total de uma compra com base em duas variáveis: preço unitário e quantidade.
        float precoUnitario = 5;
        int quantidade = 10;
        float valorTotal = precoUnitario * quantidade;
        System.out.println("O preço total é: " + valorTotal);

        //------------------------------------------------------------------//

        //Exercicio 3 Calcule o salário mensal de uma pessoa considerando valor por hora e horas trabalhadas por semana.
        double valorHora = 12.40;
        int horasTrabalhadas = 220;
        double salarioMensal = valorHora * horasTrabalhadas;

        System.out.printf("O salário mensal é: %.2f%n", salarioMensal);

        //------------------------------------------------------------------//

        //Exercicio 4 Some dois números inteiros.
        int n1 = 13;
        int n2 = 7;

        System.out.println("A soma dos dois numeros é: " + (n1 + n2));

        //------------------------------------------------------------------//

        //Exercicio 5 Calcule a média de três notas.
        int nota1 = 10;
        int nota2 = 9;
        int nota3 = 8;

        System.out.println("A media das notas é: " + ((nota1 + nota2 + nota3) /3));

        //---------------------------------------------------------------//

        //Exercicio 6 Calcule o IMC (Índice de Massa Corporal) com base no peso e altura.
        int peso = 69;
        double altura = 1.75;
        double imc = peso / (altura * altura);

        System.out.printf("O imc da pessoa é: %2f%n", imc);

        //-----------------------------------------------------------------//

        //Exercicio 7 Verifique se dois números são iguais.
        int numero1 = 10;
        int numero2 = 10;
        if (numero1 == numero2){
            System.out.println("Os numeros são iguais");

        }else{
            System.out.println("Os numeros são diferentes");
        }

        //--------------------------------------------------------------//
        //Exercicio 8 Verifique se uma pessoa é maior de idade.
        int idadeMaiorMenor = 19;

        if (idadeMaiorMenor >= 18){
            System.out.println("Ele é maior de idade");
        }else{
            System.out.println("Ele é menor de idade");
        }

        //---------------------------------------------------------//

        //Exercicio 9 Verifique se um aluno passou com nota maior ou igual a 7 e presença maior que 75%.
        float nota = 8.5f;
        float presenca = 65.3f;

        if (nota >= 7 && presenca >= 75){
            System.out.println("Aluno aprovado");
        }else{
            System.out.println("Aluno reprovado");
        }

        //----------------------------------------------------//
        //Exercicio10 Verifique se uma pessoa tem mais de 18 anos e é brasileira.
        int idadeBrasileiraOuNao = 22;
        boolean brasileira = true;

        if(idadeBrasileiraOuNao >= 18 && brasileira){
            System.out.println("Ela tem mais 18 anos e é brasileira");
        }else if (idadeBrasileiraOuNao >= 18 && !brasileira) {
            System.out.println("Ela é maior de idade mas não é brasileira");
        } else if (idadeBrasileiraOuNao <= 18 && brasileira) {
            System.out.println("Ela é menor de idade mas é brasileira");
        } else{
            System.out.println("Ela é menor de idade e não é brasileira");
        }

        //---------------------------------------------------------------------//
        //Exercicio 11 Verifique se uma pessoa tem direito ao benefício: desempregada ou renda < 1500.

        double renda = 1700;
        boolean desempregada = false;

        if (renda < 1500 || desempregada){
            System.out.println("Ela tem direito ao beneficio");
        }else{
            System.out.println("Ela não tem direito ao beneficio");
        }

        //------------------------------------------------------------------//
        //Exercicio 12 Verifique se um login é válido: usuário e senha corretos.
        String login = "chico";
        String senha = "moedas";

        if(login.equals("chico") && senha.equals("moedas")){
            System.out.println("Login e senha corretos");
        }else{
            System.out.println("Login ou senha incorretos");
        }

        //--------------------------------------------------------------------//
        //Exercicio 13
        String nomeAluno = "Ricardo";
        int idadeAluno = 28;
        double notaAluno1 = 10;
        double notaAluno2 = 9;
        int frequenciaAluno = 100;
        double mediaAluno = (notaAluno1 + notaAluno2) / 2;
        boolean maiorDeIdade = false;
        boolean aprovado = false;

        if (idadeAluno >= 18){
            maiorDeIdade = true;
        }
        if (mediaAluno >= 7 && frequenciaAluno >=75){
            aprovado = true;
        }
        System.out.println("nome: " + nomeAluno);
        System.out.println("idade: " + idadeAluno + " anos");
        System.out.println("media: " + mediaAluno);
        System.out.println("A frequencia do aluno foi: " + frequenciaAluno + "%");
        if (maiorDeIdade){
            System.out.println("Aluno maior de idade");
        }else{
            System.out.println("Aluno menor de idade");
        }
        if(aprovado){
            System.out.println("Aluno aprovado");
        }else{
            System.out.println("Aluno reprovado");
        }



    }
}