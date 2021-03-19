package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main1912 {
	public static int[] arr;
	public static Integer[] dp;

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String tmp = br.readLine();
		StringTokenizer st = new StringTokenizer(tmp);
		arr = new int[n];
		dp = new Integer[n];

		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}

		dp[0] = arr[0];

		int max = Integer.MIN_VALUE;
		for (int i = 0; i < n; i++) {
			max = Math.max(max, sequence(i));
		}

		System.out.println(max);
	}

	public static int sequence(int a) {
		if (dp[a] == null) {
			dp[a] = Math.max(arr[a], arr[a] + sequence(a - 1));
		}

		return dp[a];
	}
}
