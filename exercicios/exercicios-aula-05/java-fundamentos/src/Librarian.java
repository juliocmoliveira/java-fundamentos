import java.time.Instant;
import java.time.temporal.TemporalAmount;

import static java.time.temporal.ChronoUnit.DAYS;

public class Librarian extends People implements Authorizations {

    public void registerBook(Library library, Book book) {
        library.setBook(book);
    }

    public void createLoan(Teacher teacher, Book book) {
        Loan loan = new Loan(Instant.now(), Instant.now().plus(15, DAYS));
    }

    public Librarian(String name, String cpf, String email) {
        super(name, cpf, email);
    }
}
