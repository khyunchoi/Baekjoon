package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Main1931 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int[][] conference = new int[N][2];
		// 배열 입력
		for (int i = 0; i < N; i++) {
			String tmp = br.readLine();
			StringTokenizer st = new StringTokenizer(tmp);
			conference[i][0] = Integer.parseInt(st.nextToken());
			conference[i][1] = Integer.parseInt(st.nextToken());
		}
		// 각 행 2열을 기준으로 오름차순 정렬 만약 2열이 같은 행은 1열을 기준으로 오름차순 정렬
		Arrays.sort(conference, new Comparator<int[]>() {
			@Override
			public int compare(int[] o1, int[] o2) {
				if (o1[1] != o2[1]) {
					return o1[1] - o2[1];
				} else {
					return o1[0] - o2[0];
				}
			}
		});
		// 현재 tmpEnd에 담긴 행의 2열 값보다 행의 1열값이 크거나 같으면 tmpEnd에 담고 cnt증가
		int tmpEnd = conference[0][1];
		int cnt = 1;
		for (int i = 1; i < N; i++) {
			if (tmpEnd <= conference[i][0]) {
				cnt++;
				tmpEnd = conference[i][1];
			}
		}

		System.out.println(cnt);

	}

}
