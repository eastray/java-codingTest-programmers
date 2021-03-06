package primaryArithmetic;

public class PrimaryArithmetic {

	public int primaryArithmetic(int n, int m) {

		int result = 0;

		int[] nArray = Integer.toString(n).chars().map(ele -> Character.getNumericValue(ele)).toArray();
		int[] mArray = Integer.toString(m).chars().map(ele -> Character.getNumericValue(ele)).toArray();

		if (nArray.length != mArray.length)
			System.out.println("not same length to two number");

		int length = (nArray.length > mArray.length) ? nArray.length : mArray.length;
		int upper = 0;

		for (int i = 1; i <= length; i++) {
			if (nArray.length - i >= 0 && mArray.length - i >= 0) {
				if (nArray[nArray.length - i] + mArray[mArray.length - i] + upper >= 10) {
					result++;
					upper++;
				} else
					upper = 0;

			} else if (upper == 0)
				break;
		}

		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PrimaryArithmetic pa = new PrimaryArithmetic();

		System.out.println(pa.primaryArithmetic(123, 456) + " carry operation.");
		System.out.println(pa.primaryArithmetic(555, 555) + " carry operation.");
		System.out.println(pa.primaryArithmetic(123, 594) + " carry operation.");
		System.out.println(pa.primaryArithmetic(12345, 12) + " carry operation.");
		System.out.println(pa.primaryArithmetic(12345, 15) + " carry operation.");
		System.out.println(pa.primaryArithmetic(12345, 15) + " carry operation.");
		System.out.println(pa.primaryArithmetic(12345, 55) + " carry operation.");
		System.out.println();

		System.out.println(pa.primaryArithmetic2(123, 456) + " carry operation.");
		System.out.println(pa.primaryArithmetic2(555, 555) + " carry operation.");
		System.out.println(pa.primaryArithmetic2(123, 594) + " carry operation.");
		System.out.println(pa.primaryArithmetic2(12345, 12) + " carry operation.");
		System.out.println(pa.primaryArithmetic2(12345, 15) + " carry operation.");
		System.out.println(pa.primaryArithmetic2(12345, 15) + " carry operation.");
		System.out.println(pa.primaryArithmetic2(12345, 55) + " carry operation.");

	}

	private int primaryArithmetic2(int x, int y) {
		int count = 0;
		int upper = 0;

		while (x >= 1 && y >= 1) {
			if ((x % 10 + y % 10 + upper) >= 10) {
				count++;
				upper++;
				
			} else
				upper = 0;

			x = x / 10;
			y = y / 10;
		}

		return count;
	}
}
