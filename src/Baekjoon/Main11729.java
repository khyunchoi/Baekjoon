package Baekjoon;

import java.util.Scanner;

public class Main11729 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		sc.close();
		
		System.out.println((int)Math.pow(2, N)-1);
		hanoi(1, 3, 2, N);

	}
	
	public static void hanoi(int a, int b, int c, int num) {
		while (num >= 1) {
			num--;
			hanoi(a, c, b, num);
			System.out.println(a + " " + b);
			hanoi(c, b, a, num);
			break;
		}
	}

}
