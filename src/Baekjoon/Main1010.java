package Baekjoon;

import java.util.Scanner;

public class Main1010 {
	public static long[][] arr;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int i = 0; i < T; i++) {
			int N = sc.nextInt();
			int M = sc.nextInt();

			arr = new long[M + 1][M + 1];
			for (int k = 0; k <= M; k++) {
				for (int j = 0; j <= M; j++) {
					if (j == 0 || k == j) {
						arr[k][j] = 1;
					}
				}
			}
			System.out.println(binomial(M, N));
		}
	}

	public static long binomial(int a, int b) {
		if (arr[a][b] == 1) {
			return arr[a][b];
		}

		if (arr[a][b] == 0) {
			arr[a][b] = (binomial(a - 1, b) + binomial(a - 1, b - 1));
		}

		return arr[a][b];
	}
}
