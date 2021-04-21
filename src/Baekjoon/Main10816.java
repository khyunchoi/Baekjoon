package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main10816 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int[] arr = new int[N];

		String tmp = br.readLine();
		StringTokenizer st = new StringTokenizer(tmp, " ");

		for (int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}

		Arrays.sort(arr);

		int M = Integer.parseInt(br.readLine());
		String find = br.readLine();
		StringTokenizer findSt = new StringTokenizer(find, " ");

		while (M-- > 0) {
			System.out.print(binarySearch(arr, Integer.parseInt(findSt.nextToken())) + " ");
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
