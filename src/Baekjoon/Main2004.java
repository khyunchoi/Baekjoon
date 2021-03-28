package Baekjoon;

import java.util.Scanner;

public class Main2004 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		sc.close();
		
		System.out.println(Math.min(five(n) - five(m) - five(n - m), two(n) - two(m) - two(n - m)));
				
	}
	
	public static int five(int a) {
		int sum = 0;
		while(a >= 5) {
			a /= 5;
			sum += a;
		}
		
		return sum;
	}
	
	public static int two(int a) {
		int sum = 0;
		while(a >= 2) {
			a /= 2;
			sum += a;
		}
		
		return sum;
	}
}
