package inter.example;

/*
 * 1. 인터페이스를 상속(구현) 하려면 implements 키워드 사용
 * 2. 인터페이스는 여러 인터페이스를 상속(구현) 받을 수 있음
 * 3. 인터페이스 안에 추상메서드를 모두 재정의 해야함
 */
public class Basic implements Inter1, Inter2 {

	@Override
	public void method1() {
		System.out.println("자식의 오버라이딩된 메서드 1번 실행");
		
	}

	@Override
	public void method2() {
		System.out.println("자식의 오버라이딩된 메서드 2번 실행");
		
	}
	
	public void method3() {
		System.out.println("Basic클래스의  메서드 3번 실행");
	}
	

	
	
}
