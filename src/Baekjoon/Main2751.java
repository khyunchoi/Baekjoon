package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main2751 {

	public static int[] src;
	public static int[] tmp;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		src = new int[N];
		tmp = new int[N];
		for (int i = 0; i < N; i++) {
			src[i] = Integer.parseInt(br.readLine());
		}
		br.close();
		
		mergeSort(0, N-1);
		for (int i = 0; i < N; i++) {
			System.out.println(src[i]);
		}
		
	}

	public static void mergeSort(int start, int end) {
		if (start < end) {
			int mid = (start + end) / 2;
			mergeSort(start, mid);
			mergeSort(mid + 1, end);
			int p = start;
			int q = mid + 1;
			int idx = p;
			while (p <= mid || q <= end) {
				if (q > end || (p <= mid && src[p] < src[q])) {
					tmp[idx++] = src[p++];
				} else {
					tmp[idx++] = src[q++];
				}
			}
			for (int i = start; i <= end; i++) {
				src[i] = tmp[i];
			}
		}
	}

}
