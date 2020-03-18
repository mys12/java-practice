package exception.trycatch;

import java.util.Scanner;

public class TrycatchQuiz03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
		
			try {
				System.out.print("첫 번째 정수 입력 > ");
				int num1 = sc.nextInt();
				System.out.print("두 번째 정수 입력 > ");
				int num2 = sc.nextInt();
				
				System.out.println("입력된 숫자의 합 : " + (num1 + num2));
				break;
			} catch (Exception e) {
				System.out.println("정수로만 입력하세요!");
				sc.nextLine();
			} 
		}
	}
}
