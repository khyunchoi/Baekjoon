package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main1654 {
	public static int[] arr;

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		StringTokenizer st = new StringTokenizer(tmp);
		int K = Integer.parseInt(st.nextToken());
		arr = new int[K];
		int N = Integer.parseInt(st.nextToken());

		for (int i = 0; i < K; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}

		System.out.println(binarySearch(N));

	}

	public static long binarySearch(long N) {
		long low = 1;
		long high = 0;
		for (int i = 0; i < arr.length; i++) {
			high = Math.max(arr[i], high);
		}
		long mid = 0;

		while (low <= high) {
			mid = (low + high) / 2;
			if (lanCut(mid) < N) {
				high = mid - 1;
			} else {
				low = mid + 1;
			}
		}

		return high;
	}

	public static long lanCut(long a) {
		long sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i] / a;
		}

		return sum;
	}
}
