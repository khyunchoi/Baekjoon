package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main1978 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		String S = br.readLine();
		StringTokenizer st = new StringTokenizer(S);
		int num, cnt = 0;
		
		for(int i = 0; i < N; i++) {
			boolean isPrime = true;
			num = Integer.parseInt(st.nextToken());
			for(int j = 2; j < num; j++) {
				if(num%j == 0) {
					isPrime = false;
				}
			}
			if(num == 1) {
				isPrime = false;
			}
			if(isPrime) {
				cnt++;
			}
		}
		System.out.println(cnt);
	}

}
