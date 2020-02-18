package pratice;

public class CastingExample03 {
	public static void main(String[] args) {
		char c = 'B';
		int i = 2;
		
		// 1. 서로 다른 타입의 연산에서 결과는 큰 타입  따라감
		int ii = c + i;
		char cc = (char)(c + i);
		
		System.out.println(ii);
		System.out.println(cc);
		
		int j = 10;
		double d = j + 3.14;
		
		byte b1 = 10;
		int i1 = 10;
		int result = i1 + b1;
		
		// 2. int형보다 작은 타입의 연산의 결과는 int형으로 변환됨
		byte b3 = 10;
		byte b4 = 20;
		
		byte reusult = (byte)(b3 + b4);
		System.out.println(result);
		
	}
}
