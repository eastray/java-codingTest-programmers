package longesPalindrom;

import static org.junit.Assert.*;

import org.junit.Test;

public class LongesPalindromTest {

	@Test(timeout = 1000)
	public void testLongesPalindrom() {
		LongesPalindrom lp = new LongesPalindrom();

		assertEquals(5, lp.longesPalindrom("abcba"));

	}

	@Test(timeout = 1000)
	public void testLongesPalindrom2() {
		LongesPalindrom lp = new LongesPalindrom();

		assertEquals(5, lp.longesPalindrom("abcbaddef"));

	}

	@Test(timeout = 1000)
	public void testLongesPalindrom3() {
		LongesPalindrom lp = new LongesPalindrom();

		assertEquals(5, lp.longesPalindrom("abcbaddaf"));

	}

	@Test(timeout = 1000)
	public void testLongesPalindrom4() {
		LongesPalindrom lp = new LongesPalindrom();

		assertEquals(5, lp.longesPalindrom("bbabcbaddaf"));

	}

	@Test(timeout = 1000)
	public void testLongesPalindrom5() {
		LongesPalindrom lp = new LongesPalindrom();

		assertEquals(7, lp.longesPalindrom("aaabcbaaddaf"));

	}

	@Test(timeout = 1000)
	public void testLongesPalindrom6() {
		LongesPalindrom lp = new LongesPalindrom();

		assertEquals(10, lp.longesPalindrom("aaabcbggggggggggaaddaf"));

	}

	@Test(timeout = 1000)
	public void testLongesPalindrom7() {
		LongesPalindrom lp = new LongesPalindrom();

		assertEquals(10, lp.longesPalindrom("gggggggggg"));

	}

	@Test(timeout = 1000)
	public void testLongesPalindrom8() {
		LongesPalindrom lp = new LongesPalindrom();

		assertEquals(3, lp.longesPalindrom("ggg"));

	}

	@Test(timeout = 1000)
	public void testLongesPalindrom9() {
		LongesPalindrom lp = new LongesPalindrom();

		assertEquals(4, lp.longesPalindrom("gggg"));

	}

}
