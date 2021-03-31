package Baekjoon;

import java.util.Scanner;
import java.util.Stack;

public class Main1874_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Stack<Integer> stack = new Stack<>();
		StringBuilder sb = new StringBuilder();
		
		int tmp = 0;
		boolean isTrue = true;
		for (int i = 0; i < n; i++) {
			int num = sc.nextInt();
			if (stack.empty()) {
				for (int j = tmp + 1; j <= num; j++) {
					stack.push(j);
					sb.append("+\n");
				}
				stack.pop();
				sb.append("-\n");
				tmp = num;
			} else if (stack.peek() == num){
				stack.pop();
				sb.append("-\n");
			} else if (stack.peek() < num) {
				for (int j = tmp + 1; j <= num; j++) {
					stack.push(j);
					sb.append("+\n");
				}
				stack.pop();
				sb.append("-\n");
				tmp = num;
			} else {
				isTrue = false;
			}
		}
		
		if (!isTrue) {
			sb.delete(0, sb.length());
			System.out.println("NO");
		}
		System.out.println(sb);

	}

}
