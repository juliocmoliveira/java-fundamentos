import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> booksAvailable = new ArrayList<>();
    private List<Book> booksLoan = new ArrayList<>();

    public List<Boolean> verifyIfLoan(Book book) {
        return booksLoan.stream().map(bLoan -> bLoan.getIsbn().equals(book.getIsbn())).toList();
    }

    public void addBookInBorrowed(Book book) {
        booksAvailable.forEach(b -> {
            if (book.getIsbn().equals(b.getIsbn())) {
                this.booksLoan.add(b);
                this.booksAvailable.remove(b);
            }
        });
    }

    public List<Book> getBooksAvailable() {
        return booksAvailable;
    }

    public void setBook(Book book) {
        this.booksAvailable.add(book);
    }

    public List<Book> getBooksLoan() {
        return booksLoan;
    }

    public void setBooksLoan(List<Book> booksLoan) {
        this.booksLoan = booksLoan;
    }
}
