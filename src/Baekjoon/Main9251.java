package Baekjoon;

import java.util.Scanner;

public class Main9251 {
	public static char[] rowArr;
	public static char[] colArr;
	public static Integer[][] arr;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		rowArr = sc.nextLine().toCharArray();
		colArr = sc.nextLine().toCharArray();
		arr = new Integer[rowArr.length][colArr.length];
		sc.close();

		System.out.println(LCS(rowArr.length - 1, colArr.length - 1));
	}

	public static int LCS(int row, int col) {
		if (row == -1 || col == -1) {
			return 0;
		}
		
		if (arr[row][col] == null) {
			if (rowArr[row] == colArr[col]) {
				arr[row][col] = LCS(row - 1, col - 1) + 1;
			} else {
				arr[row][col] = Math.max(LCS(row - 1, col), LCS(row, col - 1));
			}
		}

		return arr[row][col];
	}
}
