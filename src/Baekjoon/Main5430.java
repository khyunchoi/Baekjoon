package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;

public class Main5430 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine());

		while (T-- > 0) {
			String[] arr = br.readLine().split("");
			int N = Integer.parseInt(br.readLine());
			// 테스트 배열 받아서
			String tmp = br.readLine();
			tmp = tmp.replace("[", "");
			tmp = tmp.replace("]", "");
			String[] dequeTmp = tmp.split(",");
			// 덱에 집어넣기
			LinkedList<Integer> deque = new LinkedList<Integer>();
			for (int i = 0; i < N; i++) {
				deque.offer(Integer.parseInt(dequeTmp[i]));
			}

			int cnt = 0;
			boolean isEmpty = false;
			for (String i : arr) {
				if (i.equals("R")) {
					cnt++;
				} else {
					if (deque.size() == 0) {
						isEmpty = true;
						break;
					}
					if (cnt % 2 == 0) {
						deque.poll();
					} else {
						deque.pollLast();
					}
				}
			}

			if (isEmpty) {
				sb.append("error");
			} else {
				sb.append("[");
				if (deque.size() > 0) {
					if (cnt % 2 == 0) {
						while (deque.size() != 0) {
							sb.append(deque.poll() + ",");
						}
					} else {
						while (deque.size() != 0) {
							sb.append(deque.pollLast() + ",");
						}
					}

					sb.deleteCharAt(sb.lastIndexOf(","));
				}
				sb.append("]");
			}
			System.out.println(sb);
			sb.setLength(0);
		}
	}

}
