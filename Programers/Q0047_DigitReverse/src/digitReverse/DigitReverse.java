package digitReverse;

import java.util.ArrayList;
import java.util.Arrays;

public class DigitReverse {

	private int[] digitReverse(int n) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		for (int i = 0; i < n; i++) {

			list.add(n % 10);
			n /= 10;

			if (n / 10 == 0) {
				list.add(n % 10);
				break;
			}
		}

		return list.stream().mapToInt(t->t).toArray();
		 
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		DigitReverse dr = new DigitReverse();

		System.out.println(Arrays.toString(dr.digitReverse(12345)));
	}

}
