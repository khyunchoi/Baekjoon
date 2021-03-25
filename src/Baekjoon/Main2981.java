package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main2981 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int[] arr = new int[N];

		for (int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		Arrays.sort(arr);

		int[] arrDiff = new int[N - 1];
		for (int i = 0; i < N - 1; i++) {
			arrDiff[i] = arr[i + 1] - arr[i];
		}

		int gcdDiff = arrDiff[0];
		for (int i = 1; i < N - 1; i++) {
			gcdDiff = gcd(gcdDiff, arrDiff[i]);
		}

		for (int i = 2; i <= gcdDiff; i++) {
			if (gcdDiff % i == 0) {
				System.out.print(i + " ");
			}
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
