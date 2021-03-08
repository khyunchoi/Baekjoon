package Baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main2580_2 {
	public static int[][] arr = new int[9][9];
	public static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// 스도쿠 2차원 행렬에 입력
		for (int i = 0; i < 9; i++) {
			String tmp = br.readLine();
			StringTokenizer st = new StringTokenizer(tmp);
			for (int j = 0; j < 9; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}

		sudoku(0, 0);
	}

	public static void sudoku(int row, int col) throws IOException {
		// 한 열이 끝나면 다음 행 실행
		if (col == 9) {
			sudoku(row + 1, 0);
			return;
		}

		// 행, 열이 모두 끝나면 출력
		if (row == 9) {
			for (int i = 0; i < 9; i++) {
				for (int j = 0; j < 9; j++) {
					bw.write(arr[i][j] + " ");
				}
				bw.newLine();
			}
			bw.flush();
			bw.close();
			System.exit(0);
		}
		// 현재 위치가 0이면 중복 검사를 통해 값 대입
		if (arr[row][col] == 0) {
			for (int i = 1; i <= 9; i++) {
				if (possibility(row, col, i)) {
					arr[row][col] = i;
					sudoku(row, col + 1);
				}
			}
			// 만약 풀다가 막혔을경우 다시 0으로 되돌리며 빠져나옴
			arr[row][col] = 0;
			return;
		}
		// 현재 위치가 0이 아니면 다음행 실행
		sudoku(row, col + 1);
	}

	public static boolean possibility(int row, int col, int value) {
		// 행에 겹치는 수가 있는지 검사
		for (int i = 0; i < 9; i++) {
			if (arr[row][i] == value) {
				return false;
			}
		}
		// 열에 겹친는 수가 있는지 검사
		for (int i = 0; i < 9; i++) {
			if (arr[i][col] == value) {
				return false;
			}
		}
		// 33박스에 겹치는 수가 있는지 검사
		for (int i = row / 3 * 3; i < (row / 3 * 3) + 3; i++) {
			for (int j = col / 3 * 3; j < (col / 3 * 3) + 3; j++) {
				if (arr[i][j] == value) {
					return false;
				}

			}
		}

		return true;
	}
}
