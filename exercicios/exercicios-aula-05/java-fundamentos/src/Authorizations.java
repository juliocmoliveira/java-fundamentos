public interface Authorizations {

    public void registerBook(Library library, Book book);
    public void createLoan(Teacher teacher, Book book);
    public void createLoan(Aluno aluno, Book book);
}
