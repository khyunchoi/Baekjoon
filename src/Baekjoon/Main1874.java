package Baekjoon;

import java.util.Scanner;
import java.util.Stack;

public class Main1874 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Stack<Integer> stack = new Stack<>();
		StringBuilder sb = new StringBuilder();

		int tmp = 0;
		int cnt = n;
		int a = 0;
		boolean isTrue = true;
		for (int i = 0; i < n; i++) {
			a = sc.nextInt();
			if (stack.empty()) {
				for (int j = 0; j < a; j++) {
					sb.append("+\n");
				}
				sb.append("-\n");
				stack.push(a);
				tmp = a;
				cnt--;
			} else if (stack.peek() == a + 1) {
				sb.append("-\n");
				stack.push(a);
				cnt--;
			} else if (stack.peek() < a) {
				for (int j = 0; j < a - tmp; j++) {
					sb.append("+\n");
				}
				sb.append("-\n");
				stack.push(a);
				tmp = a;
				cnt--;
			} else {
				isTrue = false;
				cnt--;
			}
			if (a == n) {
				break;
			}
		}

		for (int i = 0; i < cnt; i++) {
			int b = sc.nextInt();
			if (b < a) {
				a = b;
				sb.append("-\n");
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
