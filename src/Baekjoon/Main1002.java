package Baekjoon;

import java.util.Scanner;

public class Main1002 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		int x1, y1, r1, x2, y2, r2;
		for (int i = 0; i < T; i++) {
			x1 = sc.nextInt();
			y1 = sc.nextInt();
			r1 = sc.nextInt();
			x2 = sc.nextInt();
			y2 = sc.nextInt();
			r2 = sc.nextInt();
			
			if (x1 == x2 && y1 == y2) {
				if (r1 == r2) {
					System.out.println(-1);
				} else {
					System.out.println(0);
				}
			} else {
				if (Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2) < Math.pow(r1 + r2, 2)) {
					if (Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2) < Math.pow(r1 - r2, 2)) {
						System.out.println(0);
					} else if (Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2) == Math.pow(r1 - r2, 2)){
						System.out.println(1);
					} else {
						System.out.println(2);
					}
				} else if (Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2) == Math.pow(r1 + r2, 2)) {
					System.out.println(1);
				} else {
					System.out.println(0);
				}
			}
		}
		sc.close();
	}

}
