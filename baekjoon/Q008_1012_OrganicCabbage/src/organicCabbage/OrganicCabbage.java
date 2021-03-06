package organicCabbage;

import java.util.Arrays;
import java.util.Scanner;

public class OrganicCabbage {

	public void printArr(int[][] arr) {
		System.out.println();

		for (int[] element : arr) {
			for (int ele : element)
				System.out.print(ele + " ");

			System.out.println();
		}
	}

	public int[] findPoint(int[][] arr) {

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if (arr[i][j] == 1)
					return new int[] { i, j };
			}
		}

		return new int[] { -1, -1 };
	}

	public boolean isRemindOne(int[][] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				if (arr[i][j] == 1)
					return true;
			}
		}

		return false;
	}

	public int countOne(int[] arr) {
		int sum = 0;

		for (int ele : arr)
			if (ele == 1)
				sum++;

		return sum;
	}

	public int[][] createMatrix(int x, int y, int h, int[][] input) {

		int[][] arr = new int[x][y];

		for (int i = 0; i < h; i++)
			arr[input[1][i]][input[0][i]] = 1;

		return arr;
	}

	public int countNeedEarthworm(int[][] arr, int[][] input) {

		int[] xArr = new int[100];
		int[] yArr = new int[100];
		int[] hArr = new int[100];

		int pos = 0;
		int count = 0;

		while (isRemindOne(arr)) {

			printArr(arr);

			int[] point = findPoint(arr);

			if (point[0] == -1 || point[1] == -1)
				break;

			xArr[count] = point[0];
			yArr[count] = point[1];
			hArr[count] = 1;
			count++;

			while (true) {

				arr[xArr[pos]][yArr[pos]] = 0;

				if (xArr[pos] > 0 && arr[xArr[pos] - 1][yArr[pos]] == 1) {
					xArr[count] = xArr[pos] - 1;
					yArr[count] = yArr[pos];
					hArr[count] = hArr[pos] + 1;
					count++;
				}

				if (xArr[pos] < arr.length - 1 && arr[xArr[pos] + 1][yArr[pos]] == 1) {
					xArr[count] = xArr[pos] + 1;
					yArr[count] = yArr[pos];
					hArr[count] = hArr[pos] + 1;
					count++;
				}

				if (yArr[pos] > 0 && arr[xArr[pos]][yArr[pos] - 1] == 1) {
					xArr[count] = xArr[pos];
					yArr[count] = yArr[pos] - 1;
					hArr[count] = hArr[pos] + 1;
					count++;
				}

				if (yArr[pos] < arr[0].length - 1 && arr[xArr[pos]][yArr[pos] + 1] == 1) {
					xArr[count] = xArr[pos];
					yArr[count] = yArr[pos] + 1;
					hArr[count] = hArr[pos] + 1;
					count++;
				}

				pos++;

				if (pos != 1 && xArr[pos] == 0 || yArr[pos] == 0)
					break;
			}

		}

		 System.out.println(Arrays.toString(xArr));
		 System.out.println(Arrays.toString(yArr));
		 System.out.println(Arrays.toString(hArr));
		return countOne(hArr);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OrganicCabbage oc = new OrganicCabbage();

		// int[][] input = { { 0, 1, 1, 4, 4, 4, 2, 3, 7, 9, 7, 9, 7, 8, 9, 7, 9
		// },
		// { 0, 0, 1, 2, 3, 5, 4, 4, 3, 3, 4, 4, 5, 5, 5, 6, 6 } };
		// int[][] arr = oc.creatMatrix(8, 10, input);

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		for (int j = 0; j < n; j++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			int h = sc.nextInt();

			int[][] input = new int[2][h];

			for (int i = 0; i < h; i++) {
				input[0][h] = sc.nextInt();
				input[1][h] = sc.nextInt();
			}

			int[][] arr = oc.createMatrix(y, x, h, input);

			System.out.println(oc.countNeedEarthworm(arr, input));
		}
	}

}
