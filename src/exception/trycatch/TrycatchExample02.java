package exception.trycatch;

public class TrycatchExample02 {

	public static void main(String[] args) {
		
		String[] arr = {"hello", "안녕", "니하오", "곤니찌와"};
		
		int i = 0;
		while(i < 5) {
			try {
				
				System.out.println(arr[i]);
				
			} catch (Exception e) {
				System.out.println("배열 범위를 벗어났습니다.");
			} finally {
				System.out.println("이 문장은 예외 여부와 상관없이 무조건 실행");
			}
			i++;
			
		}
		System.out.println("프로그램 실행 종료");
	}
}
