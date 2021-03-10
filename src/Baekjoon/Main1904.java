package Baekjoon;

import java.util.Arrays;
import java.util.Scanner;

public class Main1904 {
	public static int[] arr;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		sc.close();
		
		arr = new int[N+1];
		Arrays.fill(arr, -1);
		
		System.out.println(dfs(N));
	}
	
	public static int dfs(int a) {
		if(a == 0) {
			return arr[0] = 0;
		} else if (a == 1) {
			return arr[1] = 1;
		} else if (a == 2) {
			return arr[2] = 2;
		} else {
			if (arr[a] != -1) {
				return arr[a];
			} else {
				arr[a] = (dfs(a - 1) + dfs(a - 2))%15746;
				return arr[a];
			}
		}
	}
}
