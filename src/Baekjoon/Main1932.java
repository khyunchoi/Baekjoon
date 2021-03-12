package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main1932 {
	public static int[][] arr;
	public static int[][] result;

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		arr = new int[n][n];
		result = new int[n][n];
		for (int i = 0; i < n; i++) {
			String tmp = br.readLine();
			StringTokenizer st = new StringTokenizer(tmp);
			for (int j = 0; j <= i; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		result[0][0] = arr[0][0];

		int max = Integer.MIN_VALUE;
		for (int i = 0; i < n; i++) {
			max = Math.max(max, triangle(n - 1, i));
		}
		System.out.println(max);
	}

	public static int triangle(int n, int m) {
		if (n < m) {
			return 0;
		}

		if (result[n][m] == 0) {
			if (m == 0) {
				result[n][m] = triangle(n - 1, m) + arr[n][m];
			} else {
				result[n][m] = Math.max(triangle(n - 1, m - 1), triangle(n - 1, m)) + arr[n][m];
			}
		}

		return result[n][m];
	}
}
