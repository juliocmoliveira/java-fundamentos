public abstract class People {

    private String name;
    private String cpf;
    private String email;
    private int quantityBooksLoan;
    private final int quantityMaxBooks;
    private final int quantityDaysOfBorrwed;

    public People(String name, String cpf, String email, int quantityBooksLoan, int quantityMaxBooks, int quantityDaysOfBorrwed) {
        this.name = name;
        this.cpf = cpf;
        this.email = email;
        this.quantityBooksLoan = quantityBooksLoan;
        this.quantityMaxBooks = quantityMaxBooks;
        this.quantityDaysOfBorrwed = quantityDaysOfBorrwed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getQuantityMaxBooks() {
        return quantityMaxBooks;
    }

    public int getQuantityDaysOfBorrwed() {
        return quantityDaysOfBorrwed;
    }

    public int getQuantityBooksLoan() {
        return quantityBooksLoan;
    }

    public void setQuantityBooksLoan(int quantityBooksLoan) {
        this.quantityBooksLoan = quantityBooksLoan;
    }
}
