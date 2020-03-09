package overloading.example;

public class Basic {

	/*
	 * 오버로딩 규칙:
	 * 1. 메서드 이름이 같아야함
	 * 2. 반환유형은 오버로딩과 상관 없음
	 * 3. 매개변수의 숫자, 개수, 종류를 다르게 선언
	 * 
	 */
	
	void input(int a) {
		System.out.println("정수 1개 입력");
		
	}
	
//	int input(int a) {
//		return 0;
//	}
	
	void input(String a) {
		System.out.println("문자열 1개 입력");
	}
	
	void input(String a, double b) {
		System.out.println("문자열 1개, 실수 1개 입력");
	}
	
	void input(double b, String a) {
		System.out.println("실수 1개, 문자열 1개 입력");
	}
	
	void input(int a, char c, double d) {
		System.out.println("정수 문자 실수 1개씩 입력");
	}

}
