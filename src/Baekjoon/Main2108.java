package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main2108 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int[] arr = new int[N];
		int avg, mid, freq = 0, arg;
		int sum = 0;
		int[] cnt = new int[8001];
		int cntmax = 0;

		for (int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		
		// 산술평균
		for (int i = 0; i < N; i++) {
			sum += arr[i];
		}
		avg = Math.round((float) sum / N);
		
		// 중앙값
		Arrays.sort(arr);
		mid = arr[N / 2];
		
		// 최빈값
		for (int i = 0; i < N; i++) {
			cnt[arr[i] + 4000]++;
		}

		for (int i = 0; i < cnt.length; i++) {
			if (cntmax <= cnt[i]) {
				cntmax = cnt[i];
			}
		}

		int count = 0;
		for (int i = 0; i < cnt.length; i++) {
			if (cnt[i] == cntmax) {
				count++;
			}
		}

		if (count == 1) {
			for (int i = 0; i < cnt.length; i++) {
				if (cnt[i] == cntmax) {
					freq = i - 4000;
				}
			}
		} else {
			count = 0;
			for (int i = 0; i < cnt.length; i++) {
				if (cnt[i] == cntmax) {
					freq = i - 4000;
					count++;
					if (count == 2) {
						break;
					}
				}
			}
		}

		// 범위
		arg = arr[arr.length - 1] - arr[0];

		System.out.println(avg);
		System.out.println(mid);
		System.out.println(freq);
		System.out.println(arg);
	}

}
