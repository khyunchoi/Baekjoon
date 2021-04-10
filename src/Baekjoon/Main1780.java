package Baekjoon;

import java.util.Scanner;

public class Main1780 {
	public static int[][] board;
	public static int minusCnt = 0;
	public static int zeroCnt = 0;
	public static int plusCnt = 0;

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
		System.out.println(minusCnt);
		System.out.println(zeroCnt);
		System.out.println(plusCnt);
	}

	public static void partition(int row, int col, int size) {
		if (numberCheck(row, col, size)) {
			if (board[row][col] == -1) {
				minusCnt++;
			} else if (board[row][col] == 0) {
				zeroCnt++;
			} else {
				plusCnt++;
			}
			return;
		}

		int newSize = size / 3;

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				partition(row + i * newSize, col + j * newSize, newSize);
			}
		}
	}

	public static boolean numberCheck(int row, int col, int size) {
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
