package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main2775 {
	public static int howManyPeople(int k, int n) {
		n--;
		int[][] arr = new int[k + 1][n + 1];
		for (int i = 0; i < arr.length; i++) {
			arr[i][0] = 1;
		}
		for (int i = 0; i < arr[0].length; i++) {
			arr[0][i] = i + 1;
		}

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				if (i > 0 && j > 0) {
					arr[i][j] = arr[i - 1][j] + arr[i][j - 1];
				}
			}
		}

		return arr[k][n];
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		for (int i = 0; i < T; i++) {
			int k = Integer.parseInt(br.readLine());
			int n = Integer.parseInt(br.readLine());
			System.out.println(howManyPeople(k, n));
		}
		br.close();
	}

}
