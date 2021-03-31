package Baekjoon;

import java.util.Scanner;
import java.util.Stack;

public class Main17298 {
	public static int[] arr;
	public static Stack<Integer> stack = new Stack<>();
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		arr = new int[N];
		
		for (int i = 0; i < N; i++) {
			arr[i] = sc.nextInt();
		}
		sc.close();
		
		for (int i = 1; i <=N; i++) {
			System.out.print(NGE(i) + " ");
		}
		
	}
	
	public static int NGE(int idx) {
		while(stack.size() > idx - 1) {
			stack.pop();
		}
		stack.push(arr[idx - 1]);
		
		for (int i = idx; i < arr.length; i++) {
			stack.push(arr[i]);
			if (stack.peek() > arr[idx - 1]) {
				return stack.peek();
			}
		}
		return -1;
	}
}
