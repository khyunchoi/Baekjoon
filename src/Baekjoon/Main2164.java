package Baekjoon;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class Main2164 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		sc.close();

		Deque<Integer> que = new LinkedList<>();
		for (int i = 1; i <= N; i++) {
			que.offer(i);
		}

		while (que.size() != 1) {
			que.poll();
			que.offer(que.poll());
		}
		
		System.out.println(que.peek());
	}

}
