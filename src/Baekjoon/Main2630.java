package Baekjoon;

import java.util.Scanner;

public class Main2630 {
	public static int[][] board;
	public static int whiteCnt = 0;
	public static int blueCnt = 0;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		board = new int[N][N];

		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				board[i][j] = sc.nextInt();
			}
		}
		
		partition(0, 0, N);
		
		System.out.println(whiteCnt);
		System.out.println(blueCnt);
	}

	public static void partition(int row, int col, int size) {
		if (colorCheck(row, col, size)) {
			if (board[row][col] == 0) {
				whiteCnt++;
			} else {
				blueCnt++;
			}
			return;
		}

		partition(row, col, size / 2);
		partition(row + size / 2, col, size / 2);
		partition(row, col + size / 2, size / 2);
		partition(row + size / 2, col + size / 2, size / 2);
	}

	public static boolean colorCheck(int row, int col, int size) {
		for (int i = row; i < row + size; i++) {
			for (int j = col; j < col + size; j++) {
				if (board[row][col] != board[i][j]) {
					return false;
				}
			}
		}
		return true;
	}
}
