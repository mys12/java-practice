package final_.cls;

public class Child extends Parent{

	public void method1() {
		
	}
	public void method2() {
		
	}
	// final이 메서드에 붙는다면 오버라이딩의 금지
//	public void method3() {
		
//	}
	
	public Child() {
		super.method1();
		super.method2();
		super.method3();
	}
}
