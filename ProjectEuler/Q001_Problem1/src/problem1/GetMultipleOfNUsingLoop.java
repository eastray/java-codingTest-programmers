package problem1;

public class GetMultipleOfNUsingLoop {

	private int getMultiple(int n) {
		int result = 0;

		for (int i = 1; i < n; i++)
			if (i % 3 == 0 || i % 5 == 0)
				result += i;

		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		GetMultipleOfNUsingLoop gmon = new GetMultipleOfNUsingLoop();

		System.out.println(gmon.getMultiple(10));
		System.out.println(gmon.getMultiple(1000));

	}

}
