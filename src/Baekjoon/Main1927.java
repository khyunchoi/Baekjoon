package Baekjoon;

import java.util.PriorityQueue;
import java.util.Scanner;

public class Main1927 {

	public static void main(String[] args) {
		int N, num;

		Scanner sc = new Scanner(System.in);

		N = sc.nextInt();
		PriorityQueue<Integer> priority = new PriorityQueue<>();

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
