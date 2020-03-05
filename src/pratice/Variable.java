package pratice;

public class Variable {
	//멤버변수(필드) 선언
	int a; //초기화 하지 않으면 기본값으로 자동 초기화
	
	//메서드 선언
	void printNumber(int c) {
		int b = 1;
		
		System.out.println("멤버변수: " + a);
		System.out.println("지역변수: " + b);
		System.out.println("매개변수: " + c);
	}
	
	
	
}
