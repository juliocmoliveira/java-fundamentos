public class Livro {
    private String titulo;
    private String autor;
    private int anopublicacao;

    public Livro(String titulo, String autor, int anopublicacao){
        this.titulo = titulo;
        this.autor = autor;
        this.anopublicacao = anopublicacao;

    }
    public void exibirDados(){
        System.out.println(titulo);
        System.out.println(autor);
        System.out.println(anopublicacao);
    }
}
