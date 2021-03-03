package Baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main1181 {
	public static String arr[];
	public static String tmp[];

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(br.readLine());
		arr = new String[N];
		tmp = new String[N];

		for (int i = 0; i < N; i++) {
			arr[i] = br.readLine();
		}

		mergeSort(0, N - 1);
		for (int i = 0; i < N-1; i++) {
			if (!arr[i].equals(arr[i + 1])) {
				bw.write(arr[i]);
				bw.newLine();
			}
		}
		bw.write(arr[N-1]);
		bw.flush();
		bw.close();
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
				if (q > end || (p <= mid && arr[p].length() < arr[q].length())) {
					tmp[idx++] = arr[p++];
				} else if (p <= mid && arr[p].length() == arr[q].length()){
					for (int i = 0; i < arr[p].length(); i++) {
						if (arr[p].equals(arr[q])) {
							tmp[idx++] = arr[p++];
							break;
						}
						
						if ((int) arr[p].charAt(i) < (int) arr[q].charAt(i)) {
							tmp[idx++] = arr[p++];
							break;
						} else if ((int) arr[p].charAt(i) > (int) arr[q].charAt(i)) {
							tmp[idx++] = arr[q++];
							break;
						}
					}
				} else {
					tmp[idx++] = arr[q++];
				}
			}

			for (int i = start; i <= end; i++) {
				arr[i] = tmp[i];
			}
		}

	}
}
