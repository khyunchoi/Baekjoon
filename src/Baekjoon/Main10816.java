package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main10816 {
	public static int[] arr;
	public static int[] tmp;

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		arr = new int[N];
		tmp = new int[N];

		String tmp = br.readLine();
		StringTokenizer st = new StringTokenizer(tmp, " ");

		for (int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}

		mergeSort(0, N - 1);

		int M = Integer.parseInt(br.readLine());
		String find = br.readLine();
		StringTokenizer findSt = new StringTokenizer(find, " ");

		while (M-- > 0) {
			System.out.print(binarySearch(arr, Integer.parseInt(findSt.nextToken())) + " ");
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
				if (q > end || (p <= mid && arr[p] < arr[q])) {
					tmp[idx++] = arr[p++];
				} else {
					tmp[idx++] = arr[q++];
				}
			}
			for (int i = start; i <= end; i++) {
				arr[i] = tmp[i];
			}
		}
	}

	public static int binarySearch(int[] arr, int num) {
		int low = 0;
		int high = arr.length - 1;
		int mid = 0;
		int cnt = -1;

		while (low <= high) {
			mid = (low + high) / 2;
			if (arr[mid] == num) {
				break;
			} else if (arr[mid] > num) {
				high = mid - 1;
			} else {
				low = mid + 1;
			}

		}

		int midDown = mid;
		int midUp = mid;

		while (arr[midDown] == num) {
			cnt++;
			if (midDown == 0) {
				break;
			}
			midDown--;
		}

		while (arr[midUp] == num) {
			cnt++;
			if (midUp == arr.length - 1) {
				break;
			}
			midUp++;
		}

		if (cnt == -1) {
			cnt++;
		}
		return cnt;
	}
}
