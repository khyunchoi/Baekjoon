package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;


public class Main12015 {
	public static ArrayList<Integer> list = new ArrayList<Integer>();
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		String tmp = br.readLine();
		StringTokenizer st = new StringTokenizer(tmp);
		
		int[] arr = new int[N];
		for (int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		list.add(arr[0]);
		
		for (int i = 1; i < N; i++) {
			if (arr[i] > list.get(list.size() - 1)) {
				list.add(arr[i]);
			} else {
				bSearch(arr[i]);
			}
		}
		
		System.out.println(list.size());
	}

	public static void bSearch(int num) {
		int low = 0;
		int high = list.size() - 1;
		
		while (low <= high) {
			int mid = (low + high) / 2;
			if (num <= list.get(mid)) {
				high = mid - 1;
			} else {
				low = mid + 1;
			}
		}
		
		list.set(low, num);
	}
}
