package Baekjoon;

import java.util.Scanner;

public class Main10872 {
	public static int factorial(int i) {
		if (i == 0) {
			return 1;
		} else {
			return i * factorial(i-1);
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		sc.close();
		
		System.out.println(factorial(N));

	}

}
