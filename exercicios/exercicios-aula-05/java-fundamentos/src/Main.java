public class Main {
    public static void main(String[] args) {

        // Criação da biblioteca
        Library library = new Library();

        // Criação de uma categoria e atribuição da categoria à biblioteca.
        Category category = new Category("Romance");
        library.setCategory(category);

        //Criação de um livro e atribuição do livro à biblioteca.
        Book book = new Book("1984", "George Orwell", "kjhiuiui", 2, category);
        library.setBookAvailable(book);

        // Criação de uma pessoa, do tipo estudante.
        Student student = new Student("Ricardo", "12312312332", "ricardo@hotmail.com");

        //Criação de um bibliotecário.
        Librarian librarian = new Librarian("Júlio Oliveira", "053276609439", "julio@outlook.com");

        //Criação de um empréstimo e também o registro do empréstimo na biblioteca.
        librarian.registerLoan(student, book, library);
        System.out.println(library.getLoans());

        // Criação de uma pessoa, do tipo professor.
        Teacher teacher = new Teacher("Peretro", "12345678593", "peretro@hotmail.com");

        // Criando um empréstimo para professor e também registrando o empréstimo na bibilioteca.
        Book book2 = new Book("A revolução dos bichos", "George Orwell", "kkkkkkk", 2, category);
        library.setBookAvailable(book2);
        librarian.registerLoan(teacher, book2, library);
        System.out.println(library.getLoans().size());

        library.getLoans().forEach(loan -> System.out.println(loan.getBook().getTitle()));

    }
}