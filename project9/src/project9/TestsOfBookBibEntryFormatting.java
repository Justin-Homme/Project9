package project9;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;


/**
 * Unit tests of the getAPAString() and getMLAString() methods for BookBibEntry objects
 * @author gosnat
 * @version Spring 2021
 */

class TestsOfBookBibEntryFormatting {
	


	/**
	 * A book with no authors
	 */
	@Test
	void testNoAuthors() {
		BookBibEntry b = new BookBibEntry("Star trek chronology: The history of the future",
				null, null, null, null, false, "Pocket Books", 
				1993, "New York", "NY");
		assertEquals("Star trek chronology: The history of the future. (1993). New York, NY: Pocket Books.",
				b.getAPAString());
		assertEquals("Star trek chronology: The history of the future. New York: Pocket Books, 1993. Print.",
				b.getMLAString());
	}
	
	/**
	 * A book with one author
	 */
	@Test
	void testOneAuthor() {
		BookBibEntry b = new BookBibEntry("Star trek chronology: The history of the future",
				"Michael","Okuda", null, null, false, "Pocket Books", 
				1993, "New York", "NY");
		
		assertEquals("Okuda, M. (1993). Star trek chronology: The history of the future. New York, NY: Pocket Books.",
				b.getAPAString());
		assertEquals("Okuda, Michael. Star trek chronology: The history of the future. New York: Pocket Books, 1993. Print.",
				b.getMLAString());
	}
	
	/**
	 * A book with two authors
	 */
	@Test
	void testTwoAuthors() {
		BookBibEntry b = new BookBibEntry("Star trek chronology: The history of the future",
				"Michael","Okuda", "Denise", "Okuda", false, "Pocket Books", 
				1993, "New York", "NY");
		assertEquals("Okuda, M. & Okuda, D. (1993). Star trek chronology: The history of the future. New York, NY: Pocket Books.",
				b.getAPAString());
		assertEquals("Okuda, Michael, and Denise Okuda. Star trek chronology: The history of the future. New York: Pocket Books, 1993. Print.",
				b.getMLAString());
	}
	
	/**
	 * A book with one named author and "et al" set to true
	 */
	@Test
	void testOneAuthorEtAl() {
		BookBibEntry b = new BookBibEntry("Star trek chronology: The history of the future",
				"Michael","Okuda", null, null, true, "Pocket Books", 
				1993, "New York", "NY");
		assertEquals("Okuda, M. et al. (1993). Star trek chronology: The history of the future. New York, NY: Pocket Books.",
				b.getAPAString());
		assertEquals("Okuda, Michael, et al. Star trek chronology: The history of the future. New York: Pocket Books, 1993. Print.",
				b.getMLAString());
	}
	
	/**
	 * A book with two named authors and "et al" set to true
	 */
	@Test
	void testTwoAuthorsEtAl() {
		BookBibEntry b = new BookBibEntry("Star trek chronology: The history of the future",
				"Michael","Okuda", "Denise", "Okuda", true, "Pocket Books", 
				1993, "New York", "NY");
		assertEquals("Okuda, M. & Okuda, D. et al. (1993). Star trek chronology: The history of the future. New York, NY: Pocket Books.",
				b.getAPAString());
		assertEquals("Okuda, Michael, and Denise Okuda, et al. Star trek chronology: The history of the future. New York: Pocket Books, 1993. Print.",
				b.getMLAString());
	}

}
