
public class Main {
    public static void main(String[] args) {
        //--------Topico variaveis --------
        //---------- Tarefa 1 --------------
        String nome = ("Lucas Dias");
        int idade = 24;
        String endereço = ("Blumenau - SC");
        System.out.println("Meu nome é: " + nome + "Minha idade: " + idade + "Endereço: " + endereço);

        //---------- Tarefa 2 --------------
        String produto = ("Café");
        int valor = 50;
        int quantidade = 3;
        int total = valor * quantidade;

        System.out.println("Sua compra de " + quantidade + " unidade de " + produto + " com valor de R$" + valor + " deu:");
        System.out.println("R$" + total);
        //---------- Tarefa 3 --------------
        String funcionario = "Lucas Dias";
        float salarioPorHora = 19.50f;
        int horaSemanal = 40;
        float salarioMensal = ((horaSemanal / 5) * salarioPorHora) * 23;
        float salarioSemanal = horaSemanal * salarioPorHora;
        System.out.println("Salario mensal com 23 dias trabalhados da: R$" + salarioMensal);
        System.out.println("Salario semanal com 40 horas trabalhados da: R$" + salarioSemanal);
        //--------Topico operadores aritméticos --------
        //---------- Tarefa 1 --------------
        int numero1 = 50;
        int numero2 = 30;
        int soma = numero1 + numero2;
        System.out.println("Soma:" + soma);
        //---------- Tarefa 2 --------------
        float nota1 = 4.5f;
        float nota2 = 7.0f;
        float nota3 = 9.0f;
        float media = (nota2 + nota1 + nota3) / 3;
        System.out.println("Média:" + media);
        //---------- Tarefa 3 --------------
        float peso = 93.00f;
        float altura = 1.80f;
        float imc = peso / (altura * altura);
        if (imc < 18.5) {
            System.out.println("Classificação: Abaixo do peso");
        } else if (imc >= 18.5 && imc < 24.9) {
            System.out.println("Classificação: Peso normal");
        } else if (imc >= 25 && imc < 29.9) {
            System.out.println("Classificação: Sobrepeso");
        } else if (imc >= 30 && imc < 34.9) {
            System.out.println("Classificação: Obesidade grau I");
        } else if (imc >= 35 && imc < 39.9) {
            System.out.println("Classificação: Obesidade grau II");
        } else {
            System.out.println("Classificação: Obesidade grau III (obesidade mórbida)");
        }
        //--------Topico operadores relacionais --------
        //---------- Tarefa 1 --------------
        int numeroUm = 1;
        int numeroDois = 2;
        boolean comparar = numeroUm == numeroDois;
        if (comparar == true) {
            System.out.println("Numeros são iguais!");
        } else {
            System.out.println("Numeros são diferentes!");
        }
        //---------- Tarefa 2 --------------
        int idade1 = 24;
        if (idade1 >= 18) {
            System.out.println("A pessoa é maior de idade");
        } else {
            System.out.println("A pessoa não é maior de idade");
        }
        //---------- Tarefa 3 --------------
        int presenca = 78;
        float nota11 = 4.5f;
        float nota22 = 7.0f;
        float nota33 = 9.0f;
        float media1 = (nota22 + nota11 + nota33) / 3;
        if (media1 >= 7 && presenca >= 75) {
            System.out.println("Aluno passou de ano \n" + "Sua nota é " + media1);
        } else {
            System.out.println("Aluno reprovou de ano \n" + "Sua nota é " + media1);
        }
        //--------Topico operadores logicos --------
        //---------- Tarefa 1 --------------
        int idade2 = 24;
        String nacionalidade = "Alemão";
        if (idade2 >= 18 && nacionalidade == "Brasileiro") {
            System.out.println("A pessoa está liberada");
        } else {
            System.out.println("A pessoa não está liberada");
        }
        //---------- Tarefa 2 --------------
        int renda = 1650;
        if (renda <= 1500) {
            System.out.println("A pessoa tem direito ao beneficio");
        } else {
            System.out.println("A pessoa não tem direito ao beneficio");
        }
        //---------- Tarefa 3 --------------
        String emailConf = "lucas@proway.com.br";
        String senhaConf = "lucas123";
        System.out.println("Digite seu email:\n");
        // entrada de dados (ainda não sei alguma entrada de dados)
        String email = "lucas@proway.com.br";
        System.out.println("Digite seu email:\n");
        // entrada de dados
        String senha = "lucas1233";
        if (email == emailConf && senha == senhaConf) {
            System.out.println("Seus dados estão validos");
        } else {
            System.out.println("Seus dados não são validos");
        }


        // Atividade Integradora - Cadastro e Avaliação de Aluno
        /*
            String nome= "Lucas";
            int idade = 24;
            double nota1 = 8.5;
            double nota2 = 7.0;
            int frequecia = 90;
            //calculos
            double media = (nota2 + nota1)/2;
            String verIdade= "";
            if (idade >= 18){
                 verIdade = "Maior de idade";
            }else {
                 verIdade = "Menor de idade";
            }
            String verMedia = "";
            if (media >= 7 && frequecia >= 75){
                verMedia = "Aprovado!";
            }else {
                verMedia = "Reprovado!";
            }
            System.out.println(
                    "Nome:"+nome+"\nIdade:"+idade+"\nPrimeira nota:"+nota1+"\nSegunda nota:"+nota2+"\nMédia:"+media+"\nFrequência:"+frequecia+"\n"+verIdade+"\n"+verMedia
                    );
        */

    }
}
