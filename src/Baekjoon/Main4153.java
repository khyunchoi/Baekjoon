package Baekjoon;

import java.util.Arrays;
import java.util.Scanner;

public class Main4153 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			if (a == 0) {
				break;
			}
			int[] arr = {a, b, c};
			Arrays.sort(arr);
			
			if(Math.pow(arr[0], 2) + Math.pow(arr[1], 2) == Math.pow(arr[2], 2)) {
				System.out.println("right");
			} else {
				System.out.println("wrong");
			}
		}
		sc.close();
	}

}
