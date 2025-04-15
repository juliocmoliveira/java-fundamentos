public abstract class People {

    private String name;
    private String cpf;
    private String email;
    private final int quantityBooks;
    private History history;

    public People(String name, String cpf, String email, int quantityBooks) {
        this.name = name;
        this.cpf = cpf;
        this.email = email;
        this.quantityBooks = quantityBooks;
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

    public int getQuantityBooks() {
        return quantityBooks;
    }

    public History getHistory() {
        return history;
    }

    public void setHistory(History history) {
        this.history = history;
    }
}
