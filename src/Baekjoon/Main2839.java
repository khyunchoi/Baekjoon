package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main2839 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int cnt = 0;
		if (N <= 7 && N % 3 != 0 && N % 5 != 0) {
			System.out.println(-1);
		} else {
			while (N % 5 != 0) {
				N -= 3;
				cnt++;
			}
			System.out.println(N/5 + cnt);
		}

	}

}
