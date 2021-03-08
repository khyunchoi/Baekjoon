package Baekjoon;

import java.util.Scanner;

public class Main14888 {
	public static boolean[] visit;
	public static String[] operation;
	public static String[] tmp;
	public static int[] arr;
	public static int result = 0, max = -1000000000, min = 1000000000;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		//수의 개수
		arr = new int[N];
		//수 arr배열에 대입
		for (int i = 0; i < N; i++) {
			arr[i] = sc.nextInt();
		}
		//각 연산자 개수 크기4의 배열에 대입
		int[] operation4 = new int[4];
		for (int i = 0; i < 4; i++) {
			operation4[i] = sc.nextInt();
		}
		sc.close();
		//각 연산자 개수만큼 operation배열에 순서대로 연산자 대입
		operation = new String[N-1];
		tmp = new String[N-1];
		visit = new boolean[N-1];
		int a = 0;
		for (int i = 0; i < 4; i++) {
			while (operation4[i] != 0) {
				switch (i) {
				case 0:
					operation[a++] = "+";
					operation4[i]--;
					break;
				case 1:
					operation[a++] = "-";
					operation4[i]--;
					break;
				case 2:
					operation[a++] = "*";
					operation4[i]--;
					break;
				case 3:
					operation[a++] = "/";
					operation4[i]--;
					break;
				}
			}
		}
		
		dfs(N, 0);
		System.out.println(max);
		System.out.println(min);
	
	}
	
	public static void dfs(int N, int depth) {
		//순서바뀐 연산자 배열들 이용해서 값 계산후 최댓값 최솟값 구하기
		if (depth == N-1) {
			result = arr[0];
			for (int i = 1; i < N; i++) {
				switch (tmp[i-1]) {
				case "+":
					result += arr[i];
					break;
				case "-":
					result -= arr[i];
					break;
				case "*":
					result *= arr[i];
					break;
				case "/":
					result /= arr[i];
					break;
				}
				
			}
			if (result > max) {
				max = result;
			}
			if (result < min) {
				min = result;
			}
			
			return;
		}
		//연산자 배열을 재귀함수 이용해 순서바뀐 연산자 배열들 만들기
		for (int i = 0; i < N - 1; i++) {
			if(!visit[i]) {
				visit[i] = true;
				tmp[depth] = operation[i];
				dfs(N, depth+1);
				visit[i] = false;
			}
		}
	}

}
