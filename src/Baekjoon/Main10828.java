package Baekjoon;

import java.util.Scanner;

public class Main10828 {
	public static int[] stack;
	public static int size = 0;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		
		int N = sc.nextInt();
		stack = new int[N];
		
		for (int i = 0; i < N; i++) {
			String tmp = sc.next();
			switch(tmp) {
			case "push":
				push(sc.nextInt());
				break;
			
			case "pop":
				sb.append(pop() + "\n");
				break;
				
			case "size":
				sb.append(size() + "\n");
				break;
				
			case "empty":
				sb.append(empty() + "\n");
				break;
				
			case "top":
				sb.append(top() + "\n");
				break;
			}
		
		}
		System.out.println(sb);

	}
	
	public static void push(int a) {
		stack[size] = a;
		size++;
	}
	
	public static int pop() {
		if (size == 0) {
			return -1;
		} else {
			int tmp = stack[size - 1];
			stack[size - 1] = 0;
			size--;
			return tmp;
		}
	}
	
	public static int size() {
		return size;
	}
	
	public static int empty() {
		if (size == 0) {
			return 1;
		} else {
			return 0;
		}
	}
	
	public static int top() {
		if (size == 0) {
			return -1;
		} else {
			return stack[size - 1];
		}
	}
}
