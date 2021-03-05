package Baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main11649 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(br.readLine());
		int[] arrx = new int[N];
		int[] arry = new int[N];
		// 두 배열에 각각 x값, y값 순서대로 대입
		for (int i = 0; i < N; i++) {
			String coor = br.readLine();
			StringTokenizer st = new StringTokenizer(coor);
			arrx[i] = Integer.parseInt(st.nextToken());
			arry[i] = Integer.parseInt(st.nextToken());
		}
		br.close();
		// x값 기준으로 정렬하되 y값도 같이 움직일 수 있도록 함
		int tmp = 0;
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N - 1 - i; j++) {
				if (arrx[j] > arrx[j + 1]) {
					tmp = arrx[j];
					arrx[j] = arrx[j + 1];
					arrx[j + 1] = tmp;
					tmp = arry[j];
					arry[j] = arry[j + 1];
					arry[j + 1] = tmp;
				}
			}
		}
		// x값이 같을 경우 y값 정렬
		for (int i = 0; i < N - 1; i++) {
			if (arrx[i] == arrx[i + 1]) {
				// 선택정렬
				int j = i;
				while (arrx[j] == arrx[j + 1]) {
					int k = j;
					while (arrx[k] == arrx[k + 1]) {
						if (arry[j] > arry[k + 1]) {
							tmp = arry[j];
							arry[j] = arry[k + 1];
							arry[k + 1] = tmp;
						}
						k++;
						if (k == N - 1) {
							break;
						}
					}
					j++;
					if (j == N - 1) {
						break;
					}
				}

			}
		}
		//출력
		for (int i = 0; i < N; i++) {
			bw.write(Integer.toString(arrx[i]) + " ");
			bw.write(Integer.toString(arry[i]));
			bw.newLine();
		}
		bw.flush();
		bw.close();
	}

}
