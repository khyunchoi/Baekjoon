package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main10773 {
	public static int[] stack;
	public static int size = 0;
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int K = Integer.parseInt(br.readLine());
		stack = new int[K];
		
		for (int i = 0; i < K; i++) {
			int tmp = Integer.parseInt(br.readLine());
			if (tmp == 0) {
				stack[size - 1] = 0;
				size--;
			} else {
				stack[size] = tmp;
				size++;
			}
		}
		
		int sum = 0;
		for (int i = 0; i < K; i++) {
			sum += stack[i];
		}
		System.out.println(sum);
	}

}
