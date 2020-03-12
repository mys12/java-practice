package poly.casting;

public class MainClass {

	public static void main(String[] args) {
		
		Parent p = new Child();
		Object o = new Child();
		
		System.out.println("------클래스 캐스팅-------");
		
		Child c1 = (Child)p;
		Child c2 = (Child)o;
		
		c1.method1();
		c1.method2();
		c1.method3();
		
		/*
		 * 클래스 캐스팅 시에 본래 자식으로 생성했던 객체만
		 * 클래스 캐스팅을 통해 다시 형변환 할 수 있음
		 * 
		 * 
		 */
//		Child cc = (Child)new Parent();// 에러
	}
}
