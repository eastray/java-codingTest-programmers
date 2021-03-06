package deliverySugar;

import java.util.Scanner;

public class DeliverySugar {

	public int countOfDeliverySugar(int n) {

		if (n == 3)
			return 1;
		else if (n < 5)
			return -1;

		int remainder = n % 5;
		int quo = n / 5;

		if (remainder == 0)
			return quo;

		while (true) {
			if (remainder % 3 != 0)
				quo--;

			if (quo < 0)
				return -1;

			remainder = n - (5 * quo);

			if (remainder % 3 == 0) {
				System.out.println("quo " + quo);
				System.out.println("re: " + remainder / 3);
				return quo + (remainder / 3);
			}

		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		DeliverySugar ds = new DeliverySugar();
		int n = sc.nextInt();

		System.out.println(ds.countOfDeliverySugar(n));

	}

}
