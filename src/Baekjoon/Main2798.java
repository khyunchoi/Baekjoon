package Baekjoon;

import java.util.Scanner;

public class Main2798 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		sc.nextLine();
		
		int[] arr = new int[N];
		String[] strarr = sc.nextLine().split(" ");
		sc.close();
		
		for (int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(strarr[i]);
		}
		int sum, max = 0;
		
		for (int i = 0; i < N-2; i++) {
			for (int j = i+1; j < N-1; j++) {
				for (int k = j+1; k < N; k++) {
					sum = arr[i] + arr[j] + arr[k];
					if (sum <= M && max <= sum) {
						max = sum;
					}
				}
			}
		}
		System.out.println(max);
	}

}
