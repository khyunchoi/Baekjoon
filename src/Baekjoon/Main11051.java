package Baekjoon;

import java.util.Scanner;

public class Main11051 {
	public static long[][] arr;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		sc.close();

		arr = new long[N + 1][N + 1];
		for (int i = 0; i <= N; i++) {
			for (int j = 0; j <= N; j++) {
				if (j == 0 || i == j) {
					arr[i][j] = 1;
				}
			}
		}
		System.out.println(binomial(N, K) % 10007);

	}

	public static long binomial(int a, int b) {
		if (arr[a][b] == 1) {
			return arr[a][b];
		}

		if (arr[a][b] == 0) {
			arr[a][b] = (binomial(a - 1, b) + binomial(a - 1, b - 1)) % 10007;
		}

		return arr[a][b];
	}
}
