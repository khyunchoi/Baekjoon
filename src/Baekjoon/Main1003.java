package Baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Main1003 {
	public static int[] fibo;

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int T = Integer.parseInt(br.readLine());
		int[] arr = new int[T];
		fibo = new int[41];
		Arrays.fill(fibo, -1);
		fibo[0] = 0;
		fibo[1] = 1;
		
		for (int i = 0; i < T; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		br.close();

		for (int i = 0; i < T; i++) {
			if (arr[i] == 0) {
				bw.write(1 + " " + 0);
			} else {
				bw.write(fibonacci(arr[i] - 1) + " " + fibonacci(arr[i]));
			}
			bw.newLine();
		}
		bw.flush();
		bw.close();
	}

	public static int fibonacci(int n) {
		if (fibo[n] == -1) {
			fibo[n] = fibonacci(n - 1) + fibonacci(n - 2);
		}
		return fibo[n];
	}
}
