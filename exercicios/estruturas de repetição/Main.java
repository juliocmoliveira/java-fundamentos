import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //Classificação de Idade
        int idade = 23;
        if (idade <= 17) {
            System.out.println("Menor de idade");
        } else if (idade <= 59) {
            System.out.println("Adulto");
        } else {
            System.out.println("Idoso");
        }
        //----------------------------------------------------------//

        //Calculadora de IMC
        float peso = 69.85f;
        float altura = 1.75f;
        float imc = peso / (altura * altura);
        if (imc < 18.5) {
            System.out.println("Abaixo do peso");
        } else if (imc >= 18.5 && imc <= 24.9) {
            System.out.println("Peso normal");
        } else if (imc >= 25 && imc <= 29.9) {
            System.out.println("Sobrepeso");
        } else {
            System.out.println("Obesidade");
        }
        //--------------------------------------------------------------//

        //Menu de Operações Matemáticas
        int n1 = 10;
        int n2 = 20;
        int operacao = 3;
        float total = 0;
        switch (operacao) {
            case 1:
                total = n1 + n2;
                System.out.println("Total: " + total);
                break;
            case 2:
                total = n1 - n2;
                System.out.println("Total: " + total);
                break;
            case 3:
                total = n1 * n2;
                System.out.println("Total: " + total);
                break;
            case 4:
                total = n1 / n2;
                System.out.println("Total: " + total);
                break;
        }
        //-----------------------------------------------------------------/

        //Categoria de Produto
        int codigoProduto = 4;
        switch (codigoProduto){
            case 1:
                System.out.println("Alimentos");
                break;
            case 2:
                System.out.println("Bebidas");
                break;
            case 3:
                System.out.println("Vestuario");
                break;
            case 4:
                System.out.println("Eletronicos");
                break;
            case 5:
                System.out.println("Limpeza");
                break;
        }
        //------------------------------------------------------------//
        //Soma de Números até Zero
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um numero");
        int numeroAteZero = sc.nextInt();
        sc.nextLine();
        int totalAteZero = 0;
        while (numeroAteZero > 0){
            totalAteZero += numeroAteZero;
            numeroAteZero -= 1;
        }
        System.out.println(totalAteZero);
        //------------------------------------------------------------------//
        //Contagem Regressiva
        System.out.println("Digite um numero: ");
        int numeroContagemRegressiva = sc.nextInt();
        sc.nextLine();
        while( numeroContagemRegressiva > 0){
            System.out.println(numeroContagemRegressiva);
            numeroContagemRegressiva -= 1;
        }
        //--------------------------------------------------------------------//
        //Menu de Opções
        int numeroMenu = 0;
        do {
            System.out.println("Bem vindo ao menu\n" +
                    "1-Falar com atendente\n" +
                    "2- Ouvir novamente\n" +
                    "0- Sair\n");
            numeroMenu = sc.nextInt();
            sc.nextLine();
        }while (numeroMenu != 0);
        //------------------------------------------------------------------------//
        //Senha Correta
        int senha = 1234;
        int senhaDigitada;
        do{
            System.out.println("Digite sua senha: ");
            senhaDigitada = sc.nextInt();
            sc.nextLine();
        }while (senhaDigitada != senha);
        //---------------------------------------------------------------------//
        //Tabuada de um número

        System.out.println("Digite um numero: ");
        int numeroTabuada = sc.nextInt();
        int tabuada;
        for (int i = 1; i <= 10 ; i++) {
            tabuada = numeroTabuada * i;
            System.out.println(i + " x " + numeroTabuada + "= " + tabuada);
        }
        //--------------------------------------------------------------//
        //Soma de 1 a N

        System.out.println("Digite um numero: ");
        int numeroAteN = sc.nextInt();
        int totalNumeroAteN = 0;
        for (int i = 1; i <= numeroAteN ; i++) {
            totalNumeroAteN += i;
        }
        System.out.println("Total da soma do 1 ate o numero: " + totalNumeroAteN);
        //-----------------------------------------------------------------//
        //Imprimir elementos de um vetor
        int[] vetor = {1,2,3,4,5};
        System.out.println("Numero dentro do vetor:");
        for(int n : vetor){
            System.out.println(n);
        }
        //-------------------------------------------------------------------//
        //Soma dos elementos de um vetor
        int [] vetorSoma = {1,2,3,4,5};
        int totalVetor = 0;
        System.out.println("Soma dos numeros do vetor:");
        for (int n: vetor){
            totalVetor += n;
        }
        System.out.println(totalVetor);



    }
}