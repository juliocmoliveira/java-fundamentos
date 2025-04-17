import java.time.Instant;
import java.util.List;
import java.util.Optional;

import static java.time.temporal.ChronoUnit.DAYS;

public class Librarian extends People implements Authorizations {

    public Librarian(String name, String cpf, String email) {
        super(name, cpf, email, 0, 0, 0);
    }

    public void registerBook(Library library, Book book) {
        boolean categoryIsValid = this.verifyIfCategoryIsValid(library, book);
        if (categoryIsValid) {
            library.setBookAvailable(book);
        }
    }

    private boolean verifyIfCategoryIsValid(Library library, Book book) {
        return library.getCategoryList().contains(book.getCategory());
    }

    public void registerCategory(Library library, Category category) {
        library.setCategory(category);
    }

    public List<History> consultHistories(Library library, People people){
            return library
                    .getHistories()
                    .stream()
                    .filter( history -> history.getLoan().getPeople().getCpf().equals(people.getCpf()))
                    .toList();
    }

    public void registerLoan(Teacher teacher, Book book, Library library) {
        this.createLoan(library, teacher, book);
    }

    public void registerLoan(Student student, Book book, Library library) {
        this.createLoan(library, student, book);
    }

    private void createLoan(Library library, People people, Book book) {
        List<Loan> LateLoans = this.verifyIfLateLoan(library, people);
        boolean loanPossibilityVerification = this.isMaxQuantityBook(people) && this.verifyBookAvailable(library, book) && LateLoans.isEmpty();

        if (loanPossibilityVerification) {
            Loan loan = new Loan(
                    Instant.now(),
                    Instant.now().plus(people.getQuantityDaysOfBorrwed(), DAYS),
                    people,
                    book
            );

            library.setLoan(loan);

            this.updateBook(library, book);
            people.setQuantityBooksLoan(people.getQuantityBooksLoan()+1);
        } else {
            System.out.println("Livro não criado!");
        }
    }

    private void updateBook(Library library, Book book) {
        library.addBookInBorrowed(book);
        library.removeBookListAvailable(book);
        decrementRemainingCopy(book);
    }

    private List<Loan> verifyIfLateLoan(Library library, People people) {
        return library
                .getLoans()
                .stream()
                .filter(loan -> loan.getPeople().getCpf().equals(people.getCpf()))
                .toList()
                .stream()
                .filter(loan -> loan.getFinalDate().isBefore(Instant.now()))
                .toList();
    }

    public void finalizeLoan(Book book, Library library) {
        Optional<Loan> borrwed = library
                .getLoans()
                .stream()
                .filter(loan -> loan.getBook().getIsbn().equals(book.getIsbn()))
                .findFirst();

        if (borrwed.isPresent()) {
            Loan loan = borrwed.get();
            loan.setRealDateDevolution(Instant.now());

            this.createNotification(loan);

            createHistory(book, library, loan);

            loan.getPeople().setQuantityBooksLoan(loan.getPeople().getQuantityBooksLoan()-1);
        }
    }

    private void createNotification(Loan loan) {
        boolean isLate = loan.getFinalDate().isBefore(loan.getRealDateDevolution());
        if (isLate) {
            Notification notification = new Notification(Instant.now());
            loan.setNotification(notification);
        }
    }

    private static void createHistory(Book book, Library library, Loan loan) {
        History history = new History(loan);
        library.setHistory(history);
        library.getLoans().remove(loan);
        book.setRemainingCopy(book.getRemainingCopy()+1);
        library.removeBookInBorrowed(book);
    }

    private boolean isMaxQuantityBook(People people) {
        return people.getQuantityBooksLoan() < people.getQuantityMaxBooks();
    }

    private boolean verifyBookAvailable(Library library, Book book) {
        boolean copyAvailable = book.getRemainingCopy() > 0;
        boolean bookIsNotLoan = true;
        if (library.verifyIfLoan(book).isPresent()) {
            bookIsNotLoan = !library.verifyIfLoan(book).get();
        }
        return copyAvailable && bookIsNotLoan;
    }

    private void decrementRemainingCopy(Book book) {
        book.setRemainingCopy(book.getRemainingCopy()-1);
    }
}
