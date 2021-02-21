package Baekjoon;

import java.math.BigInteger;
import java.util.Scanner;

public class Main10757 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String A = scan.next();
		String B = scan.next();
		scan.close();
		BigInteger bigA = new BigInteger(A);
		BigInteger bigB = new BigInteger(B);
		System.out.println(bigA.add(bigB));
	}

}
