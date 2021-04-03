package Baekjoon;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class Main11866 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		Deque<Integer> queue = new LinkedList<Integer>();

		for (int i = 1; i <= N; i++) {
			queue.offer(i);
		}

		StringBuilder sb = new StringBuilder();
		sb.append("<");
		for (int i = 0; i < N; i++) {
			if (i == N - 1) {
				sb.append(queue.poll() + ">");
				break;
			}
			for (int j = 1; j < K; j++) {
				queue.offer(queue.poll());
			}
			sb.append(queue.poll() + ", ");
		}

		System.out.println(sb);
	}

}
