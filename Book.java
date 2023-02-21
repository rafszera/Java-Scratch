import java.util.ArrayList;

public class Book {
    public String tittle;
    public String author; 
    
    public String toString() {
        return String.format("%s by %s", this.tittle, this.author);
    }
}
