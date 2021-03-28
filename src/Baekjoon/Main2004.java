package Baekjoon;

import java.util.Scanner;

public class Main2004 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		sc.close();
		
		System.out.println(zero(n));
		System.out.println(zero(m));
		System.out.println(zero(n - m));
		
	}
	
	public static int zero(int a) {
		int sum = 0;
		while(a >= 5) {
			a /= 5;
			sum += a;
		}
		
		return sum;
	}
}
