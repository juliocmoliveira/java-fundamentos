public class Aluno extends People {

    private final int quantityBooks;

    public Aluno(String name, String cpf, String email) {
        super(name, cpf, email);
        this.quantityBooks = 3;
    }

    public int getQuantityBooks() {
        return quantityBooks;
    }
}
