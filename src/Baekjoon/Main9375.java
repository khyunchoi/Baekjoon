package Baekjoon;

import java.util.Scanner;

public class Main9375 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();

		for (int i = 0; i < T; i++) {
			int n = sc.nextInt();
			if (n == 0) {
				System.out.println(0);
				continue;
			}
			
			String[][] arr = new String[n][2];
			for (int j = 0; j < n; j++) {
				arr[j][0] = sc.next();
				arr[j][1] = sc.next();
			}

			int[] kind = new int[n];
			kind[0] = 1;
			for (int j = 1; j < n; j++) {
				for (int k = 0; k < n; k++) {
					if (arr[j][1].equals(arr[k][1])) {
						kind[k]++;
						break;
					}
				}
			}
			int result = 1;
			for (int j = 0; j < n; j++) {
				result *= ++kind[j];
			}

			System.out.println(result - 1);

		}

	}

}
