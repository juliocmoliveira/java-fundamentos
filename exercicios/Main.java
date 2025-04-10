
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int idade = 32;

        if (idade <= 17) {
            System.out.println("menor de idade");
        } else if (idade >= 18 && idade <= 59) {
            System.out.println("adulto");
        } else {
            System.out.println("idoso");
        }

        double peso = 72.200;
        double altura = 1.75;
        double imc = peso / (altura * altura);

        System.out.println("Seu imc é: " + imc);

        if (imc < 18.5) {
            System.out.println("Abaixo do peso");
        } else if (imc >= 18.5 && imc <= 24.9) {
            System.out.println("Peso normal");
        } else if (imc >= 25 && imc <= 29.9) {
            System.out.println("Sobrepeso");
        } else {
            System.out.println("Obeso");
        }
        System.out.print("Digite o primeiro número: ");
        double num1 = scanner.nextDouble();

        System.out.print("Digite o segundo número: ");
        double num2 = scanner.nextDouble();


        System.out.print("Digite a operação (1 para (+), 2 para (-) , 3 para (*) , 4 para  (/):");
        int operacao = scanner.nextInt();

        double resultado = 0;

            switch(operacao)

        {
            case 1:
                resultado = num1 + num2;
                break;
            case 2:
                resultado = num1 - num2;
                break;
            case 3:
                resultado = num1 * num2;
                break;
            case 4:
                resultado = num1 / num2;

                break;
            default:
                System.out.println("Operação inválida!");
        }

            System.out.println("O resultado é: " + resultado);
    }



}
