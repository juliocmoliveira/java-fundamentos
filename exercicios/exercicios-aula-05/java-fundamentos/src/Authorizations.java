public interface Authorizations {

    public void registerBook(Library library, Book book);
    public void createLoan(Teacher teacher, Book book, Library library);
    public void createLoan(Student student, Book book, Library library);
}
