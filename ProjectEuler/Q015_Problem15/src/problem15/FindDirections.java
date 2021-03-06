package problem15;

import java.math.BigInteger;

public class FindDirections {

	private void print(int[][] arr) {
		for (int[] array : arr) {
			for (int ele : array)
				System.out.print(ele + " ");
			System.out.println();
		}
		System.out.println();

	}

	private int[][] findDirections2(int[][] arr) {
		print(arr);

		arr[0][0] = arr[1][1] = arr[1][0] = 1;

		for (int i = 2; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if (j == 0 || i == j)
					arr[i][j] = 1;
				else
					arr[i][j] = arr[i - 1][j - 1] + arr[i - 1][j];
			}
		}
		return arr;
	}

	private int findDirections(int n, int m) {

		if (m == 0)
			return 1;
		else if (m == 1)
			return n;
		else if (n == m * 2)
			return findDirections(n - 1, m - 1) * 2;
		else
			return findDirections(n - 1, m) + findDirections(n - 1, m - 1);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] arr = new int[20][20];
		// int[][] arr = new int[3][3];

		FindDirections fd = new FindDirections();

		//System.out.println(fd.findDirections(40 , 20));
		fd.print(fd.findDirections2(arr));
	}

}
