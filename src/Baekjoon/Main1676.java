package Baekjoon;

import java.util.Scanner;

public class Main1676 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		sc.close();
		
		int sum = 0;
		for (int i = 0; i < 3; i++) {
			N /= 5;
			sum += N;
		}
		System.out.println(sum);

	}

}
