package modi.protec.pac1;

public class B {

	public B() {
		
		//같은 패키지안에서는 protected 사용 가능
		A a = new A();
		a.var = "1";
		a.method();
	}
}
