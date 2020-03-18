package exception.trycatch;

import java.util.Scanner;

public class TryQuiz02 {

	public static void main(String[] args) {


		/* 1-100사이의 난수를 입력받습니다.
		 * 사용자로부터 1-100사이값을 입력받아, 
		 * 입력받은 값이 랜덤수 보다 작으면 "더 큰 수 입니다" 출력  
		 * 입력받은 값이 랜덤수 보다 크면 "더 작은 수 입니다" 를 출력
		 * 일치하면 "정답입니다" 를 출력하고 시도횟수를 출력합니다.
		 * 
		 * 숫자가 아닌 값을 입력받으면 "잘못 입력했습니다. 숫자를 입력하세요" 를 출력하고 다시 입력받는
		 * 프로그램을 만드세요
		 */
		int count = 0;
		int ran = (int)((Math.random()*100)+1);

		while(true) {
			Scanner sc = new Scanner(System.in);

			try {
				System.out.print("1~100 사이의 값 입력 > ");
				int num = sc.nextInt();

				count++; //시도횟수 증가
				if(num < ran) {
					System.out.println("더 큰 수 입니다.");
				} else if (num > ran) {
					System.out.println("더 작은 수 입니다.");
				} else {
					System.out.println("정답입니다.");
					System.out.println(count);
					break;
				}

			} catch (Exception e) {
				System.out.println("잘못 입력하였습니다. 숫자를 입력하세요.");
//				sc.nextLine();
			}

		}

	}
}