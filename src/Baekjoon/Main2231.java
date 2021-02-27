package Baekjoon;

import java.util.Scanner;

public class Main2231 {
	public static int con(int a) {
		int result = a;
		for (int i = 0; i < 6; i++) {
			result += a % 10;
			a /= 10;
		}
		return result;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		sc.close();
		int answer = 0;
		for (int i = 1; i < N; i++) {
			if (N == con(i)) {
				answer = i;
				break;
			}
		}
		System.out.println(answer);
	}

}
