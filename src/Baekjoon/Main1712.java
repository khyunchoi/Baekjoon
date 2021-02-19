package Baekjoon;

import java.util.Scanner;

public class Main1712 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int A = scan.nextInt();
		int B = scan.nextInt();
		int C = scan.nextInt();
		int N = 1;

		if (B >= C) {
			System.out.println(-1);
		} else {
			while (A >= ((C - B) * N)) {
				N++;
			}
			System.out.println(N);
		}
		scan.close();
	}
}
