package Baekjoon;

import java.util.Scanner;

public class Main3036 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] arr = new int[N];

		for (int i = 0; i < N; i++) {
			arr[i] = sc.nextInt();
		}
		sc.close();

		for (int i = 1; i < N; i++) {
			System.out.println(arr[0] / gcd(arr[0], arr[i]) + "/" + arr[i] / gcd(arr[0], arr[i]));
		}

	}

	public static int gcd(int a, int b) {
		while (a > 0) {
			if (a < b) {
				int tmp = a;
				a = b;
				b = tmp;
			}
			a %= b;
		}
		return b;
	}
}
