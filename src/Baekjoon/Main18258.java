package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main18258 {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		Deque<Integer> que = new LinkedList<>();

		int N = Integer.parseInt(br.readLine());

		StringTokenizer st;

		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine(), " ");

			switch (st.nextToken()) {
			case "push":
				que.offer(Integer.parseInt(st.nextToken()));
				break;

			case "pop":
				Integer tmp = que.poll();
				if (tmp == null) {
					sb.append("-1\n");
				} else {
					sb.append(tmp + "\n");
				}
				break;

			case "size":
				sb.append(que.size() + "\n");
				break;

			case "empty":
				if (que.isEmpty()) {
					sb.append("1\n");
				} else {
					sb.append("0\n");
				}
				break;

			case "front":
				Integer tmp2 = que.peek();
				if (tmp2 == null) {
					sb.append("-1\n");
				} else {
					sb.append(tmp2 + "\n");
				}
				break;

			case "back":
				Integer tmp3 = que.peekLast();
				if (tmp3 == null) {
					sb.append("-1\n");
				} else {
					sb.append(tmp3 + "\n");
				}
				break;
			}

		}
		System.out.println(sb);
	}

}
