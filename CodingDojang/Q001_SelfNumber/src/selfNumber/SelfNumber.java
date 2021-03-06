package selfNumber;

import java.util.ArrayList;
import java.util.stream.IntStream;

public class SelfNumber {

	private long selfNumber() {

		int[] arr = new int[5001];
		ArrayList<Integer> list = new ArrayList<Integer>();
		int result = 0;

		for (int i = 1; i < 5000; i++) {
			int temp = getGenerator(i);

			if (temp < 5000){
				arr[temp] = temp;
				list.add(temp);
			}
			
			if(!list.contains(i))
				result += i;
			
		}
		result += 5000;
		
		System.out.println("result: " + result);
		return factorial(5000) - (IntStream.of(arr).mapToLong(ele -> ele).sum());
	}

	public long factorial(int n) {
		long temp = 0;

		for (int i = 1; i <= n; i++)
			temp += i;

		return temp;
	}

	public int getGenerator(int n) {
		int result = 0;

		String str = Integer.toString(n);

		for (int i = 0; i < str.length(); i++)
			result += Integer.parseInt(str.substring(i, i + 1));
		
		return result+n;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SelfNumber sn = new SelfNumber();

		System.out.println("result: " + sn.selfNumber());
	}

}
