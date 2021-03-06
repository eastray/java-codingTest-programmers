package fibonacci;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Fibonacci {
	static Map<Integer, Integer> map = new HashMap<Integer, Integer>();

	public int fibo(int n) {

		if (n < 2) {
			return n;
		}

		if (map.containsKey(n))
			return map.get(n);

		int result = fibo(n - 1) + fibo(n - 2);
		map.put(n, result);

		return result;

	}

	// 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597
	// 0  1  2  3  4  5  6  7   8   9   10
	public int fiboForLoop(int n) {

		int result = 0;
		int temp1 = 0;
		int temp2 = 1;

		for (int i = 2; i <= n; i++) {
			
			result = temp1 + temp2;
			temp1 = temp2;
			temp2 = result;

		}
		
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		Fibonacci fibo = new Fibonacci();

		// System.out.println(fibo.fibo(sc.nextInt()));
		System.out.println(fibo.fibo(10));
		System.out.println(fibo.fiboForLoop(10));
	}

}
