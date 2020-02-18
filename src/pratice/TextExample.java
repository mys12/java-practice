package pratice;

public class TextExample {
	public static void main(String[] args) {
		//단일문자 char - 2byte
		char c1 = 'A';
		char c2 = 65;
		
		System.out.println(c1);
		System.out.println(c2);
		
		// 다양한 문자를 표현하기 위해 부호체계 통합 -> 유니코드 2의 16승 - 65536개
		char c3 = '가';
		char c4 = 44032;
		char c5 = '\uAC00';
		
		System.out.println(c3 + " " + c4 + " " + c5);
		
		
		String s1 = "hello "; // 공백도 문자열
		String s2 = "world~~";
		
		System.out.println(s1 + s2);
		
		System.out.println("---------------------");
		// 문자열을 +연산으로 출력할 때, 문자열의 형식이 됨
		System.out.println(1 + 2);
		System.out.println("100" + 200);
		System.out.println(10 + 20 + "30");
		System.out.println("10" + 20 + 30);
		
		// 서로 다른 기본형타입에서  + 연산
		System.out.println('A'+ 10);
	}
}
