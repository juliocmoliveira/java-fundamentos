public class Main {
    public static void main(String[] args) {

        Librarian librarian = new Librarian("Julio", "063", "julio@outlook.com");
        Category category = new Category("Categoria");
        Book book = new Book("1984", "George Orwell", "12345678", 6, category);
    }
}