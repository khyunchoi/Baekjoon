package Baekjoon;

import java.util.Scanner;

public class Main11401 {
	public static long P = 1000000007;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long N = sc.nextLong();
		long K = sc.nextLong();
		
		long result = fact(N) * square(fact(K) * fact(N - K), P - 2) % P;
		
		System.out.println(result);
	}
	
	public static long fact(long num) {
		long res = 1;
		
		while (num > 1) {
			res = res * num % P;
			num--;
		}
		
		return res;
	}
	
	public static long square(long A, long B) {
		if (B == 1) {
			return A % P;
		}
		
		long tmp = square(A, B/2);
		
		if (B % 2 == 1) {
			return (tmp * tmp % P) * A % P;
		}
		
		return tmp * tmp % P;
	}
}
