package Baekjoon;

import java.util.Arrays;
import java.util.Scanner;

public class Main9461 {
	public static long[] arr = new long[101];
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		Arrays.fill(arr, -1);
		arr[0] = 0;
		arr[1] = 1;
		arr[2] = 1;
		arr[3] = 1;
		arr[4] = 2;
		
		for (int i = 0; i < T; i++) {
			int N = sc.nextInt();
			System.out.println(triangle(N));
		}
		sc.close();
		
	}
	
	public static long triangle(int N) {
		if(arr[N] == -1) {
			arr[N] = triangle(N-1) + triangle(N-5);
		}
				
		return arr[N];
	}
}
