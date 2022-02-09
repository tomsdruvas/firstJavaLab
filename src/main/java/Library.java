import java.util.ArrayList;

public class Library {

    private ArrayList<HarryPotter> book;

    public Library() {
        this.book = new ArrayList<HarryPotter>();
    }

    public void add(HarryPotter harryPotter) {
        this.book.add(harryPotter);
    }

    public int bookCount() {
        return this.book.size();
    }

    public HarryPotter removeBook() {
        return this.book.remove(0);
    }


}
