package Baekjoon;

import java.util.Scanner;

public class Main12865 {
	public static int[] weight;
	public static int[] value;
	public static Integer[][] dp;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		weight = new int[N];
		value = new int[N];
		dp = new Integer[N][K + 1];

		for (int i = 0; i < N; i++) {
			weight[i] = sc.nextInt();
			value[i] = sc.nextInt();
		}
		sc.close();

		System.out.println(backpack(N - 1, K));
	}

	public static int backpack(int i, int k) {
		if (i < 0) {
			return 0;
		}

		if (dp[i][k] == null) {
			if (k < weight[i]) {
				dp[i][k] = backpack(i - 1, k);
			} else {
				dp[i][k] = Math.max(backpack(i - 1, k), backpack(i - 1, k - weight[i]) + value[i]);
			}
		}

		return dp[i][k];
	}
}
