package Baekjoon;

import java.util.Scanner;

public class Main1011 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int i = 0; i < T; i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			int a = (int)Math.ceil(Math.sqrt(y-x));

			if (y - x <= a * (a - 1)) {
				System.out.println(2 * a - 2);
			} else {
				System.out.println(2 * a - 1);
			}
		}
		sc.close();
	}
}
