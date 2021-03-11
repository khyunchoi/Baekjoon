package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main1149 {
	public static int[][] arr;
	public static int[] tmp = new int[3];
	public static int[] result = new int[3];

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		arr = new int[N][3];

		for (int i = 0; i < N; i++) {
			String tmp = br.readLine();
			StringTokenizer st = new StringTokenizer(tmp);
			arr[i][0] = Integer.parseInt(st.nextToken());
			arr[i][1] = Integer.parseInt(st.nextToken());
			arr[i][2] = Integer.parseInt(st.nextToken());
		}

		for (int i = 0; i < 3; i++) {
			tmp[i] = arr[0][i];
		}

		rgb(1);

	}

	public static void rgb(int depth) {
		if (depth == arr.length) {
			System.out.println(Math.min(Math.min(tmp[0], tmp[1]), tmp[2]));
		} else {
			result[0] = Math.min((arr[depth][0] + tmp[1]), (arr[depth][0] + tmp[2]));
			result[1] = Math.min((arr[depth][1] + tmp[0]), (arr[depth][1] + tmp[2]));
			result[2] = Math.min((arr[depth][2] + tmp[0]), (arr[depth][2] + tmp[1]));
			for (int i = 0; i < 3; i++) {
				tmp[i] = result[i];
			}
			rgb(depth + 1);
		}

	}

}
