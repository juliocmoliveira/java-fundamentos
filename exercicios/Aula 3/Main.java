import java.util.Scanner;

public class Main {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        /*Product product = new Product("name",10.00,1);

        System.out.println("Nome: "+product.getNome());
        System.out.println("Preço: R$"+product.getPrice());
        System.out.println("Quantidade: "+product.getQuantity());*/

        //tarefa 1
        /* try{
            int n1 = 10;
            int n2 = 0;
            System.out.println(n1/n2);
        }catch (ArithmeticException e){
            System.out.println("não pode dividir por '0'");

        }*/

        //tarefa 2
        /*try {
            System.out.println("Digite um valor que deseja converter para 'Inteiro'");
            String numero = scanner.next();
            int numero1 = Integer.parseInt(numero);
            System.out.println("Numero :" +numero1);
        }catch (NumberFormatException e){
            System.out.println("Erro: valor não é um numero inteiro");
        }*/

        //Tarefa 3
        /*try {
            System.out.println("Digite um numero para dividir por 100");
            double numero = scanner.nextInt();
            double divisao = 100/numero;
            System.out.println("Valor da divisao: "+divisao);
        }catch (ArithmeticException e){
            System.out.println("erro ao dividir");

        }finally {
            System.out.println("Fim da execusão");
        }*/

        //Tarefa conseito OO exercio 2
        /*
        Livro livro1 = new Livro("Harry Potter", "Ficção",60.00);
        Livro livro2 = new Livro("Moby Dick", "Ficção",50.00);
        Livro livro3 = new Livro("O Pequeno Príncipe", "Literatura infatil",40.00);
        */

        //Tarefa classe e objetos exercio 1
        /*
        Carro carro1 = new Carro("Toyota", 2019);
        Carro carro = new Carro("Honda", 2022);
        System.out.println("Marca do carro:"+carro1.getMarca()+" Ano: "+carro1.getAno());
        System.out.println("Marca do carro:"+carro.getMarca()+" Ano: "+carro.getAno());
        */
        //Tarefa classe e objetos exercio 2
        Aluno aluno = new Aluno("Lucas", 8.00, 7.50, 0);

    }
}