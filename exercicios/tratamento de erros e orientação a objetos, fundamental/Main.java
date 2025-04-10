public class Exercicio1 {
    public static void main(String[] args) {
        int num1 = 5;
        int num2 = 0; 

        try {
            int resultado = num1 / num2;
            System.out.println("Resultado:" + resultado);
        } catch (ArithmeticException e) {
            System.out.println("Erro: Não dividi por zero.");
        }
    }
}
public class Exercicio2 {
    public static void main(String[] args) {
        String entrada = "abc";

        try {
            int numero = Integer.parseInt(entrada);
            System.out.println("Você digitou o numero inteiro: " + numero);
        } catch (NumberFormatException e) {
            System.out.println("Erro: O valor digitado não é um numero inteiro.");
        }
    }
}
public class Exercicio3 {
    public static void main(String[] args) {
        int numero = 0;

        try {
            int resultado = 100 / numero;
            System.out.println("Resultado: " + resultado);
        } catch (ArithmeticException e) {
            System.out.println("Erro: Divisão por zero.");
        } finally {
            System.out.println("Fim da execução...");
        }
    }
}

