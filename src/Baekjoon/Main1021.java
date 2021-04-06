package Baekjoon;

import java.util.LinkedList;
import java.util.Scanner;

public class Main1021 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();

		LinkedList<Integer> deque = new LinkedList<>();
		for (int i = 1; i <= N; i++) {
			deque.offer(i);
		}

		int sum = 0;
		for (int i = 0; i < M; i++) {
			int cnt = 0;
			int num = sc.nextInt();
			while (num != deque.peek()) {
				deque.offer(deque.poll());
				cnt++;
			}
			if (cnt <= deque.size() / 2) {
				sum += cnt;
			} else {
				sum += (deque.size() - cnt);
			}
			deque.poll();
		}

		System.out.println(sum);

	}

}
