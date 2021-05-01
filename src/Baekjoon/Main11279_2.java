package Baekjoon;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main11279_2 {

	public static void main(String[] args) {
		int N, num;

		Scanner sc = new Scanner(System.in);

		N = sc.nextInt();
		PriorityQueue<Integer> priority = new PriorityQueue<>(Collections.reverseOrder());

		while (N-- > 0) {
			num = sc.nextInt();
			if (num == 0) {
				if (priority.isEmpty())
					System.out.println("0");
				else
					System.out.println(priority.poll());
			} else {
				priority.add(num);
			}
		}
	}
}
