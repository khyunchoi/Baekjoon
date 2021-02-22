package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main2581 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int M = Integer.parseInt(br.readLine());
		int N = Integer.parseInt(br.readLine());
		int sum = 0, min = 0;
		for (int i = M; i <= N; i++) {
			boolean isPrime = true;
			if (i == 1) {
				isPrime = false;
			} else {
				for (int j = 2; j < i; j++) {
					if (i % j == 0) {
						isPrime = false;
					}
				}
			}
			if (isPrime) {
				sum += i;
				if(min == 0) {
					min = i;
				}
			}
		}
		if(sum != 0) {
		System.out.println(sum);
		System.out.println(min);
		} else {
			System.out.println(-1);
		}
	}

}
