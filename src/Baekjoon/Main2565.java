package Baekjoon;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main2565 {
	public static int arr[][];
	public static Integer dp[];
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		arr = new int[N][2];
		dp = new Integer[N];
		
		for (int i = 0; i < N; i++) {
			arr[i][0] = sc.nextInt();
			arr[i][1] = sc.nextInt();
		}
		sc.close();
		//각 행 1열을 기준으로 오름차순 정렬
		Arrays.sort(arr, new Comparator<int[]>() {
			@Override
			public int compare(int[] a1, int[] a2) {
				return a1[0] - a2[0];
			}
		});
		
		dp[0] = 1;
		
		int max = 0;
		for (int i = 0; i < N; i++) {
			max = Math.max(max, LIS(i));
		}
		System.out.println(N - max);
	}
	
	public static int LIS(int N) {
		if (dp[N] == null) {
			dp[N] = 1;
			for (int i = 0; i < N; i++) {
				if (arr[i][1] < arr[N][1]) {
					dp[N] = Math.max(dp[N], LIS(i) + 1);
				}
			}
		}
		return dp[N];
	}
}
