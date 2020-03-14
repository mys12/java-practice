package static_.method;

public class Count {

	public int a; //일반멤버변수
	public static int b; // 정적멤버변수
	
	//일반 메서드 - 일반 메서드 안에서는 일반변수, 정적 변수를 모두 사용할 수 있음
	public int method1( ) {
		a = 10;
		b++;
		return b;
	}
	
	//정적 메서드 - static 메서드 안에서는 static 변수만 사용 가능
	//단, 객체를 생성하면 일반변수도 사용가능
	public static int method2() {
		Count c = new Count();
		c.a = 10;
		
		//a = 10;
		b++;
		return b;
	}
}
