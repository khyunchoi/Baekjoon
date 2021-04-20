package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;


public class Main1920 {

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
			System.out.println(binarySearch(arr, Integer.parseInt(findSt.nextToken())));
		}
		
	}

	public static int binarySearch(int[] arr, int num) {
		int low = 0;
		int high = arr.length - 1;
		int mid = 0;
		
		while (low <= high) {
			mid = (low + high) / 2;
			if (arr[mid] == num) {
				return 1;
			} else if (arr[mid] > num) {
				high = mid - 1;
			} else {
				low = mid + 1;
			}
			
		}
		
		return 0;
	}
}
