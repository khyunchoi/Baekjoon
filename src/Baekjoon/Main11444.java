package Baekjoon;

import java.util.Scanner;

public class Main11444 {
	public static long[][] matrix = new long[2][2];
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		
		matrix[0][0] = 0;
		matrix[0][1] = 1;
		matrix[1][0] = 1;
		matrix[1][1] = 1;
		
		long[][] result = partition(n + 1);
		
		System.out.println(result[0][0]);
	}
	
	public static long[][] partition(long n){
		if (n == 1) {
			return matrix;
		}
		
		long[][] memo = partition(n / 2);
		
		if (n % 2 == 0) {
			return multi(memo, memo);
		} else {
			return multi(multi(memo, memo), matrix);
		}
	}
	
	public static long[][] multi(long[][] arr1, long[][] arr2) {
		long[][] tmp = new long[arr1.length][arr1.length];

		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr1.length; j++) {
				long res = 0;
				for (int k = 0; k < arr1.length; k++) {
					res += arr1[i][k] * arr2[k][j];
				}
				tmp[i][j] = res % 1000000007;
			}
		}

		return tmp;
	}
}
