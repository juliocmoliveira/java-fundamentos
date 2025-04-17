public interface Authorizations {

    public void registerBook(Library library, Book book);
    public void registerCategory(Library library, Category category);
    public void registerLoan(Teacher teacher, Book book, Library library);
    public void registerLoan(Student student, Book book, Library library);
}
