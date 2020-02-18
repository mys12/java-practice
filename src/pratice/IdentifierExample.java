package pratice;

public class IdentifierExample {
	public static void main(String[] args) {
		
		// 이름들은 대/소문자를 구분함
		int age = 27; // 정수형 변수 age에 27을 저장 
		int Age = 28;
		int aGe = 29;
		
		System.out.println(age);
		System.out.println(Age);
		System.out.println(aGe);
		
		// 식별자 이름을 숫자로 시작할 수 없음
//		int 4num = 10; // ctrl+/ 빠른 주석 처리
		int num4 = 20;
		
//		int phone number = 30;
		int phoneNumber = 30;
		
		//키워드로 이름을 지울수 없음
//		int static = 20;
		System.out.println(num4);
		System.out.println(phoneNumber);
	}

}
