package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main11054 {
	public static int[] arr;
	public static Integer[] dpf;
	public static Integer[] dpb;

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		arr = new int[N];
		dpf = new Integer[N];
		dpb = new Integer[N];

		String tmp = br.readLine();
		StringTokenizer st = new StringTokenizer(tmp);

		for (int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}

		dpf[0] = 1;
		dpb[dpb.length - 1] = 1;
		
		int max = 0;
		for (int i = 0; i < N; i++) {
			max = Math.max(max, LISF(i) + LISB(i) - 1);
		}
		
		System.out.println(max);
	}

	public static int LISF(int N) {
		if (dpf[N] == null) {
			dpf[N] = 1;
			for (int i = 0; i < N; i++) {
				if (arr[i] < arr[N]) {
					dpf[N] = Math.max(dpf[N], LISF(i) + 1);
				}
			}
		}
		return dpf[N];
	}

	public static int LISB(int N) {
		if (dpb[N] == null) {
			dpb[N] = 1;
			for (int i = dpb.length - 1; i > N; i--) {
				if (arr[i] < arr[N]) {
					dpb[N] = Math.max(dpb[N], LISB(i) + 1);
				}
			}
		}
		return dpb[N];
	}
}
