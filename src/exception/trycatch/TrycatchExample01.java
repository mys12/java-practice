package exception.trycatch;

public class TrycatchExample01 {

	public static void main(String[] args) {
		int i = 10;
		int j = 0;
		
		System.out.println(i + j);
		
		try {
		
			System.out.println(i / j);
			System.out.println("에러 발생시 이 코드가 실행??");
		//예외 발생시 처리할 내용을 catch 중괄호에 적는다.
		//catch 뒤에는 예외를 처리할 수 있는 클래스가 소괄호 안에 선언 (Exception은 모든 예외를 처리할 수 있음)
			
		} catch (Exception e) {
			
			System.out.println("0으로 나눌 수 없습니다.");
		
		}
		
		System.out.println(i - j);
		
		System.out.println(i * j);
	}
}
