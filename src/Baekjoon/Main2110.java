package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main2110 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		StringTokenizer st = new StringTokenizer(tmp, " ");
		int N = Integer.parseInt(st.nextToken());
		int C = Integer.parseInt(st.nextToken());
		int[] arr = new int[N];

		for (int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}

		Arrays.sort(arr);

		int left = 1;
		int right = arr[arr.length - 1] - arr[0];
		int d = 0;
		int ans = 0;

		while (left <= right) {
			int mid = (left + right) / 2;
			int start = arr[0];
			int cnt = 1;

			for (int i = 1; i < N; i++) {
				d = arr[i] - start;
				if (mid <= d) {
					cnt++;
					start = arr[i];
				}
			}

			if (cnt >= C) {
				ans = mid;
				left = mid + 1;
			} else {
				right = mid - 1;
			}

		}
		System.out.println(ans);
	}

}
