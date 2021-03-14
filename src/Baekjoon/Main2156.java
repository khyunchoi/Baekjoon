package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main2156 {
	public static int[] arr;
	public static Integer[] dp;

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());

		arr = new int[n + 1];
		dp = new Integer[n + 1];

		for (int i = 1; i < n + 1; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		
		dp[0] = 0;
		dp[1] = arr[1];
		
		if (n > 1) {
			dp[2] = arr[1] + arr[2];
		}
		
		System.out.println(wine(n));
	}

	public static int wine(int n) {
		if (dp[n] == null) {
			dp[n] = Math.max(Math.max(wine(n - 2), wine(n - 3) + arr[n - 1]) + arr[n], wine(n - 1));
		}
		
		return dp[n];
	}

}
