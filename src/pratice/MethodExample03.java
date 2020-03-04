package pratice;

public class MethodExample03 {
	public static void main(String[] args) {
		/*
		 * 반환유형
		 * 1. 반환유형은 메서드가 실행한 결과를 돌려주는 값에 대한 데이터 타입
		 * 2. 반환유형이 있는 메서드는 호출문이 하나의 값이 되기 때문에, 다른 메서드의 매개값으로 사용할 수 있음
		 * 3. 반환유형이 없으면 void
		 * 		void형 메서드는 단순 호출만 가능
		 * 4. 모든 메서드는 return을 만나면 종료된다
		 * 		따라서 return 아래에 코드를 작성할 수 없다
		 */
		
		int result1 = add(add(1,2),add(2,3));
		System.out.println(result1);
		multi(10,20);
		sayHello("똑똑이");
		
	
	}
	// int형 매개변수 2개를 받아서 값의 값을 반환하는 메서드
	static int add(int a, int b) {
		return a+b;
	}
	
	// 반환유형이 없는 메서드
	static void multi(int a, int b) {
		System.out.println(a + "x" + b +"=" +a*b);
	}
	
	static void sayHello(String s) {
		if(s.equals("똑똑이")) {
			
			System.out.println("참 잘했어요");
			return;
		}
		
		System.out.println(s + "가 아니고 똑똑이를 전달하세요" );
		
	}
}
