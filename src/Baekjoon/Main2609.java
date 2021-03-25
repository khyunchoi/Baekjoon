package Baekjoon;

import java.util.Scanner;

public class Main2609 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		sc.close();

		System.out.println(gcd(a, b));
		System.out.println(a * b / gcd(a, b));
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
