package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main2805 {
	public static long[] arr;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		StringTokenizer st = new StringTokenizer(tmp, " ");
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());

		String tree = br.readLine();
		StringTokenizer treeSt = new StringTokenizer(tree, " ");
		arr = new long[N];
		for (int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(treeSt.nextToken());
		}

		System.out.println(binarySearch(M));

	}

	public static long binarySearch(long num) {
		long low = 1;
		long high = 0;
		for (int i = 0; i < arr.length; i++) {
			high = Math.max(high, arr[i]);
		}
		long mid = 0;

		while (low <= high) {
			mid = (low + high) / 2;
			if (cut(mid) < num) {
				high = mid - 1;
			} else {
				low = mid + 1;
			}

		}

		return high;
	}

	public static long cut(long height) {
		long sum = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > height) {
				sum += (arr[i] - height);
			}
		}

		return sum;
	}

}
