package Baekjoon;

import java.util.Scanner;

public class Main1193 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int i = 0;
		boolean isOdd = true;
		//N이 몇번째 그룹에 있는지 구하기
		while (N > 0) {
			i++;
			N -= i;
		}
		//i번째 그룹의 홀짝 판단
		if (i%2 == 0) {
			isOdd = false;
		}
		//출력
		int cnt = N + i;
		if(isOdd) {
			System.out.println((i-cnt+1) + "/" + cnt);
		} else {
			System.out.println(cnt + "/" + (i-cnt+1));
		}
		scan.close();
	}

}
