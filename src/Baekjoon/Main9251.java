package Baekjoon;

import java.util.Scanner;

public class Main9251 {
	public static String[] rowArr;
	public static String[] colArr;
	public static Integer[][] arr;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		rowArr = sc.nextLine().split("");
		colArr = sc.nextLine().split("");
		arr = new Integer[rowArr.length + 1][colArr.length + 1];

		for (int i = 0; i < arr.length; i++) {
			arr[i][0] = 0;
			arr[0][i] = 0;
		}

		System.out.println(LCS(arr.length - 1, arr.length - 1));
	}

	public static int LCS(int row, int col) {
		if (row == 0 || col == 0) {
			return 0;
		}
		
		if (arr[row][col] == null) {
			if (rowArr[row - 1].equals(colArr[col - 1])) {
				arr[row][col] = LCS(row - 1, col - 1) + 1;
			} else {
				arr[row][col] = Math.max(LCS(row - 1, col), LCS(row, col - 1));
			}
		}

		return arr[row][col];
	}
}
