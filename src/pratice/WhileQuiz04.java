package pratice;

import java.util.Scanner;

public class WhileQuiz04 {
	public static void main(String[] args) {
		
		/*
		 * while문안에서 값을 입력받아서, 입력받은 값을 계속 누적
		 * 0을 입력받을때까지 입력받은 값의 합계
		 */
		
//		int sum = 0;
//		while(true) {
//			
//			System.out.print("수 입력 > ");
//			Scanner sc = new Scanner(System.in);
//			int num = sc.nextInt();
//			if(num !=0) {
//			sum += num;
//			System.out.println("합 : " + sum);
//			} else {
//				System.out.println("종료!");
//				break;
//			}
//			sc.close();
//		}
			
			int sum = 0;
			Scanner sc = new Scanner(System.in);
			int i = 1;
			while(i != 0) {
				System.out.print("> ");
				i = sc.nextInt();
				
				if(i != 0) {
					sum += i;
					
				} else {
					System.out.println("합 : " + sum);
				}
				
			}

	}
}
