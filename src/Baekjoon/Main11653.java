package Baekjoon;

import java.util.ArrayList;
import java.util.Scanner;

public class Main11653 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		ArrayList<Integer> list = new ArrayList<>();
		for (int i = 2; i <= N; i++) {
			while (N % i == 0) {
				N = N / i;
				list.add(i);
			}
		}
		
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		sc.close();
	}

}
