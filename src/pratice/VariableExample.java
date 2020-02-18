package pratice;

public class VariableExample {
	public static void main(String[] args) {
		
		/*
		 * 변수의 선언
		 * 데이터타입 변수명;
		 * 
		 * int는 정수를 저장하는 대표적인 유형
		 * String은 문자열을 저장하는 대표적인 유형
		 * 
		 */
		
		int num1;
		
		// 변수의 초기화
		num1 = 10;
		
		System.out.println(num1);
		
		//변수의 선언 초기화를 동시에
		int num2 = 20;
		
		System.out.println(num2);
		
		// 변수는 다른 변수의 값을 저장 할 수 있음
		int result = num1 + num2;
		
		System.out.println(result);
		
		System.out.println("---------------------");
		
		//변수이름은 동일 이름으로 중복선언 할 수 없음
		String num3 = "값";
		
		System.out.println(num3);
		
		num1 = 100;
		num2 = 20;
		int result2 = num1 + num2;
		
		System.out.println(result2);
	}
}
