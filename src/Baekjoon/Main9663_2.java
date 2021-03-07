package Baekjoon;

import java.util.Scanner;

public class Main9663_2 {
	public static int[] arr;
	public static int cnt = 0;
	public static int N;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		sc.close();

		arr = new int[N];
		nQueen(0);
		System.out.println(cnt);
	}

	public static void nQueen(int depth) {
		if (depth == N) {
			cnt++;
			return;
		}

		for (int i = 0; i < N; i++) {
			arr[depth] = i;
			if (possible(depth)) {
				nQueen(depth + 1);
			}
		}

	}

	public static boolean possible(int now) {
		for (int i = 0; i < now; i++) {
			if (arr[i] == arr[now]) {
				return false;
			} else if (Math.abs(now - i) == Math.abs(arr[now] - arr[i])) {
				return false;
			}
		}
		return true;
	}
}
