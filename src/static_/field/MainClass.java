package static_.field;

public class MainClass {

	public static void main(String[] args) {
		Count c1 = new Count();
		c1.a++;
		c1.b++;
		
		System.out.println("일반변수 : " + c1.a);
		System.out.println("정적변수 : " + c1.b);
	
		Count c2 = new Count();
		c2.a++;
		c2.b++;
		
		System.out.println("일반변수 : " + c2.a);
		System.out.println("정적변수 : " + c2.b);
	
		Count c3 = new Count();
		c3.a++;
		c3.b++;
		
		System.out.println("일반변수 : " + c3.a);
		System.out.println("정적변수 : " + c3.b);
		
		System.out.println("c1.b : " + c1.b);
		System.out.println("c2.b : " + c2.b);
	
		/*
		 * static 키워드는 1개 생성하며, 클래스와 상관없이
		 * 생성될 수 있음
		 * 
		 * static 변수는 클래스이름.변수명으로 사용가능
		 */
		
		Count.b++; 
		Count.b = 10;
		
		//현재 c1.b c2.b 몇 ? =>10
		System.out.println(c1.b);
		System.out.println(c2.b);
		System.out.println(Count.b);
	}
}
