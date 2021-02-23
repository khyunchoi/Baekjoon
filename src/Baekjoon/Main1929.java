package Baekjoon;

import java.util.Arrays;
import java.util.Scanner;

public class Main1929 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int M = sc.nextInt();
		int N = sc.nextInt();
		sc.close();
		boolean[] arr = new boolean[N+1];
		Arrays.fill(arr, true);
		
		arr[0] = false;
		arr[1] = false;
		
		for (int i = 2; i<arr.length; i++) {
			if (arr[i]) {
				for(int j = i * 2; j<arr.length; j = j + i) {
					arr[j] = false;
				}
			}
		}
		
		for (int i = M; i <= N; i++) {
			if(arr[i]) {
				System.out.println(i);
			}
		}
	}

}
