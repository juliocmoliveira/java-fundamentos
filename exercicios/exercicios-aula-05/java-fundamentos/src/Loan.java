import java.time.Instant;

public class Loan {

    private Instant loanDate;
    private Instant finalDate;
    private Instant realDateDevolution;
    private People people;
    private Book book;
    private Notification notification;

    public Loan(Instant loanDate, Instant finalDate, People people, Book book) {
        this.loanDate = loanDate;
        this.finalDate = finalDate;
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

    public People getPeople() {
        return people;
    }

    public void setPeople(People people) {
        this.people = people;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public Notification getNotification() {
        return notification;
    }

    public void setNotification(Notification notification) {
        this.notification = notification;
    }
}
