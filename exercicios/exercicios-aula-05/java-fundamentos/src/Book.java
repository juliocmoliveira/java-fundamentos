public class Book {
    private String title;
    private String author;
    private String isbn;
    private int remainingCopy;
    private Category category;

    public Book(String title, String author, String isbn, int remainingCopy, Category category){
        this.title = title;
        this.author= author;
        this.isbn= isbn;
        this.remainingCopy = remainingCopy;
        this.category= category;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public int getRemainingCopy() {
        return remainingCopy;
    }

    public void setRemainingCopy(int remainingCopy) {
        this.remainingCopy = remainingCopy;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }
}
