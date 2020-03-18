package throws_.exception;

public class MainClass {

	public static void main(String[] args) {
		try {
			ThrowsExample02 ex = new ThrowsExample02();
			ex.A(20);
		} catch (Exception e) {
			System.out.println("에러발생");
		}
		
	}
}
