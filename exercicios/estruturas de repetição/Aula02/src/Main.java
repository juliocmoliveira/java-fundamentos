import java.util.Scanner;
import java.util.SortedMap;

public class Main {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        /*
                    IF e Else
        1.

        System.out.print("Escreva sua idade : ");
        int idade = read.nextInt();

        if (idade < 17) {
            System.out.println("Menor de idade");
        } else if (idade > 60) {
            System.out.println("Idoso");
        }else{
            System.out.println("Adulto");
        }

        ====================================
        2.

        System.out.println("Digite sua altura");
        float altura = read.nextFloat();

        System.out.println("Digite seu peso");
        float peso = read.nextFloat();

        float imc = (altura * altura) / peso;

        if (imc < 18.5){
            System.out.println("Abaixo do peso");
        } else if (imc > 30) {
            System.out.println("Obesidade");
        } else if (imc >= 18.5 && imc <= 24.9) {
            System.out.println("Peso Normal");
        }else {
            System.out.println("Sobrepeso");
        }
        */
        /*
        ====================================
                    SWITCH
        1.
        System.out.println("Digite o primeiro número");
        int n1 = read.nextInt();

        System.out.println("Digite o segundo número");
        int n2 = read.nextInt();

        System.out.println("Escolha um dos seguintes operadores para ser usado : + - * /");
        String operador = read.next();

        switch (operador){
            case "+" :
                System.out.println(n1 + n2);
                break;
            case "-" :
                System.out.println(n1 - n2);
                break;
            case "*" :
                System.out.println(n1 * n2);
                break;
            case "/" :
                System.out.println(n1 / n2);
                break;
            default:
                System.out.println("Operador inválido");
        }

         ====================================
         2.
        System.out.println("Insira um código de 1-5 para selecionar a categoria");
        int categoria = read.nextInt();

        switch (categoria){
            case 1:
                System.out.println("Alimentos");
                break;
            case 2:
                System.out.println("Bebidas");
                break;
            case 3:
                System.out.println("Vestuário");
                break;
            case 4:
                System.out.println("Eletrônicos");
                break;
            case 5:
                System.out.println("Limpeza");
                break;
        }
        ====================================
                    WHILE
        1.
        int valor = 1;
        int soma = 0;
        while (valor != 0){
            System.out.println("Digite um número para ser somado 0 - sair");
            valor = read.nextInt();
            soma += valor;
            System.out.println("Soma atual : " + soma);
        }
        System.out.println("Soma total : " + soma);
        ====================================
        2.
        System.out.println("Digite um número Maior que 1");
        int numero = read.nextInt();
        while (numero >= 1){
            System.out.println(numero);
            numero--;
        }
        ====================================
                    DO-WHILE
        1.
        int numero = 0;
        do {
            System.out.println("Digite um número secreto e saia do programa");
            numero = read.nextInt();
        }while (numero != 0);
        System.out.println("Parabens saiu do programa");

        ====================================
        2.
        String senhaCorreta = "And";
        String senhaDigitada;
        do {
            System.out.println("Digite sua senha");
            senhaDigitada = read.next();
        }while (senhaDigitada == senhaCorreta );



        System.out.println("Digite um número para ver a tabuada");
        int numero = read.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + " X " + i + " : " + (numero * i) );
        }

         */

        System.out.println("Digite um número para descobrir a soma de 1 até esse número");
        int numero = read.nextInt();
        int somaTotal = 0;

        for (int i = 0; i < numero; i++) {
            System.out.println(numero);
            int numeroMenosUm = numero - 1;
            somaTotal = numero + numeroMenosUm;
            numero--;

        }
        System.out.println(somaTotal);
    }

}