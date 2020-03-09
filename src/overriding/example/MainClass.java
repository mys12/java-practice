package overriding.example;

public class MainClass {

	public static void main(String[] args) {
		/*
		 * 메서드의 재정의 (overriding)
		 * 부모님에서 물려받은 메서드를, 자식 클래스에서 같은 이름으로 생성해서
		 * 내용물을 바꿔서 사용하는 것
		 */
		Child c = new Child();
		c.method1(); //물려받은 메서드
		c.method2(); // 오버라이딩된 메서드 실행
		c.method3(); // 자식의 고유한 메서드
	}
}
