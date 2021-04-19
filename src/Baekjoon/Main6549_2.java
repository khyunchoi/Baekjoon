package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main6549_2 {
	public static int[] arr;
	public static int n;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while (true) {
			String str = br.readLine();
			StringTokenizer st = new StringTokenizer(str);
			n = Integer.parseInt(st.nextToken());

			if (n == 0) {
				break;
			}

			arr = new int[n];
			for (int i = 0; i < n; i++) {
				arr[i] = Integer.parseInt(st.nextToken());
			}

			System.out.println(getMax(0, n - 1));

		}
	}

	public static long getMax(int left, int right) {
		if (left == right) {
			return arr[left];
		}

		int mid = (left + right) / 2;

		long res = Math.max(getMax(left, mid), getMax(mid + 1, right));

		int start = mid;
		int end = mid + 1;
		long height = Math.min(arr[start], arr[end]);
		res = Math.max(res, height * 2);

		while (left < start || end < right) {
			if (left < start && end < right) {
				if (arr[start - 1] < arr[end + 1]) {
					height = Math.min(height, arr[++end]);
				} else {
					height = Math.min(height, arr[--start]);
				}
			} else if (left < start) {
				height = Math.min(height, arr[--start]);
			} else {
				height = Math.min(height, arr[++end]);
			}

			res = Math.max(res, height * (end - start + 1));
		}

		return res;
	}

}
