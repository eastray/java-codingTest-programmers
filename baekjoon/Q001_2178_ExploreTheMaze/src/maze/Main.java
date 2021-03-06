package maze;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public int maze(int[][] arr) {

		int n = arr.length;
		int m = arr[0].length;
		int pos = 0;
		
		Maze maze = new Maze();

		maze.setArr(0, 0, 1);

		while (pos < maze.count && (maze.xArr[pos] != n - 1) || (maze.yArr[pos] != m - 1)) {

			arr[maze.xArr[pos]][maze.yArr[pos]] = 0;

			if (maze.xArr[pos] > 0 && arr[maze.xArr[pos] - 1][maze.yArr[pos]] == 1)
				maze.setArr(maze.xArr[pos] - 1, maze.yArr[pos], maze.hArr[pos]+1);
				
			if (maze.xArr[pos] < n - 1 && arr[maze.xArr[pos] + 1][maze.yArr[pos]] == 1)
				maze.setArr(maze.xArr[pos] + 1, maze.yArr[pos], maze.hArr[pos] + 1);

			if (maze.yArr[pos] > 0 && arr[maze.xArr[pos]][maze.yArr[pos] - 1] == 1)
				maze.setArr(maze.xArr[pos], maze.yArr[pos] - 1, maze.hArr[pos] + 1);

			if (maze.yArr[pos] < m - 1 && arr[maze.xArr[pos]][maze.yArr[pos] + 1] == 1)
				maze.setArr(maze.xArr[pos], maze.yArr[pos] + 1, maze.hArr[pos] + 1);

			pos++;

		}
		
		System.out.println(Arrays.toString(maze.xArr));
		System.out.println(Arrays.toString(maze.yArr));
		System.out.println(Arrays.toString(maze.hArr));

		if (pos < maze.count)
			return maze.hArr[pos];

		return maze.count;

	}

	public static void main(String[] args) {

		Main maze = new Main();
		
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		int[][] arr = new int[x][y];
		
		for(int i = 0; i < x; i++){
			
			int temp = sc.nextInt();
		
			for(int j = y-1; j >= 0; j--){
				int remainder = temp % 10;
				arr[i][j] = remainder;
				temp = temp / 10;
						
			}
		
		}
		
		System.out.println(maze.maze(arr));

	}

}

class Maze {
	int[] xArr = new int[100];
	int[] yArr = new int[100];
	int[] hArr = new int[100];
	int count = 0;

	public Maze(){
		
	}
	
	public void setArr(int x, int y, int h){
		this.xArr[count] = x;
		this.yArr[count] = y;
		this.hArr[count] = h;
		this.count++;
	}
	
}


