package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main11279 {
	public static int[] heap = new int[100001];
	public static int size = 0;
	public static StringBuilder sb = new StringBuilder();

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());

		while (N-- > 0) {
			int tmp = Integer.parseInt(br.readLine());
			if (tmp == 0) {
				if (size == 0) {
					sb.append(0 + "\n");
				} else {
					pop();
				}
			} else {
				push(tmp);
			}
		}
		System.out.println(sb);
	}

	public static void swap(int x, int y) {
		int temp = heap[x];
		heap[x] = heap[y];
		heap[y] = temp;
	}

	public static void push(int x) {
		heap[++size] = x;

		for (int i = size; i > 1; i /= 2) {
			if (heap[i] > heap[i / 2]) {
				swap(i, i / 2);
			} else {
				break;
			}
		}
	}

	public static void pop() {
		sb.append(heap[1] + "\n");
		heap[1] = heap[size];
		heap[size--] = 0;

		for (int i = 1; i * 2 <= size;) {
			if (heap[i] > heap[i * 2] && heap[i] > heap[i * 2 + 1]) {
				break;
			} else if (heap[i * 2] > heap[i * 2 + 1]) {
				swap(i, i * 2);
				i = i * 2;
			} else {
				swap(i, i * 2 + 1);
				i = i * 2 + 1;
			}
		}
	}
}
