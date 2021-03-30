package Baekjoon;

import java.util.Scanner;

public class Main9012 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		for (int i = 0; i < T; i++) {
			String tmp = sc.next();
			String[] arr = new String[tmp.length()];
			arr = tmp.split("");

			int vps = 0;
			for (int j = 0; j < arr.length; j++) {
				if (arr[j].equals("(")) {
					vps++;
				} else {
					vps--;
				}
				
				if (vps < 0) {
					System.out.println("NO");
					break;
				}
			}
			
			if (vps == 0) {
				System.out.println("YES");
			} else if (vps > 0) {
				System.out.println("NO");
			}
			
		}

	}

}
