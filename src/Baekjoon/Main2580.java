package Baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main2580 {
	public static int[][] arr = new int[9][9];
	public static int cnt = 0;
	public static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//스도쿠 2차원 행렬에 입력
		for (int i = 0; i < 9; i++) {
			String tmp = br.readLine();
			StringTokenizer st = new StringTokenizer(tmp);
			for (int j = 0; j < 9; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
				if (arr[i][j] == 0) {
					cnt++;
				}
			}
		}

		sudoku(0);
		bw.flush();
		bw.close();
	}

	public static void sudoku(int depth) throws IOException {
		// 완료 후 출력
		if (depth == cnt) {
			for (int i = 0; i < 9; i++) {
				for (int j = 0; j < 9; j++) {
					bw.write(arr[i][j] + " ");
				}
				bw.newLine();
			}
			return;
		}

		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
				if (arr[i][j] == 0 && (rowPossiblity(i, j) || colPossiblity(i, j) || boxPossiblity(i, j))) {
					if (rowPossiblity(i, j)) {
						// 행에 0이 하나밖에 없으면 행을 다 더해서 45에서 뺀 수가 없는 수
						int rowsum = 0;
						for (int k = 0; k < 9; k++) {
							rowsum += arr[i][k];
						}
						arr[i][j] = 45 - rowsum;

					} else if (colPossiblity(i, j)) {
						// 열에 0이 하나밖에 없으면 열을 다 더해서 45에서 뺀 수가 없는 수
						int colsum = 0;
						for (int k = 0; k < 9; k++) {
							colsum += arr[k][j];
						}
						arr[i][j] = 45 - colsum;
					} else if (boxPossiblity(i, j)) {
						// 33박스에 0이 하나밖에 없으면 33박스를 다 더해서 45에서 뺀 수가 없는 수
						int boxsum = 0;
						for (int m = i / 3 * 3; m < (i / 3 * 3) + 3; m++) {
							for (int n = j / 3 * 3; n < (j / 3 * 3) + 3; n++) {
								boxsum += arr[m][n];
							}
						}
						arr[i][j] = 45 - boxsum;
					}
					sudoku(depth + 1);
				}
			}
		}
	}

	// 행에 0이 하나밖에 없는지 판단
	public static boolean rowPossiblity(int a, int b) {
		int rowcnt = 0;

		for (int i = 0; i < 9; i++) {
			if (arr[a][i] == 0) {
				rowcnt++;
			}
		}

		if (rowcnt == 1) {
			return true;
		}

		return false;
	}

	// 열에 0이 하나밖에 없는지 판단
	public static boolean colPossiblity(int a, int b) {
		int colcnt = 0;

		for (int i = 0; i < 9; i++) {
			if (arr[i][b] == 0) {
				colcnt++;
			}
		}

		if (colcnt == 1) {
			return true;
		}

		return false;
	}

	// 33박스에 0이 하나밖에 없는지 판단
	public static boolean boxPossiblity(int a, int b) {
		int boxcnt = 0;

		for (int i = a / 3 * 3; i < (a / 3 * 3) + 3; i++) {
			for (int j = b / 3 * 3; j < (b / 3 * 3) + 3; j++) {
				if (arr[i][j] == 0) {
					boxcnt++;
				}
			}
		}

		if (boxcnt == 1) {
			return true;
		}

		return false;
	}
}
