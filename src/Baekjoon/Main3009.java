package Baekjoon;

import java.util.Scanner;

public class Main3009 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x1 = sc.nextInt();
		int y1 = sc.nextInt();
		int x2 = sc.nextInt();
		int y2 = sc.nextInt();
		int x3 = sc.nextInt();
		int y3 = sc.nextInt();
		int x4 = 0, y4 = 0;
		int X = 2 * x1, Y = 2 * y1;
		sc.close();

		if (x1 != x2) {
			X += 2 * x2;
		} else {
			X += 2 * x3;
		}

		if (y1 != y2) {
			Y += 2 * y2;
		} else {
			Y += 2 * y3;
		}

		x4 = X - (x1 + x2 + x3);
		y4 = Y - (y1 + y2 + y3);

		System.out.println(x4 + " " + y4);
	}

}
