package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main14889 {
	public static int[][] arr;
	public static boolean[] isTrue;
	public static int N;
	public static int Min = Integer.MAX_VALUE;

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		arr = new int[N][N];
		isTrue = new boolean[N];
		isTrue[0] = true;
		for (int i = 0; i < N; i++) {
			String tmp = br.readLine();
			StringTokenizer st = new StringTokenizer(tmp);
			for (int j = 0; j < N; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		br.close();

		dfs(1, 1);

		System.out.println(Min);

	}

	// 백트래킹으로 팀 나누고 능력치 차이 최솟값 출력
	public static void dfs(int at, int depth) {
		if (depth == N / 2) {
			Min = Math.min(teamDiff(isTrue), Min);
			return;
			
		}

		for (int i = at; i < N; i++) {
			if (!isTrue[i]) {
				isTrue[i] = true;
				dfs(i + 1, depth + 1);
				isTrue[i] = false;
			}
		}

	}

	// 팀 능력치 차이 리턴
	public static int teamDiff(boolean[] isTrue) {
		int sum1 = 0, sum2 = 0;
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				if (isTrue[i] && isTrue[j]) {
					sum1 += arr[i][j];
				} else if (!isTrue[i] && !isTrue[j]) {
					sum2 += arr[i][j];
				}
			}
		}

		return Math.abs(sum1 - sum2);
	}
}
