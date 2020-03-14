package static_.method;

public class MainClass {

	public static void main(String[] args) {
		Count c = new Count();
		c.a = 20;
		c.method1();
		
		
		Count.b =10;
		System.out.println(Count.method2());
		System.out.println(Count.method2());
		
		System.out.println(Count.b);
		
		System.out.println(Math.random()); //랜덤값
		System.out.println(Math.abs(-5)); //절대값
		
		char[] arr = {'a', 'b'};
		
		System.out.println(String.copyValueOf(arr));
	}
}
