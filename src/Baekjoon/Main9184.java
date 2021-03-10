package Baekjoon;

import java.util.Scanner;

public class Main9184 {
	public static int[][][] arr = new int[21][21][21];
	public static int a, b, c;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < 21; i++) {
			for (int j = 0; j < 21; j++) {
				for (int k = 0; k < 21; k++) {
					arr[i][j][k] = -1;
				}
			}
		}
		while(true) {
			a = sc.nextInt();
			b = sc.nextInt();
			c = sc.nextInt();
			
			if (a == -1 && b == -1 && c == -1) {
				break;
			}
			
			System.out.printf("w(%d, %d, %d) = %d\n", a, b, c, w(a, b, c));
		}
		sc.close();
	}
	
	public static int w(int a, int b, int c) {
		if (a <= 0 || b <= 0 || c <= 0) {
			return 1;
		} else if (a > 20 || b > 20 || c > 20) {
			return w(20, 20, 20);
		} else if (arr[a][b][c] == -1) {
			if (a < b && b < c) {
				arr[a][b][c] = w(a, b, c-1) + w(a, b-1, c-1) - w(a, b-1, c);
				return arr[a][b][c];
			} else {
				arr[a][b][c] = w(a-1, b, c) + w(a-1, b-1, c) + w(a-1, b, c-1) - w(a-1, b-1, c-1);
				return arr[a][b][c];
			}			
		} else {
			return arr[a][b][c];
		}
	}
}
