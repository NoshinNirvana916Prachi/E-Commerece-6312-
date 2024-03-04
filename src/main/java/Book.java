public class Book extends Product {
    private String isbn;
    private String author;
    private String genre;
    private int pageCount;

    // Constructor
    public Book(String productId, String productName, float cost, String description,
                String isbn, String author, String genre, int pageCount) {
        super(productId, productName, cost, description);
        this.isbn = isbn;
        this.author = author;
        this.genre = genre;
        this.pageCount = pageCount;
    }

    // Getters
    public String getIsbn() {
        return isbn;
    }

    public String getAuthor() {
        return author;
    }

    public String getGenre() {
        return genre;
    }

    public int getPageCount() {
        return pageCount;
    }

    // Setters
    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }

    // toString method for displaying book information
    @Override
    public String toString() {
        return "Book{" +
                "isbn='" + isbn + '\'' +
                ", author='" + author + '\'' +
                ", genre='" + genre + '\'' +
                ", pageCount=" + pageCount +
                ", productId='" + getProductId() + '\'' +
                ", productName='" + getProductName() + '\'' +
                ", cost=" + getPrice() +
                ", description='" + getDescription() + '\'' +
                '}';
    }
}

