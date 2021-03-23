package Baekjoon;

import java.util.Scanner;

public class Main1541 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String formula = sc.nextLine();
		sc.close();
		//+와 -부호 개수 합쳐서 카운팅
		int cnt = 0;
		char a = '+';
		char b = '-';
		for (int i = 0; i < formula.length(); i++) {
			if (formula.charAt(i) == a || formula.charAt(i) == b) {
				cnt++;
			}
		}
		//+나 -부호를 기준으로 나눠 배열에 대입
		String[] arr = new String[cnt + 1];
		arr = formula.split("-|\\+");
		//-부호가 등장할떄까지 더해주다가 -부호가 나오면 이후 숫자는 모두 뺴준다.
		int result = Integer.parseInt(arr[0]);
		int j = 0;
		for (int i = 0; i < formula.length(); i++) {
			if (formula.charAt(i) == a) {
				result += Integer.parseInt(arr[++j]);
			} else if (formula.charAt(i) == b) {
				for (int k = j + 1; k <= cnt; k++) {
					result -= Integer.parseInt(arr[k]);
				}
				break;
			}
		}
		System.out.println(result);
	}

}
