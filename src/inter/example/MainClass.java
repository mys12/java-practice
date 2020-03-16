package inter.example;

public class MainClass {

	public static void main(String[] args) {
		//인터페이스는 객체를 생성할 수 없음(추상 클래스와 동일)
		//Inter1 i1 = new Inter1();
		
		Basic b = new Basic();
		b.method1();
		b.method2();
		b.method3();
		System.out.println(Inter1.PI); // 상수의 사용
		System.out.println(Inter2.ABC);
		
		System.out.println("---------------------");
		/*
		 * 인터페이스도 하나의 데이터 타입으로 취급할 수 있음
		 * 인터페이스 타입에 저장하면 해당 인터페이스 선언된 메서드만 사용할 수 있음
		 * 이 문제를 해결하기 위해 (캐스팅)을 사용할 수 있음.
		 */
		 
		 Inter1 i1 = b;
		 i1.method1(); // 오버라이딩 된 메서드 실행
		 
		 Inter2 i2 = new Basic();
		 i2.method2(); // 오버라이딩 된 메서드 실행
		 
		 System.out.println("----------------------");
		 Basic bb = (Basic)i1;
		 bb.method1();
		 bb.method2();
		 bb.method3();
		 
		 
	}
}
