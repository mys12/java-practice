package pratice;

import java.util.Scanner;

public class BreakQuiz01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("금액을 투입해 주세요: ");
		int money = scan.nextInt();
		
		machine : while(true) {
			System.out.println("남은 금액 : " + money);
			System.out.println("[1]데미소다: 400원, [2]밀키스: 500원, [3]코카콜라 : 600원 [4]잔돈받기");
			System.out.print("음료수 선택 > ");
			int choice = scan.nextInt();
			
			switch (choice) {
			case 1:
				if(money < 400) {
					System.out.println("금액 부족! 돈을 넣어주세요");
					break;
				} else {
					money -= 400; 
				}
				break;
			case 2:
				if(money < 500) {
					System.out.println("금액 부족! 돈을 넣어주세요");
					break;
				} else {
					money -= 500;
				}
				break;
			case 3:
				if(money < 600) {
					System.out.println("금액 부족! 돈을 넣어주세요");
					break;
				} else {
					money -= 600;
				}
				break;
			case 4:
				System.out.println("남은 금액 " +  money + "을 반환");
				break machine;

			default:
				System.out.println("오류!");
				break;
			}
		}
		scan.close();
	}
}
