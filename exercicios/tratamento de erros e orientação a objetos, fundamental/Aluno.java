public class Aluno {
    int nota;
    String nome;

    public Aluno(String nome, int nota){
        this.nome = nome;
        this.nota = nota;
    }
    public void Aprovado(){
        if (nota >= 6) {
            System.out.println("Aluno aprovado");
        }else{
            System.out.println("Aluno reprovado");
        }
    }
}
