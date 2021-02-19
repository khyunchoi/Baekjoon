package Baekjoon;

import java.util.Scanner;

public class Main2292 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int value = (N + 4) / 6;
		int cnt = 1;

		while (value > 0) {
			value -= cnt;
			cnt++;
		}

		System.out.println(cnt);

		scan.close();
	}

}
