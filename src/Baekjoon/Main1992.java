package Baekjoon;

import java.util.Scanner;

public class Main1992 {
	public static int[][] board;
	public static StringBuilder sb = new StringBuilder();
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		board = new int[N][N];
		
		for (int i = 0; i < N; i++) {
			String tmp = sc.next();
			
			for (int j = 0; j < N; j++) {
				board[i][j] = tmp.charAt(j) - '0';
			}
		}
		partition(0, 0, N);
		
		System.out.println(sb);

	}

	public static void partition(int row, int col, int size) {
		if (colorCheck(row, col, size)) {
			sb.append(board[row][col]);
			return;
		}
		sb.append("(");
		partition(row, col, size/2);
		partition(row, col + size/2, size/2);
		partition(row + size/2, col, size/2);
		partition(row + size/2, col + size/2, size/2);
		sb.append(")");		
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
