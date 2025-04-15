import java.time.Instant;

import static java.time.temporal.ChronoUnit.DAYS;

public class Librarian extends People implements Authorizations {

    public Librarian(String name, String cpf, String email) {
        super(name, cpf, email, 0);
    }

    public void registerBook(Library library, Book book) {
        library.setBook(book);
    }


    public void createLoan(Teacher teacher, Book book, Library library) {
        if (this.isMaxQuantityBook(teacher, 5) && this.verifyBook(library, book)) {
            Loan loan = new Loan(
                    Instant.now(),
                    Instant.now().plus(15, DAYS),
                    teacher,
                    book
            );

            library.addBookInBorrowed(book);
            decrementRemainingCopy(book);
        }
    }

    public void createLoan(Student student, Book book, Library library) {
        if (this.isMaxQuantityBook(student, 3) && this.verifyBook(library, book)) {
            Loan loan = new Loan(
                    Instant.now(),
                    Instant.now().plus(5, DAYS),
                    student,
                    book
            );

            library.addBookInBorrowed(book);
            decrementRemainingCopy(book);
        }
    }

    public void finalizeLoan(Book book, Library library) {
        library.getBooksLoan().stream().filter(bLoan -> bLoan.getIsbn().equals(book.getIsbn()));
    }

    private boolean isMaxQuantityBook(People people, int quantity) {
        return people.getQuantityBooks() < quantity;
    }

    private boolean verifyBook(Library library, Book book) {
        return book.getRemainingCopy() != 0 && library.verifyIfLoan(book).isEmpty();
    }

    private void decrementRemainingCopy(Book book) {
        book.setRemainingCopy(book.getRemainingCopy()-1);
    }
}
