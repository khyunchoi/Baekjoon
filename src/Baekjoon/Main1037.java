package Baekjoon;

import java.util.Arrays;
import java.util.Scanner;

public class Main1037 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		long[] arr = new long[N];
		
		for (int i = 0; i < N; i++) {
			arr[i] = sc.nextLong();
		}
		sc.close();
		Arrays.sort(arr);
		
		System.out.println(arr[0] * arr[arr.length - 1]);
	}

}
