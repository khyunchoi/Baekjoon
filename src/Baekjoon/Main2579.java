package Baekjoon;

import java.util.Arrays;
import java.util.Scanner;

public class Main2579 {
	public static int arr[][];
	public static int result[][];

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		arr = new int[N][1];
		result = new int[N][2];
		// result 배열 모두 -1값으로 초기화
		for (int i = 0; i < N; i++) {
			Arrays.fill(result[i], -1);
		}
		// arr 배열 계단 점수 대입
		for (int i = 0; i < N; i++) {
			arr[i][0] = sc.nextInt();
		}
		sc.close();
		// result 배열 마지막 두 행 세팅
		result[N - 1][0] = 0;
		result[N - 1][1] = arr[N - 1][0];
		if (N > 1) {
			result[N - 2][0] = arr[N - 2][0] + arr[N - 1][0];
			result[N - 2][1] = 0;
		}
		if (N > 1) {
			System.out.println(Math.max(Math.max(stairs(0, 0), stairs(0, 1)), stairs(1, 0)));
		} else {
			System.out.println(Math.max(stairs(0, 0), stairs(0, 1)));
		}
	}

	public static int stairs(int n, int a) {
		if (result[n][a] == -1) {
			if (a == 0) {
				result[n][a] = arr[n][0] + stairs(n + 1, 1);
			} else {
				result[n][a] = arr[n][0] + Math.max(stairs(n + 2, 0), stairs(n + 2, 1));
			}
		}

		return result[n][a];
	}
}
