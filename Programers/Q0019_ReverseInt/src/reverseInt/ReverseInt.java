package reverseInt;

import java.util.Arrays;

public class ReverseInt {

	private int reverseInt(int n) {
		
		char[] temp = Integer.toString(n).toCharArray();
		
		Arrays.sort(temp);
		
		return Integer.parseInt(new StringBuilder(new String(temp)).reverse().toString());

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ReverseInt reverseInt = new ReverseInt();

		System.out.println(reverseInt.reverseInt(118372));

	}

}
