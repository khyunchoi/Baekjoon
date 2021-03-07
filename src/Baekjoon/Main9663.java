package Baekjoon;

import java.util.Scanner;

public class Main9663 {
	public static int N, cnt = 0;
	public static boolean[][] arr;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		sc.close();

		arr = new boolean[N][N];
		chessDfs(0);
		System.out.println(cnt);
	}

	public static void chessDfs(int depth) {
		if (depth == N) {
			cnt++;
			return;
		}

		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				if (arr[i][j] == false) {
					//같은행 같은열 제거
					for (int k = 0; k < N; k++) {
						arr[i][k] = true;
						arr[k][j] = true;
					}
					// \대각선 제거
					if (i >= j) {
						for (int k = 0; k + (i - j) < N; k++) {
							arr[k + (i - j)][k] = true;
						}
					} else {
						for (int k = 0; k + (j - i) < N; k++) {
							arr[k][k + (j - i)] = true;
						}
					}
					// /대각선 제거
					for (int k = 0; k <= (i + j); k++) {
						if (k < N && (i+j)-k < N) {
							arr[k][(i+j)-k] = true;
						}
					}
					chessDfs(depth+1);
				}
				
			}
		}

	}

}
