package pratice;

public class OperatorExample03 {
	public static void main(String[] args) {
		
		int x = 10, y = 20;
		
		//if 소괄호에 true라면, if중괄호 실행, false라면 else중괄호
		//&& : 절대 true 나올 수 없는 상황이라면 뒤에 구문 실행 x
		//|| : 절대 false 나올 수 없는 상황이라면 뒤에 구문 실행 x
		if(x != 10 & ++y == 21) {
			System.out.println("참");
		} else {
			System.out.println("거짓");
		}
		System.out.println("x : " + x +" " +"y : " + y);
		
		if(x == 10 | ++y == 21 ) {
			System.out.println("참");
		} else {
			System.out.println("거짓");
		}
		System.out.println("x : " + x + ", y:" + y);
	
		if(x != 10 && ++y == 21) { // 앞이 false면 뒤는 실행 x
			System.out.println("참");
		} else {
			System.out.println("거짓");
		}
		System.out.println("x : " + x +" " +"y : " + y);
		
		if(x == 10 || ++y == 21 ) {
			System.out.println("참");
		} else {
			System.out.println("거짓");
		}
		System.out.println("x : " + x + ", y:" + y);
	}
}
