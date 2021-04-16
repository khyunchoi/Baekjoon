package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Main6549 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while(true) {
			String str = br.readLine();
			StringTokenizer st = new StringTokenizer(str);
			int n = Integer.parseInt(st.nextToken());
			
			if (n == 0) {
				break;
			}
			
			int[] arr = new int[n];
			for (int i = 0; i < n; i++) {
				arr[i] = Integer.parseInt(st.nextToken());
			}
			
			int maxSum = 0;
			for (int i = 0; i < n; i++) {
				int max = arr[i];
				int min = arr[i];
				for (int j = i + 1; j < n; j++) {
					if (min > arr[j]) {
						min = arr[j];
					}
					
					if (max < min * (j - i + 1)) {
						max = min * (j - i + 1);
					}
				}
				
				if (maxSum < max) {
					maxSum = max;
				}
			}
			
			System.out.println(maxSum);
		}

	}

}
