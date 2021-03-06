package problem16;

import java.math.BigInteger;

public class Pow {

	private Long sumOfPow(int n) {

		// BigInteger result = BigInteger.ZERO;
		Long result = (long) 0;

		BigInteger str = new BigInteger("2");

		for (int i = 0; i < n-1; i++)
			str = str.multiply(BigInteger.valueOf(2));

		System.out.println("BigInteger: " + str);

		String temp = str.toString();

		for (int i = 0; i < temp.length(); i++) 
			result += Character.getNumericValue(temp.charAt(i));

		return result;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Pow pow = new Pow();

		System.out.println(pow.sumOfPow(15));
		System.out.println(pow.sumOfPow(1000));
	}

}
