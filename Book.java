import java.util.ArrayList;

public class Book {
    private String tittle;
    private String author; 
    public int pageCount;  

    Book(String tittle, String author, int pageCount) {
        this.tittle = tittle;
        this.author = author;
        this.pageCount = pageCount; 
    }

    public String getTittle() {
        return this.tittle;
    }

    public String getAuthor() {
        return this.author;
    }
    
    public String toString() {
        return String.format("%s by %s", this.tittle, this.author);
    }
}
