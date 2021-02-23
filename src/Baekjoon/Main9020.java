package Baekjoon;

import java.util.Arrays;
import java.util.Scanner;

public class Main9020 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int i = 0; i < T; i++) {
			int n = sc.nextInt();
			boolean[] arr = new boolean[n + 1];
			Arrays.fill(arr, true);

			arr[0] = false;
			arr[1] = false;

			for (int j = 2; j < arr.length; j++) {
				if (arr[j]) {
					for (int k = j * 2; k < arr.length; k = k + j) {
						arr[k] = false;
					}
				}
			}
			
			for (int j = n/2; j < arr.length; j++) {
				if (arr[j] && arr[n-j]) {
					System.out.println((n-j) + " " + j);
					break;
				}
			}			
		}
		sc.close();
	}

}
