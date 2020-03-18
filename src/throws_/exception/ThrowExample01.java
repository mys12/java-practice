package throws_.exception;

public class ThrowExample01 {

	public static void main(String[] args) {
	
		/*
		 * 메서드 내부에서 발생되는 에러를 떠넘기는 키워드가 throws구문
		 * throws이 붙어있는 메서드, 생성자를 호출할 때는 예외처리를 대신 진행해야 함
		 * 메서드 사용시 예외처리를 강요할 때 사용
		 * 
		 */
		
		
		try{
			print(5);
			
		} catch (Exception e) {
			System.out.println("배열의 참조범위를 벗어났습니다.");
		}
		
		// throws메서드의 예시
		try {
			Class.forName("#@#$$");
			
		} catch (Exception e) {
			System.out.println("클래스를 찾을 수 없습니다.");
		}
	}
	
	
	public static String[] arr = {"홍길동" ,"이순신", "홍길자"};
	public static void print(int index) throws Exception {
		System.out.println(arr[index]);
		
	}
}

