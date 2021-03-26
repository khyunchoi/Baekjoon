package Baekjoon;

import java.util.Scanner;

public class Main11050 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		sc.close();

		int nume = 1;
		int deno = 1;

		for (int i = N; i > N - K; i--) {
			nume *= i;
		}

		for (int i = 1; i <= K; i++) {
			deno *= i;
		}

		System.out.println(nume / deno);

	}

}
