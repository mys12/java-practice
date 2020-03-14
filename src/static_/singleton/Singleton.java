package static_.singleton;

public class Singleton {

	//싱글통패턴 - 객체가 1개만 생성되도록 클래스 구성
	
	// 1. 외부에서 객체를 생성할 수 없도록 생성자에 private 선언
	private Singleton() {
	
		
	}
	
	// 2. 자신의 클래스 내부에서 스스로 객체를 1개 생성
	private static Singleton instance = new Singleton();
	
	// 3. 외부에서 객체를 요구할 경우 2번에서 만든 1개의 객체를
	//    getter 메서드를 통해 제공
	public static Singleton getInstance() {
		return instance;
		
	}
}
