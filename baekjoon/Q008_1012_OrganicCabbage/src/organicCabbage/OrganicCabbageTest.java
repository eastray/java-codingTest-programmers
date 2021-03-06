package organicCabbage;

import static org.junit.Assert.*;

import org.junit.Test;

public class OrganicCabbageTest {

	@Test
	public void testCountNeedEarthworm() {
		OrganicCabbage oc = new OrganicCabbage();

		int[][] input = { { 0, 1, 1, 4, 4, 4, 2, 3, 7, 8, 9, 7, 8, 9, 7, 8, 9 },
				{ 0, 0, 1, 2, 3, 5, 4, 4, 4, 4, 4, 5, 5, 5, 6, 6, 6 } };
		int[][] arr = oc.createMatrix(8, 10, 17, input);

		assertEquals(5, oc.countNeedEarthworm(arr, input));

		int[][] input2 = { { 0, 1, 1, 4, 4, 4, 2, 3, 7, 9, 7, 9, 7, 8, 9, 7, 9 },
				{ 0, 0, 1, 2, 3, 5, 4, 4, 3, 3, 4, 4, 5, 5, 5, 6, 6 } };
		int[][] arr2 = oc.createMatrix(8, 10, 17, input2);
		assertEquals(5, oc.countNeedEarthworm(arr2, input2));

		int[][] input3 = { { 0, 1, 1, 4, 4, 4, 2, 3, 6, 7, 8, 9, 8, 6, 7, 8, 9, 8 },
				{ 0, 0, 1, 2, 3, 5, 4, 4, 4, 4, 4, 4, 5, 6, 6, 6, 6, 1 } };
		int[][] arr3 = oc.createMatrix(8, 10, 18, input3);
		assertEquals(6, oc.countNeedEarthworm(arr3, input3));

	}

}
