package Baekjoon;

import java.util.Scanner;

public class Main10830 {
	public static int matrix[][];

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int N = sc.nextInt();
		long B = sc.nextLong();
		matrix = new int[N][N];

		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				matrix[i][j] = sc.nextInt();
			}
		}

		int[][] result = partition(B);

		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				sb.append(result[i][j] + " ");
			}
			sb.append("\n");
		}

		System.out.println(sb);
	}

	public static int[][] partition(long B) {
		if (B == 1) {
			return matrix;
		}

		int[][] tmp = new int[matrix.length][matrix.length];

		if (B % 2 == 0) {
			tmp = multi(partition(B / 2), partition(B / 2));
		} else {
			tmp = multi(multi(partition(B / 2), partition(B / 2)), matrix);
		}

		return tmp;
	}

	public static int[][] multi(int[][] arr1, int[][] arr2) {
		int[][] tmp = new int[arr1.length][arr1.length];

		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr1.length; j++) {
				int res = 0;
				for (int k = 0; k < arr1.length; k++) {
					res += arr1[i][k] * arr2[k][j];
				}
				tmp[i][j] = res % 1000;
			}
		}

		return tmp;
	}
}
