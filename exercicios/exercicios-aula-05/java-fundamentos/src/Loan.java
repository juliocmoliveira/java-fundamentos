import java.time.Instant;
import java.util.Date;

public class Loan {

    private Instant loanDate;
    private Instant finalDate;
    private Instant realDateDevolution;
    private String people;
    private Book book;

    public Loan(Instant loanDate, Instant finalDate, Instant realDateDevolution, String people, Book book){
        this.loanDate = loanDate;
        this.finalDate = finalDate;
        this.realDateDevolution = realDateDevolution;
        this.people = people;
        this.book = book;
    }

    public Instant getLoanDate() {
        return loanDate;
    }

    public void setLoanDate(Instant loanDate) {
        this.loanDate = loanDate;
    }

    public Instant getFinalDate() {
        return finalDate;
    }

    public void setFinalDate(Instant finalDate) {
        this.finalDate = finalDate;
    }

    public Instant getRealDateDevolution() {
        return realDateDevolution;
    }

    public void setRealDateDevolution(Instant realDateDevolution) {
        this.realDateDevolution = realDateDevolution;
    }

    public String getPeople() {
        return people;
    }

    public void setPeople(String people) {
        this.people = people;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }
}
