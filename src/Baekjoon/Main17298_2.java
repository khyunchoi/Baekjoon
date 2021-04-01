package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main17298_2 {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		int[] arr = new int[N];
		Stack<Integer> stack = new Stack<Integer>();
		
		String tmp = br.readLine();
		StringTokenizer st = new StringTokenizer(tmp);

		for (int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		for (int i = 0; i < N; i++) {
			while(!stack.empty() && arr[stack.peek()] < arr[i]) {
				arr[stack.pop()] = arr[i];
			}
			
			stack.push(i);
		}
		
		while(!stack.empty()) {
			arr[stack.pop()] = -1;
		}
		
		StringBuilder sb =new StringBuilder();
		for (int i = 0; i < N; i++) {
			sb.append(arr[i] + " ");
		}
		
		System.out.println(sb);
	}

}
