package sumDigit;

public class SumDigit {

	private int sumDigit(int n) {

		if (n / 10 == 0)
			return n;

		return sumDigit(n / 10) + (n % 10);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SumDigit sd = new SumDigit();

		System.out.println(sd.sumDigit(123));
		System.out.println(sd.sumDigit(567));

	}

}
