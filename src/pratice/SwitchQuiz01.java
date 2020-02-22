package pratice;

import java.util.Scanner;

public class SwitchQuiz01 {
	public static void main(String[] args) {
		System.out.println("구입할 메뉴는?");
		System.out.println("[수박, 사과, 멜론, 포도, 귤]");
		System.out.print(">");
		
		Scanner scan = new Scanner(System.in);
		String fruit = scan.next();
		
		switch (fruit) {
		case "수박":
			System.out.println(fruit+"의 가격은 2만원입니다.");
			break;

		case "사과":
			System.out.println(fruit+"의 가격은 2만원입니다.");
			break;
			
		case "멜론":
			System.out.println(fruit+"의 가격은 1만원입니다.");
			break;
			
		case "포도":
			System.out.println(fruit+"의 가격은 3만원입니다.");
			break;
			
		case "귤":
			System.out.println(fruit+"의 가격은 3만원입니다.");
			break;
			
		default:
			System.out.println(fruit +"은(는) 메뉴에 없습니다.");
			System.out.println("다시 입력해주세요.");
			break;
		}
		scan.close();
	}
}
