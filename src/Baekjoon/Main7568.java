package Baekjoon;

import java.util.Scanner;

public class Main7568 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] x = new int[N];
		int[] y = new int[N];
		int cnt = 0;
		for (int i = 0; i < N; i++) {
			x[i] = sc.nextInt();
			y[i] = sc.nextInt();
		}
		sc.close();
		
		for (int i = 0; i < N; i++) {
			cnt = 1;
			for (int j = 0; j < N; j++) {
				if (x[i] < x[j] && y[i] < y[j]) {
					cnt++;
				}
			}
			System.out.print(cnt + " ");
		}
	}

}
