package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Main11053 {
	public static int[] arr;
	public static Integer[] dp;
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		arr = new int[N];
		dp = new Integer[N];
		
		String tmp = br.readLine();
		StringTokenizer st = new StringTokenizer(tmp);
				
		for (int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		int max = 0;
		for (int i = 0; i < N; i++) {
			max = Math.max(max, sequence(i));
		}
		
		System.out.println(max);

	}

	public static int sequence(int N) {
		if (dp[N] == null) {
			dp[N] = 1;
			
			for (int i = 0; i < N; i++) {
				if (arr[i] < arr[N]) {
					dp[N] = Math.max(dp[N], sequence(i) + 1);
				}
			}
		}
		
		return dp[N];
	}
}
