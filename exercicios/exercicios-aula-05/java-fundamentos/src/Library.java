import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Library {
    private List<Book> booksAvailable = new ArrayList<>();
    private List<Book> booksLoan = new ArrayList<>();
    private List<Loan> loans = new ArrayList<>();
    private List<History> histories = new ArrayList<>();
    private List<Category> categoryList = new ArrayList<>();

    public Optional<Boolean> verifyIfLoan(Book book) {
        return booksLoan.stream().map(bLoan -> bLoan.getIsbn().equals(book.getIsbn())).findFirst();
    }

    public void addBookInBorrowed(Book book) {
        booksAvailable.forEach(b -> {
            if (book.getIsbn().equals(b.getIsbn())) {
                this.booksLoan.add(b);
            }
        });
    }

    public void removeBookListAvailable(Book book) {
        Optional<Book> bookAvailable = booksAvailable.stream().filter(b -> book.getIsbn().equals(b.getIsbn())).findFirst();
        bookAvailable.ifPresent(value -> this.booksAvailable.remove(value));
    }

    public void removeBookInBorrowed(Book book) {
        booksLoan.forEach(b -> {
            if (book.getIsbn().equals(b.getIsbn())) {
                this.booksAvailable.add(b);
                this.booksLoan.remove(b);
            }
        });
    }

    public List<Book> getBooksAvailable() {
        return booksAvailable;
    }

    public void setBookAvailable(Book book) {
        this.booksAvailable.add(book);
    }

    public List<Book> getBooksLoan() {
        return booksLoan;
    }

    public void setBooksLoan(List<Book> booksLoan) {
        this.booksLoan = booksLoan;
    }

    public List<Loan> getLoans() {
        return loans;
    }

    public void setLoan(Loan loan) {
        this.loans.add(loan);
    }

    public List<History> getHistories() {
        return histories;
    }

    public void setHistory(History history) {
        this.histories.add(history);
    }

    public List<Category> getCategoryList() {
        return categoryList;
    }

    public void setCategory(Category category) {
        this.categoryList.add(category);
    }
}
