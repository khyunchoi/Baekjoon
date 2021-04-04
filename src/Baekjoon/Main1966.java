package Baekjoon;

import java.util.LinkedList;
import java.util.Scanner;

public class Main1966 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		for (int i = 0; i < T; i++) {
			int N = sc.nextInt();
			int M = sc.nextInt();
			
			LinkedList<int[]> queue = new LinkedList<int[]>();
			for (int j = 0; j < N; j++) {
				queue.offer(new int[] {j, sc.nextInt()});
			}
			
			int cnt = 0;
			
			while(queue.size() != 0) {
				int[] front = queue.poll();
				boolean isTrue = true;
				
				for (int j = 0; j < queue.size(); j++) {
					if(front[1] < queue.get(j)[1]) {
						queue.offer(front);
						for (int k = 0; k < j; k++) {
							queue.offer(queue.poll());
						}
						
						isTrue = false;
						break;
					}
				}
				
				if(isTrue == false) {
					continue;
				}
				
				cnt++;
				if(front[0] == M) {
					break;
				}
			}
			System.out.println(cnt);
		}

	}

}
