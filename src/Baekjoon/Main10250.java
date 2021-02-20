package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main10250 {
	public static int roomNumber(int H, int W, int N) {
		int X, Y;
		if (N%H == 0) {
			X = H;
			Y = N/H;
		} else {
			X = N%H;
			Y = (N/H)+1;
		}
		return (X*100)+Y;
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		for (int i = 0; i < T; i++) {
		String S = br.readLine();
		StringTokenizer st = new StringTokenizer(S);
		int H = Integer.parseInt(st.nextToken());
		int W = Integer.parseInt(st.nextToken());
		int N = Integer.parseInt(st.nextToken());
		
		System.out.println(roomNumber(H, W, N));
		
		}
	}

}
