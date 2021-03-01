package Baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main10989 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(br.readLine());
		int[] src = new int[N];
		int[] tmp = new int[10000];
		int[] result = new int[N];
		
		for(int i = 0; i < N; i++) {
			src[i] = Integer.parseInt(br.readLine());
			tmp[src[i]-1]++;
		}
		
		for(int i = 1; i < tmp.length; i++) {
			tmp[i] += tmp[i-1];
		}
		
		for(int i = 0; i < N; i++) {
			result[--tmp[src[i]-1]] =src[i];
		}
		
		for(int i = 0; i < N; i++) {
			bw.write(Integer.toString(result[i]));
			bw.newLine();
		}
		bw.flush();
		bw.close();
	}

}
