import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Ex1 Crie um vetor com 10 números inteiros. Preencha manualmente e exiba somente os valores pares.
        int[] vetor = {1,2,3,4,5,6,7,8,9,10};
        for (int numero : vetor){
            if (numero % 2 == 0){
                System.out.println(numero);
            }
        }
        //------------------------------------------------------------//
        //Ex2 Crie um vetor com 8 números inteiros negativos e positivos. Calcule a soma apenas dos números positivos.
        int[] vetorPositivoNegativo = {-1,-2,-3,-4,-5,1,2,3,4,5};
        int total = 0;
        for (int n1 : vetorPositivoNegativo){
            if(n1 > 0){
                total += n1;
            }

        }
        System.out.println("Total: " + total);
        //------------------------------------------------------------------//
        //Ex3 Declare um vetor de double com tamanho 5. Peça ao usuário para digitar os valores. Depois exiba todos os valores multiplicados por 2.
        double[] vetorDouble = new double[5];
        int contador = 0;
        for (int i = 0; i < vetorDouble.length; i++) {
            System.out.println("Digite um numero: ");
            vetorDouble[i] = sc.nextDouble();
        }
        for (double nDouble : vetorDouble){

            vetorDouble[contador] = nDouble * 2;
            contador++;
        }
        System.out.println(Arrays.toString(vetorDouble));

        //---------------------------------------------------------------------//
        //Ex4 Peça ao usuário para informar a quantidade de elementos que deseja inserir (máx 20).
        // Crie um vetor desse tamanho, preencha com números inteiros e exiba a soma total.
        System.out.println("Digite o tamanho do vetor(max 20)");
        int tamanhoVetor = sc.nextInt();
        int[] vetorEx4 = new int [tamanhoVetor];
        int totalEx4 = 0;
        for (int i = 0; i < vetorEx4.length; i++) {
            System.out.println("Digite um numermo");
            vetorEx4[i] = sc.nextInt();
        }
        for (int nEx4 : vetorEx4){
            totalEx4 +=nEx4;
        }
        System.out.println("Total do ex4: " + totalEx4);
        //-------------------------------------------------------------------------//
        //Ex5
        //Crie um vetor com os dias da semana. Peça ao usuário para digitar um número de 1 a 7 e exiba o dia correspondente.

        String[] vetorEx5 = {"domingo","segunda","terça","quarta","quinta","sexta","sabado"};
        System.out.println("Digite um numero de 1 a 7 correnpondente a um dia da semana: ");
        int dia = sc.nextInt();
        switch (dia){
            case 1:
                System.out.println(vetorEx5[0]);
                break;
            case 2:
                System.out.println(vetorEx5[1]);
                break;
            case 3:
                System.out.println(vetorEx5[2]);
                break;
            case 4:
                System.out.println(vetorEx5[3]);
                break;
            case 5:
                System.out.println(vetorEx5[4]);
                break;
            case 6:
                System.out.println(vetorEx5[5]);
                break;
            case 7:
                System.out.println(vetorEx5[6]);
                break;
        }
        //---------------------------------------------------------------//
        //Ex6 Crie um vetor de 6 elementos e permita ao usuário buscar um valor digitando o índice.
        // Se for inválido, exiba uma mensagem.
        int[] vetorEx6 = {1,2,3,4,5,6};
        System.out.println("Digite o indice: ");
        int indice = sc.nextInt();
        switch (indice){
            case 0:
                System.out.println("o valor do indice: " + vetorEx6[0]);
                break;
            case 1:
                System.out.println("o valor do indice: " + vetorEx6[1]);
                break;
            case 2:
                System.out.println("o valor do indice: " + vetorEx6[2]);
                break;
            case 3:
                System.out.println("o valor do indice: " + vetorEx6[3]);
                break;
            case 4:
                System.out.println("o valor do indice: " + vetorEx6[4]);
                break;
            case 5:
                System.out.println("o valor do indice: " + vetorEx6[5]);
                break;
        }
        //-------------------------------------------------------------//
        //Ex7
        //Peça para o usuário digitar 3 números como texto (String).
        // Converta cada um com Integer.parseInt() e calcule o produto entre eles.
        System.out.println("Digite 3 numeros em sequencia: ");
        String[] vetorEx7 = new String [3];
        vetorEx7[0] = sc.nextLine();
        vetorEx7[1] = sc.nextLine();
        vetorEx7[2] = sc.nextLine();
        int ex7N1 = Integer.parseInt(vetorEx7[0]);
        int ex7N2 = Integer.parseInt(vetorEx7[1]);
        int ex7N3 = Integer.parseInt(vetorEx7[2]);
        System.out.println("O total é: " + (ex7N1 + ex7N2 + ex7N3));

        //----------------------------------------------------------------//
        //Ex8 Permita que o usuário digite 5 valores como texto. Converta todos para int e calcule a média aritmética.

        System.out.println("Digite 5 valores: ");
        String[] vetorEx8 = new String[5];
        vetorEx8[0] = sc.nextLine();
        vetorEx8[1] = sc.nextLine();
        vetorEx8[2] = sc.nextLine();
        vetorEx8[3] = sc.nextLine();
        vetorEx8[4] = sc.nextLine();
        int ex8N1 = Integer.parseInt(vetorEx8[0]);
        int ex8N2 = Integer.parseInt(vetorEx8[1]);
        int ex8N3 = Integer.parseInt(vetorEx8[2]);
        int ex8N4 = Integer.parseInt(vetorEx8[3]);
        int ex8N5 = Integer.parseInt(vetorEx8[4]);
        double mediaEx8 = (ex8N1 + ex8N2 + ex8N3 + ex8N4 + ex8N5) / 5;
        System.out.println("Media: " + mediaEx8);
        //-------------------------------------------------------------//
        //Ex9 Peça ao usuário para digitar sua idade (int). Converta para String e concatene em uma mensagem amigável.

        System.out.println("Digite sua idade:");
        int idadeEx9 = sc.nextInt();
        String idadeEx9String = String.valueOf(idadeEx9);
        System.out.println("Sua idade é: " + idadeEx9String);

        //-------------------------------------------------------------------------//
        //Ex10 Some dois números inteiros e converta o resultado para String. Depois, exiba o comprimento (número de dígitos) da resposta como texto.
        System.out.println("Digite dois numeros: ");
        int ex10N1 = sc.nextInt();
        int ex10N2 = sc.nextInt();
        int somaEx10 = ex10N1 + ex10N2;
        String somaString = String.valueOf(somaEx10);
        System.out.println("O tamanho da string é: " + somaString.length());

    }
}