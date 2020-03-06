package string_equals;

public class StringExample {
	public static void main(String[] args) {
		
		String str1 ="홍길자";
		String str2 = "홍길자";
		String str3 = new String("홍길자");
		
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		
		/*
		 * 같은 클래스 내부에서 동일한 문자열을 대입하면, 같은 주소를 공유하게됨
		 * 직접 생성명령을 쓰거나, 다른 크랠스에서 넘어온 String은 다른 주소를 가지게 됨
		 */
		System.out.println(str1 == str2); //true
		System.out.println(str1 == str3); //false
		
		/*
		 * 문자열 동등 비교시에는 String 클래스가 제공하는
		 * equals(문자값) 메서드를 통해 문자열 비교
		 * 
		 */
		if(str1.equals(str2)) {
			System.out.println("문자열이 같다");
		} else {
			System.out.println("문자열이 다르다");
		}
		
		if(str1.equals(str3)) {
			System.out.println("문자열이 같다");
		} else {
			System.out.println("문자열이 다르다");
		}
		
	}
}
