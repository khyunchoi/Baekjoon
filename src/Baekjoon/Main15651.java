package Baekjoon;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class Main15651 {
	public static int[] arr;
	public static int N, M;
	public static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		
		N = sc.nextInt();
		M = sc.nextInt();
		sc.close();

		arr = new int[M];
		dfs(0);
		bw.flush();
	}

	public static void dfs(int depth) throws IOException {
		if (depth == M) {
			for (int i = 0; i < M; i++) {
				bw.write(arr[i] + " ");
			}
			bw.newLine();
			return;
		}
		
		for (int i = 1; i <= N; i++) {
			arr[depth] = i;
			dfs(depth+1);
		}
		
	}
}
