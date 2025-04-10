public class Aluno {
    private String nome;
    private double nota;
    private double nota1;
    private double media;


    public Aluno(String nome, double nota, double nota1, double media){
        this.nome = nome;
        this.nota = nota;
        this.nota1 = nota1;
        this.media = media;

    }

    public void resultado(){
        this.media = nota1
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public double getMedia() {
        return media;
    }

    public void setMedia(double media) {
        this.media = media;
    }
}
