package exceptions;

public class BookNotFoundException extends RuntimeException {
    private String ISBN;
    public BookNotFoundException(String ISBN) {
        this.ISBN = ISBN;
    }
    public String getISBN() {
        return ISBN;
    }
}
