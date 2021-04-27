package Baekjoon;

import java.util.Scanner;

public class Main1300 {
	public static int N;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		int k = sc.nextInt();

		int low = 1;
		int high = k;
		int res = 0;

		while (low <= high) {
			int mid = (low + high) / 2;
			int cnt = check(mid);
			if (cnt >= k) {
				res = mid;
				high = mid - 1;
			} else {
				low = mid + 1;
			}

		}

		System.out.println(res);

	}

	public static int check(int a) {
		int cnt = 0;
		for (int i = 1; i <= N; i++) {
			cnt += Math.min(N, a / i);
		}

		return cnt;
	}
}
