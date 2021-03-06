package problem7;

import java.util.ArrayList;

public class PrimeNumber {

	private int findPrimeNumber(int n) {

		ArrayList<Integer> list = new ArrayList<Integer>();
		int temp = 2;

		while (true) {
			boolean flag = true;

			if (list.size() == n) 
				return list.get(n-1);
			
			for (int i = 2; i < temp; i++) {
				if (temp % i == 0) {
					flag = false;
					break;
				}
			}

			if (flag)
				list.add(temp);

			temp++;

		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PrimeNumber pn = new PrimeNumber();

		System.out.println(pn.findPrimeNumber(5));
		System.out.println(pn.findPrimeNumber(10001));
	}

}
