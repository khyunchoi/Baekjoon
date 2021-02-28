package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main1018 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// M,N 입력
		String MN = br.readLine();
		StringTokenizer st = new StringTokenizer(MN);
		int M = Integer.parseInt(st.nextToken());
		int N = Integer.parseInt(st.nextToken());
		// 체스판 입력
		String[][] arr = new String[M][N];
		for (int i = 0; i < M; i++) {
			String line = br.readLine();
			arr[i] = line.split("");
		}
		br.close();
		
		int cnt;
		int min = 32;
		for (int a = 0; a < M-7; a++) {
			for (int b = 0; b < N-7; b++) {
				cnt = 0;
				for (int i = a; i < a + 8; i++) {
					for (int j = b; j < b + 8; j++) {
						if ((i + j) % 2 == 0) {
							if (arr[i][j].equals("W")) {
								cnt++;
							}
						} else {
							if (arr[i][j].equals("B")) {
								cnt++;
							}
						}
					}
				}
				if (cnt >= 32) {
					cnt = 64 - cnt;
				}
				if (cnt <= min) {
					min = cnt;
				}
			}
		}
		System.out.println(min);
	}
}
