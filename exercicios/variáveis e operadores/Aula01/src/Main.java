import java.util.Scanner;


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
       /*
       //1.
       String nome = "Marcos Vinicius Peretro Júnior";
       int idade = 19;
       String endereco = "Aquele lá";


       System.out.print("Meu nome é : " + nome);
       System.out.print("Minha idade é : " + idade);
       System.out.print("Meu endereço é : " + endereco
       );
       */
       /*
       //2.
       double precoUnidade = 2.99;
       int quantidade = 10;


       System.out.print("Preço total : " + (precoUnidade * quantidade));
       */
       /*
       //3
       double valorHora = 11.99;
       float horasTrabalhadasSemana = 42;
       System.out.print("Salario Mensal : " + (valorHora * horasTrabalhadasSemana) * 4);
       */
       /*
       //4
         int numero1 = 100;
         int numero2 = 50;
         int soma = numero2 + numero1;


         System.out.print("A soma dos números " + numero1 + "+" + numero2 + " resulta em : " + soma );
       */
       /*
       //5
       double nota1 = 8.9;
       double nota2 = 8.9;
       double nota3 = 8.9;
       double media = (nota1 + nota2 + nota3) / 3;


       System.out.print("Sua média é : " + media);
       */
       /*
       //6
       double peso = 73;
       double altura = 1.81;
       double imc = peso / (altura * altura);


       System.out.print("Seu imc é : " + imc);
       */
       /*
       //7
       int numero1 = 2;
       int numero2 = 4;
       if (numero2 == numero1) {
           System.out.print("Números iguais");
       }else {
           System.out.print("Números diferentes");
       }
        */
       /*
       //8
       int idade = 18;
       if (idade >= 18){
           System.out.print("Já pode ser preso");
       }else {
           System.out.print("Seus Pais vão ser presos");
       }
        */
       /*
       //9
       int presenca = 80;
       int nota = 5;
       if (presenca > 75 && nota >= 7){
           System.out.print("Aprovado");
       }else{
           System.out.print("Reprovado");
       }
       *//*
        //10
        int idade = 18;
        String nacionalidade = "br";

        if (idade >= 18 && nacionalidade == "br"){
            System.out.println("Brasileiro e pode ser preso");
        } else if (idade < 18 && nacionalidade == "br") {
            System.out.println("Brasileiro e não pode ser preso");
        }  else if (idade >= 18 && nacionalidade != "br") {
            System.out.println("gringo e pode ser preso");
        }  else {
            System.out.println("gringo e não pode ser preso");
        }
        */

        /*
        //11

        */

        /*
        //12
            String usuarioCorreto = "coxinha123";
            String senhaCorreta = "SenhaForte";
            Scanner read = new Scanner(System.in);


            System.out.print("Digite sua senha : ");
            String usuarioDigitado = read.nextLine();

            System.out.print("Digite sua senha : ");
            String senhaDigitada = read.nextLine();

            if (usuarioCorreto == usuarioDigitado && senhaCorreta == senhaDigitada){
                System.out.println("Bem vindo");
            }else {
                System.out.println("Usuario/Senha incorreta");
            }
        */
        /*
        //13
        Scanner read = new Scanner(System.in);
        System.out.println("Insira seu nome");
        String nome = read.nextLine();


        System.out.println("Insira sua idade");
        int idade = Integer.parseInt(read.nextLine());


        System.out.println("Qual foi a primeira nota?");
        double nota1 = Double.parseDouble(read.nextLine());


        System.out.println("Qual foi a segunda nota?");
        double nota2 = Double.parseDouble(read.nextLine());


        System.out.println("Insira sua frequencia");
        int frequencia = Integer.parseInt(read.nextLine());


        double media = (nota1 + nota2) / 2;
        String maiorIdade = idade >= 18 ? "Adulto" : "Criança";
        String situacao = media >= 7 && frequencia > 75 ? "Aprovado" : "Reprovado";


        System.out.println("Nome : " + nome);
        System.out.println("Idade : " + idade);
        System.out.println("Notas : " + (nota1) + ", " + nota2 );
        System.out.println("Media : " + media);
        System.out.println("Frequencia : " + frequencia);

        System.out.println(maiorIdade);
        System.out.println(situacao);
        */
    }
}

