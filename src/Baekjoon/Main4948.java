package Baekjoon;

import java.util.Arrays;
import java.util.Scanner;

public class Main4948 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			int n = sc.nextInt();
			int cnt = 0;
			if(n == 0) {
				break;
			}
			boolean[] arr = new boolean[2*n + 1];
			Arrays.fill(arr, true);

			arr[0] = false;
			arr[1] = false;

			for (int i = 2; i < arr.length; i++) {
				if (arr[i]) {
					for (int j = i * 2; j < arr.length; j = j + i) {
						arr[j] = false;
					}
				}
			}
			
			for (int i = n+1; i < arr.length; i++) {
				if (arr[i]) {
					cnt++;
				}
			}
			System.out.println(cnt);
		}
		sc.close();
	}

}
