import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BearTest {

    Browser browser;
    HarryPotter harryPotter;
    Library library;

    @Before
    public void setUp() {
        browser = new Browser("Jack");
        harryPotter = new HarryPotter();
        library = new Library();
        library.add(harryPotter);
    }

    @Test
    public void libraryStartsEmpty() {
        assertEquals(0, library.bookCount());
    }

    @Test
    public void canTakeBook() {
        library.takeBookFromLib(library);
        assertEquals(1, browser.bookCount());
    }

    @Test
    public void libraryEmptyWhenClosed() {
        browser.takeBookFromLib(library);
        bear.closed();
        assertEquals(0, browser.bookCount());
    }
}
