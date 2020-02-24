package pratice;

import java.util.Scanner;

public class ForExample02 {
	public static void main(String[] args) {
		//정수를 받아서, 해당 정수가 소수인지 판별
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 > ");
		int num = sc.nextInt();
		int count = 0; // 수를 세는 변수
		
		for (int i = 1; i <= num; i++) {
			if(num % i == 0) { //i는 약수
				count++; //약수의 개수
			}
		}
		if(count == 2) {
			System.out.println("소수");
		} else {
			System.out.println("소수 아님");
		}
		sc.close();
	}
}
