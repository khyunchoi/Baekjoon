package Baekjoon;

import java.util.Scanner;

public class Main1629 {
	public static long C;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long A = sc.nextLong();
		long B = sc.nextLong();
		C = sc.nextLong();
		sc.close();
		
		System.out.println(square(A, B));
		
	}
	
	public static long square(long A, long B) {
		if (B == 1) {
			return A % C;
		}
		
		long tmp = square(A, B/2);
		
		if (B % 2 == 1) {
			return (tmp * tmp % C) * A % C;
		}
		
		return tmp * tmp % C;
	}

}
