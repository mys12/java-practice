package pratice;

public class ObjectBasic02 {

	public static void main(String[] args) {
		Calculator cal1 = new Calculator();
		Calculator cal2 = new Calculator();
		
		System.out.println("--- 1번 계산기 ---");
		
		System.out.println(cal1.add(10));
		System.out.println(cal1.add(20));
		System.out.println(cal1.add(30));
		
		System.out.println("--- 2번 계산기 ---");
		System.out.println(cal2.add(1));
		System.out.println(cal2.add(2));
		System.out.println(cal2.add(3));
	}
}
