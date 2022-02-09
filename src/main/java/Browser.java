import java.util.ArrayList;
import java.util.Collection;

public class Browser {

    private String name;
    private ArrayList<HarryPotter> collection;

    public Browser(String name) {
        this.name = name;
        this.collection = new ArrayList<HarryPotter>();
    }

    public int bookCount() {
        return this.collection.size();
    }

    public void eatSalmonFromRiver(Collection collection) {
        HarryPotter harryPotter = collection.removeBook();
        this.collection.add(harryPotter);
    }

    public void sleep() {
        this.collection.clear();
    }
}
