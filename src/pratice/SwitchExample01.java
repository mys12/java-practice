package pratice;

import java.util.Arrays;
import java.util.Scanner;

public class SwitchExample01 {

	public static void main(String[] args) {

		int a = 1;
		//switch구문의 소괄호에는 변수나, 변수의 연산식이 들어감
		//문자나 정수형이어야 함

		switch (a) {

		case 1:
			System.out.println("1");
			break;
			
		case 2:
			System.out.println("2");
			break;
			
		case 3:
			System.out.println("3");
			break;

		default:
			System.out.println("1~3이 아님");
			break;
		}
		char b = '나';
		
		switch (b) {
		case '가':
			System.out.println('가');
			break;
			
		case '나':
			System.out.println('나');
			break;
			
		default:
			System.out.println("가, 나 아님");
			break;
		}
		
		String[] menu = {"수박", "사과", "멜론", "포도", "귤"};
		System.out.println("구입할 메뉴는?");
		System.out.println(Arrays.toString(menu));
		Scanner sc = new Scanner(System.in);
		System.out.print(">");
		String fruit = sc.next();
		switch (fruit) {
		case "수박":
			System.out.println(fruit +"의 가격은 2만원입니다.");
			
			break;
		case "사과":
			System.out.println(fruit + "의 가격은 3만원입니다.");
			
			break;
		case "멜론":
			System.out.println(fruit + "의 가격은 4만원입니다.");
			
			break;
		case "포도":
			System.out.println(fruit + "의 가격은 2만원입니다.");
			
			break;
		case "귤":
			System.out.println(fruit + "의 가격은 5만원입니다.");
			
			break;
		default:
			System.out.println(fruit + "은(는) 메뉴에 없습니다.");
			System.out.println("다시 입력해주세요");
			
			break;
			
		}
		sc.close();
		
	
	}
	
	
}
