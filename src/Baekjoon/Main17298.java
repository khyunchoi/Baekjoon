package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main17298 {
	public static int[] arr;
	public static Stack<Integer> stack = new Stack<>();

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		arr = new int[N];
		String tmp = br.readLine();
		StringTokenizer st = new StringTokenizer(tmp);

		for (int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}

		StringBuilder sb = new StringBuilder();
		for (int i = 1; i <= N; i++) {
			sb.append(NGE(i) + " ");
		}

		System.out.println(sb);
	}

	public static int NGE(int idx) {
		while (stack.size() > idx - 1) {
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
