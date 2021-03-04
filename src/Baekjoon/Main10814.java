package Baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main10814 {
	public static String[][] arr;
	public static String[][] tmp;

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(br.readLine());
		arr = new String[N][2];
		tmp = new String[N][2];

		for (int i = 0; i < N; i++) {
			String a = br.readLine();
			StringTokenizer st = new StringTokenizer(a);
			arr[i][0] = st.nextToken();
			arr[i][1] = st.nextToken();
		}
		br.close();
		mergeSort(0, N - 1);
		for (int i = 0; i < N; i++) {
			bw.write(arr[i][0] + " ");
			bw.write(arr[i][1]);
			bw.newLine();
		}
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
				if (q > end || (p <= mid && Integer.parseInt(arr[p][0]) <= Integer.parseInt(arr[q][0]))) {
					tmp[idx][0] = arr[p][0];
					tmp[idx++][1] = arr[p++][1];
				} else {
					tmp[idx][0] = arr[q][0];
					tmp[idx++][1] = arr[q++][1];
				}
			}

			for (int i = start; i <= end; i++) {
				arr[i][0] = tmp[i][0];
				arr[i][1] = tmp[i][1];
			}

		}

	}
}
