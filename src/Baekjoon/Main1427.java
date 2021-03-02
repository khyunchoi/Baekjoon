package Baekjoon;

import java.util.Arrays;
import java.util.Scanner;

public class Main1427 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String N = sc.next();
		int M = Integer.parseInt(N);
		int[] arr = new int[N.length()];
		sc.close();

		for (int i = 0; i < arr.length; i++) {
			arr[i] = M % 10;
			M /= 10;
		}
		Arrays.sort(arr);

		for (int i = arr.length - 1; i >= 0; i--) {
			System.out.print(arr[i]);
		}
	}

}
