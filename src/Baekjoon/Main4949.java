package Baekjoon;

import java.util.Scanner;
import java.util.Stack;

public class Main4949 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			String tmp = sc.nextLine();
			if (tmp.equals(".")) {
				break;
			}
			System.out.println(solve(tmp));
		}

	}

	public static String solve(String tmp) {
		Stack<Character> stack = new Stack<>();
		for (int i = 0; i < tmp.length(); i++) {
			char c = tmp.charAt(i);

			if (c == '(' || c == '[') {
				stack.push(c);
			} else if (c == ')') {
				if (stack.empty()) {
					return "no";
				} else if (stack.peek() == '[') {
					return "no";
				} else {
					stack.pop();
				}
			} else if (c == ']') {
				if (stack.empty()) {
					return "no";
				} else if (stack.peek() == '(') {
					return "no";
				} else {
					stack.pop();
				}
			}
		}

		if (stack.empty()) {
			return "yes";
		} else {
			return "no";
		}
	}
}
