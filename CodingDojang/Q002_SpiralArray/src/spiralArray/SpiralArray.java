package spiralArray;

import java.util.Arrays;
import java.util.Scanner;

public class SpiralArray {

	public void spiralArray(int x, int y) {

		int count = 1;
		int[][] array = new int[x][y];
		int max = x * y + 1;
		int temp = 0;
		int index = 0;

		while (count != max) {
			for (int j = temp; j < y; j++) 
				array[index][j] = count++;

			for (int j = temp + 1; j < y; j++) 
				array[j][y - 1] = count++;

			for (int j = y - 2; j >= temp; j--) 
				array[x - (index + 1)][j] = count++;

			for (int j = y - 2; j >= temp + 1; j--) 
				array[j][index] = count++;
			

			y--;
			index++;
			temp++;

		}

		printArray(array);

	}

	public void printArray(int[][] arr) {
		for (int[] elements : arr) {
			System.out.println(Arrays.toString(elements));

		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SpiralArray sa = new SpiralArray();

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		sa.spiralArray(sc.nextInt(), sc.nextInt());
	}

}
