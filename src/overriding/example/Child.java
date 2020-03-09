package overriding.example;

public class Child extends Parent {

	void method2() {
		System.out.println("재정의된 자식의 2번 메서드 실행");
	}
	
	void method3() {
		System.out.println("자식의 3번 메서드 실행");
	}
}
