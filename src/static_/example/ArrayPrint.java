package static_.example;

public class ArrayPrint {	
	
	//다음 클래스의 객체를 생성할 수 없도록 접근제한자를 선언하고
	//외부에서 메서드를 호출할 수 있도록 변경하고 호출하세요.

	private ArrayPrint() {
		
	}
	
	public static void printArray(String[] arr) {
		
		for(String s : arr ) {
			System.out.print(s + " ");
		}
		System.out.println();
	}
	
	public static void printArray(int[] arr) {
		
		for(int a : arr) {
			System.out.print(a + " ");
		}
		System.out.println();
		
	}
	
	public static void printArray(char[] arr) {
		for(char c : arr) {
			System.out.print(c + " ");
		}
		System.out.println();
	}
	
	
	
}
