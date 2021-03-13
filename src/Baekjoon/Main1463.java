package Baekjoon;

import java.util.Arrays;
import java.util.Scanner;

public class Main1463 {
	public static int[] arr;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		sc.close();
		
		arr= new int[N+1];
		Arrays.fill(arr, -1);
		arr[0] = 0;
		arr[1] = 0;
		
		System.out.println(count(N));
	}
	
	public static int count(int N) {
		int a = Integer.MAX_VALUE, b = Integer.MAX_VALUE, c = Integer.MAX_VALUE; 
		if (arr[N] == -1) {
			if (N % 3 == 0) {
				a = count(N/3) + 1; 
			}
			if (N % 2 == 0) {
				b = count(N/2) + 1;
			}
			c = count(N-1) + 1;
			
			arr[N] = Math.min(Math.min(a, b), c);
		}
				
		return arr[N];
	}
}
