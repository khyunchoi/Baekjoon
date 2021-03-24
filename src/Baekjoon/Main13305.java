package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main13305 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		String[] lengthTmp = br.readLine().split(" ");
		String[] costTmp = br.readLine().split(" ");
		long[] length = new long[lengthTmp.length];
		long[] cost = new long[costTmp.length];

		for (int i = 0; i < lengthTmp.length; i++) {
			length[i] = Long.parseLong(lengthTmp[i]);
		}

		for (int i = 0; i < costTmp.length; i++) {
			cost[i] = Long.parseLong(costTmp[i]);
		}
		cost[cost.length - 1] = 0;
		
		long sum = 0;
		int j;
		for (int i = 0; i < length.length; i = j) {
			j = i + 1;
			sum += cost[i] * length[i];
			while (cost[i] < cost[j]) {
				sum += cost[i] * length[j];
				j++;
			}
		}

		System.out.println(sum);

	}

}
