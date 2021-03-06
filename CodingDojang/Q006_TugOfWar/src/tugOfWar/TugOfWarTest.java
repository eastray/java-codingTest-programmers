package tugOfWar;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

public class TugOfWarTest {

	TugOfWar tow = new TugOfWar();

	@Test
	public void testTugOfWar() {

		assertEquals(Arrays.toString(new int[] { 180, 175 }),
				Arrays.toString(tow.tugOfWar(new int[] { 45, 55, 70, 60, 50, 75 })));
		assertEquals(Arrays.toString(new int[] { 12, 12 }), Arrays.toString(tow.tugOfWar(new int[] { 2, 3, 4, 7, 8 })));
		assertEquals(Arrays.toString(new int[] { 139, 138 }),
				Arrays.toString(tow.tugOfWar(new int[] { 92, 56, 47, 82 })));
		assertEquals(Arrays.toString(new int[] { 150, 250 }),
				Arrays.toString(tow.tugOfWar(new int[] { 50, 50, 100, 200 })));
		assertEquals(Arrays.toString(new int[] { 200, 190 }),
				Arrays.toString(tow.tugOfWar(new int[] { 100, 90, 200 })));

	}

}
