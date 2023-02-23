public class Ebook extends Book {
    private String format;

    Ebook(String tittle, String author, int pageCount, String format) {
        super(tittle, author, pageCount);
        this.format = format;

    }
    
}