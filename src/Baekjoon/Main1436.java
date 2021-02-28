package Baekjoon;

import java.util.Scanner;

public class Main1436 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		sc.close();
		
		int num = 0, cnt = 0;
		//N번째 수 찾을떄까지
		while (N != cnt) {
			num++;
			int numDivide = num;
			//숫자가 666보다 크거나 같은동안
			while (numDivide >= 666) {
				int numSubtract = numDivide;
				numSubtract -= 666;
				//숫자에서 666을 뺐을때 1000으로 나눈 나머지가 0이면 카운트하고 반복종료
				if (numSubtract % 1000 == 0) {
					cnt++;
					break;
				}
				numDivide /= 10;
			}
		}
		System.out.println(num);
	}

}
