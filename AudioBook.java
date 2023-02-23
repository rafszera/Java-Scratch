public class AudioBook extends Book {
    private int runTime;

    AudioBook(String tittle, String author, int runTime) {
        super (tittle, author, 0);
        
        this.runTime = runTime;
    }
}