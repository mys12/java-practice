package pratice;

import java.util.Scanner;

public class MultiForExample04 {
	public static void main(String[] args) {

		//정수를 입력받아서 해당숫자까지 모든 소수들의 합

		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 > ");

		int num = sc.nextInt();
		int sum = 0;
		for(int i = 1; i <= num; i++) {
			int count = 0;
			for(int j = 1; j <=i; j++) {
				if(i%j == 0) {
					count++;
				}
			}
			if(count == 1 || count == 2) {
				System.out.println("소수 : " + i);
				sum += i;
			}
		}

		System.out.println("소수들의 합 : " + (1+sum) );

		sc.close();
	}
}
