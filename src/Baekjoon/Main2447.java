package Baekjoon;

import java.util.Scanner;

public class Main2447 {
	public static String[][] arr;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		sc.close();
		arr = new String[N][N];

		star(0, 0, N, false);

		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				sb.append(arr[i][j]);
			}
			sb.append('\n');
		}
		System.out.println(sb);
	}

	public static void star(int x, int y, int N, boolean isBlank) {
		// isBlank가 true이면 빈칸 리턴
		if (isBlank) {
			for (int i = x; i < x + N; i++) {
				for (int j = y; j < y + N; j++) {
					arr[i][j] = " ";
				}
			}
			return;
		}

		// size가 1이면 *리턴
		if (N == 1) {
			arr[x][y] = "*";
			return;
		}

		int size = N / 3;
		int cnt = 0;
		for (int i = x; i < x + N; i = i + size) {
			for (int j = y; j < y + N; j = j + size) {
				cnt++;
				if (cnt == 5) {
					star(i, j, size, true);
				} else {
					star(i, j, size, false);
				}
			}
		}

	}

}
