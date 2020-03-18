package throws_.exception;

public class ThrowsExample02 {

	public ThrowsExample02() throws Exception {
		System.out.println("생성자 호출");
		this.A(10);
		
	}
	public void A(int i) throws Exception {
		System.out.println("A메서드 실행");
		System.out.println(i/0); //에러 발생
		System.out.println("A메서드 종료");
	}
}
