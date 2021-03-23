package Baekjoon;

import java.util.Scanner;

public class Main1541 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String formula = sc.nextLine();
		sc.close();
		//+�� -��ȣ ���� ���ļ� ī����
		int cnt = 0;
		char a = '+';
		char b = '-';
		for (int i = 0; i < formula.length(); i++) {
			if (formula.charAt(i) == a || formula.charAt(i) == b) {
				cnt++;
			}
		}
		//+�� -��ȣ�� �������� ���� �迭�� ����
		String[] arr = new String[cnt + 1];
		arr = formula.split("-|\\+");
		//-��ȣ�� �����ҋ����� �����ִٰ� -��ȣ�� ������ ���� ���ڴ� ��� ���ش�.
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
