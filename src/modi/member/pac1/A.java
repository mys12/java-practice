package modi.member.pac1;

public class A {
	//멤버변수
	public int var1;
	int var2;
	private int var3;
	
	//메서드
	public void method1() {
		
	}
	void method2() {
		
	}
	private void method3() {
		
	}
	//생성자
	public A() { //제한자와 상관없이 같은 클래스에서는 전부 사용 가능
		var1 = 1;
		var2 = 1;
		var3 = 1;
		
		method1();
		method2();
		method3();
	}
}
