package throw_.exception;

public class ThrowExample {

	public static void main(String[] args) {
	
		/*
		 * throw 키워드를 만나면 즉시 예외가 생성됨
		 * 
		 * 예외가 발생된 이후에 실행되던 코드는 중단되며, 예외처리가 가능한 catch구문 찾음
		 * 
		 * 메서드 안에서는 throws구문으로 예외 던지기 처리를 하고, 호출부에서 catch 구문으로 예외를 처리하는 방식으로 사용
		 * 
		 */
		try {
			int result = calSum(-100);
			System.out.println("결과: " + result);
			
		} catch (Exception e) {
			//printStackTrace는 예외 발생경로를 추적하는 로그를 출력
			//개발과정에서 자주 사용
			e.printStackTrace();
			System.out.println("매개값을 반드시 양수로 전달하세요");
		}
		System.out.println("프로그램 정상종료");
	}
	
	
	// 이 메서드는 잘못된 값이 전달될 때 중단해야할 필요가 있는 메서드
	public static int calSum(int n) throws Exception {
		if(n<0) {
			throw new Exception(); //강제 예외 생성
		}
		
		int sum = 0;
		for(int i = 1; i <= n; i++) {
			sum += i;
			
		}
		return sum;
	}
}
