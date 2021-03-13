package Baekjoon;

import java.util.Arrays;
import java.util.Scanner;

public class Main10844 {
	public static long[][] arr;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		sc.close();
		long sum = 0;
		arr = new long[N][10];

		for (int i = 0; i < N; i++) {
			Arrays.fill(arr[i], -1);
		}

		arr[0][0] = 0;
		for (int i = 1; i < 10; i++) {
			arr[0][i] = 1;
		}

		for (int i = 0; i < 10; i++) {
			sum += stairNum(N - 1, i);
		}

		System.out.println(sum % 1000000000);
	}

	public static long stairNum(int a, int b) {
		if (arr[a][b] == -1) {
			if (b == 0) {
				arr[a][b] = stairNum(a - 1, b + 1);
			} else if (b == 9) {
				arr[a][b] = stairNum(a - 1, b - 1);
			} else {
				arr[a][b] = stairNum(a - 1, b - 1) + stairNum(a - 1, b + 1);
			}
		}

		return arr[a][b];
	}
}
