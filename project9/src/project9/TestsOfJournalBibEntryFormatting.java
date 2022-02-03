package project9;
//These imports work for JUnit 5
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;


/**
 * Unit tests of the getAPAString() and getMLAString() methods for 
	JournalBibEntry objects
 * @author gosnat
 * @version Spring 2021
 */
class TestsOfJournalBibEntryFormatting {
	
	
	/**
	 * A journal article with no authors
	 */
	@Test
	public void testNoAuthors() {
		JournalBibEntry ja = new JournalBibEntry("Intuitive Versus Rational Judgment and the Role of Stereotyping in the Human Condition: Kirk or Spock",
				null, null, null, null, false, "Psychological Inquiry",
				1992, 3, 2, 153, 159, "10.1207/s15327965pli0302_13");
		
		assertEquals("Intuitive Versus Rational Judgment and the Role of Stereotyping in the Human Condition: Kirk or Spock. (1992). Psychological Inquiry, 3(2), 153-159. doi:10.1207/s15327965pli0302_13",
				ja.getAPAString());
		assertEquals("\"Intuitive Versus Rational Judgment and the Role of Stereotyping in the Human Condition: Kirk or Spock.\" Psychological Inquiry, 3.2 (1992): 153-159. Print.",
				ja.getMLAString());
	}
	
	/**
	 * A journal article with one author
	 */
	@Test
	public void testOneAuthor() {
		JournalBibEntry ja = new JournalBibEntry("Intuitive Versus Rational Judgment and the Role of Stereotyping in the Human Condition: Kirk or Spock",
				"Patricia", "Devine", null, null, false, "Psychological Inquiry",
				1992, 3, 2, 153, 159, "10.1207/s15327965pli0302_13");
		
		assertEquals("Devine, P. (1992). Intuitive Versus Rational Judgment and the Role of Stereotyping in the Human Condition: Kirk or Spock. Psychological Inquiry, 3(2), 153-159. doi:10.1207/s15327965pli0302_13",
				ja.getAPAString());
		assertEquals("Devine, Patricia. \"Intuitive Versus Rational Judgment and the Role of Stereotyping in the Human Condition: Kirk or Spock.\" Psychological Inquiry, 3.2 (1992): 153-159. Print.",
				ja.getMLAString());
	}
	
	/**
	 * A journal article with two authors
	 */
	@Test
	public void testTwoAuthors() {
		JournalBibEntry ja = new JournalBibEntry("Intuitive Versus Rational Judgment and the Role of Stereotyping in the Human Condition: Kirk or Spock",
				"Patricia", "Devine", "Steven",  "Sherman", false, "Psychological Inquiry",
				1992, 3, 2, 153, 159, "10.1207/s15327965pli0302_13");
		
		assertEquals("Devine, P. & Sherman, S. (1992). Intuitive Versus Rational Judgment and the Role of Stereotyping in the Human Condition: Kirk or Spock. Psychological Inquiry, 3(2), 153-159. doi:10.1207/s15327965pli0302_13",
				ja.getAPAString());
		assertEquals("Devine, Patricia, and Steven Sherman. \"Intuitive Versus Rational Judgment and the Role of Stereotyping in the Human Condition: Kirk or Spock.\" Psychological Inquiry, 3.2 (1992): 153-159. Print.",
				ja.getMLAString());
	}
	
	/**
	 * A journal article with one named author and "et al" set to true
	 */
	@Test
	public void testOneAuthorEtAl() {
		JournalBibEntry ja = new JournalBibEntry("Intuitive Versus Rational Judgment and the Role of Stereotyping in the Human Condition: Kirk or Spock",
				"Patricia", "Devine", null, null, true, "Psychological Inquiry",
				1992, 3, 2, 153, 159, "10.1207/s15327965pli0302_13");
		
		assertEquals("Devine, P. et al. (1992). Intuitive Versus Rational Judgment and the Role of Stereotyping in the Human Condition: Kirk or Spock. Psychological Inquiry, 3(2), 153-159. doi:10.1207/s15327965pli0302_13",
				ja.getAPAString());
		assertEquals("Devine, Patricia, et al. \"Intuitive Versus Rational Judgment and the Role of Stereotyping in the Human Condition: Kirk or Spock.\" Psychological Inquiry, 3.2 (1992): 153-159. Print.",
				ja.getMLAString());
	}
	
	/**
	 * A journal article with two named authors and "et al" set to true
	 */
	@Test
	public void testTwoAuthorsEtAl() {
		JournalBibEntry ja = new JournalBibEntry("Intuitive Versus Rational Judgment and the Role of Stereotyping in the Human Condition: Kirk or Spock",
				"Patricia", "Devine", "Steven",  "Sherman", true, "Psychological Inquiry",
				1992, 3, 2, 153, 159, "10.1207/s15327965pli0302_13");
		
		assertEquals("Devine, P. & Sherman, S. et al. (1992). Intuitive Versus Rational Judgment and the Role of Stereotyping in the Human Condition: Kirk or Spock. Psychological Inquiry, 3(2), 153-159. doi:10.1207/s15327965pli0302_13",
				ja.getAPAString());
		assertEquals("Devine, Patricia, and Steven Sherman, et al. \"Intuitive Versus Rational Judgment and the Role of Stereotyping in the Human Condition: Kirk or Spock.\" Psychological Inquiry, 3.2 (1992): 153-159. Print.",
				ja.getMLAString());
	}

}
