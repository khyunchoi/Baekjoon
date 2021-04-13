package Baekjoon;

import java.util.Scanner;

public class Main2740 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int N = sc.nextInt();
		int M = sc.nextInt();

		int[][] A = new int[N][M];

		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				A[i][j] = sc.nextInt();
			}
		}

		M = sc.nextInt();
		int K = sc.nextInt();

		int[][] B = new int[M][K];

		for (int i = 0; i < M; i++) {
			for (int j = 0; j < K; j++) {
				B[i][j] = sc.nextInt();
			}
		}

		int[][] C = new int[N][K];

		for (int i = 0; i < N; i++) {
			for (int j = 0; j < K; j++) {
				int res = 0;
				for (int k = 0; k < M; k++) {
					res += A[i][k] * B[k][j];
				}
				C[i][j] = res;
			}
		}

		for (int i = 0; i < N; i++) {
			for (int j = 0; j < K; j++) {
				sb.append(C[i][j] + " ");
			}
			sb.append("\n");
		}

		System.out.println(sb);
	}

}
