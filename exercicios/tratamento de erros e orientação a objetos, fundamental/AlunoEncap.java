public class AlunoEncap {
    String nome;
    private double nota;

    public AlunoEncap(String nome){
        this.nome = nome;
    }

    public void setNota(double nota){
        if(nota >= 0 && nota <=10){
            this.nota = nota;
        }else{
            System.out.println("Nota invalidade");
        }
    }
    public double getNota(){
        return nota;
    }

    public void ResumoAluno(){
        System.out.println(this.nome);
        System.out.println(this.nota);
    }
}
