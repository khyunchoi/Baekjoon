package Baekjoon;

import java.util.ArrayList;
import java.util.Scanner;

public class Main1316 {
	public static boolean isGroupWord(String word) {
		String[] wordArr = word.split("");
		ArrayList<String> list = new ArrayList<>();
		int i = 0;
		while (i < wordArr.length) {
			// 중복을 판별하는 if문
			if (!list.contains(wordArr[i])) {
				list.add(wordArr[i]);
			} else {
				return false;
			}
			// ArrayIndexOutOfBoundsException을 없애기 위한 if문
			if (i == wordArr.length - 1) {
				break;
			}
			// 다음 문자가 다를 때까지 배열 index를 넘어가는 while문
			while (wordArr[i].equals(wordArr[i + 1])) {
				i++;
				// ArrayIndexOutOfBoundsException을 없애기 위한 if문
				if (i == wordArr.length - 1) {
					break;
				}
			}
			i++;
		}
		return true;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int cnt = 0;
		for (int i = 0; i < N; i++) {
			String word = scan.next();
			if(isGroupWord(word)) {
				cnt++;
			}
		}
		System.out.println(cnt);
		scan.close();
	}
}
