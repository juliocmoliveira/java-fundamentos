public class Teacher extends People {

    private final int quantityBooks;

    public Teacher(String name, String cpf, String email, int quantityBooks) {
        super(name, cpf, email);
        this.quantityBooks = quantityBooks;
    }

    public int getQuantityBooks() {
        return quantityBooks;
    }
}
