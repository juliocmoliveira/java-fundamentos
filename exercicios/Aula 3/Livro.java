public class Livro {
    private String nome;
    private String genero;
    private double valor;

    public Livro(String nome, String genero, double valor){
        this.nome = nome;
        this.genero = genero;
        this.valor = valor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
}
