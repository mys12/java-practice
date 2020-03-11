package poly.example02;

public class MainClass {

	public static void main(String[] args) {
		Parent p = new Parent();
		p.method1();
		p.method2();
		
		Child c = new Child();
		c.method1(); //상속받은 메서드
		c.method2(); // 오버라이딩 된 메서드
		c.method3(); //자식에 있는 메서드
		
		System.out.println("---------------------");
		/*
		 * 다형성이란
		 * 부모타입에 주소에 자식의 주소를 언제든지 저장할 수 있다
		 */
		Parent p1 = c; //Child -> Parent 자동형변환
		p1.method1();
		p1.method2();//오버라이딩된 메서드
//		p1.method3(); // 사용 x
		
		System.out.println(p1); //같은 주소값을 가지고 있음
		System.out.println(c);
	}
}
