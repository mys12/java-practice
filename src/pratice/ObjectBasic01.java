package pratice;

public class ObjectBasic01 {
	public static void main(String[] args) {
		System.out.println("---1번 계산기 사용---");
		System.out.println(add(10));
		System.out.println(add(20));
		System.out.println(add(30));
		
		System.out.println("---2번 계산기 ---");
		System.out.println(add1(1));
		System.out.println(add1(2));
		System.out.println(add1(3));
	}
	
	//1번 계산기
	static int result = 0;
	static int add(int n) {
		result += n;
		return result;
	}
	
	//2번 계산기
	static int result1 = 0;
	static int add1(int n) {
		result1 += n;
		return result1;
	}

}
