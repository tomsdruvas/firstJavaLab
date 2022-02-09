import java.util.ArrayList;

public class Library {

    private ArrayList<HarryPotter> book;

    public Library() {
        this.book = new ArrayList<book>();
    }

    public void add(HarryPotter harryPotter) {
        this.book.add(harryPotter);
    }

    public int getBookCount() {
        return this.book.size();
    }

    public HarryPotter removeBook() {
        return this.book.remove(0);
    }
}