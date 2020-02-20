package pratice;

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
	
	}
	
	
}
