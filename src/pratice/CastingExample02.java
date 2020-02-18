package pratice;

public class CastingExample02 {
	public static void main(String[] args) {
		
		/*
		 * 크기가 큰 타입을 작은 타입으로 저장할 때는 
		 * casting을 사용해서 명시적으로 형변환을 해야함
		 */
		
		int i = 66;
		char c = (char)i;
		System.out.println("66의 유니코드 문자값: " + c);
		
		short s1 = 10;
		byte b1 = (byte)s1;
		
		double d = 3.14;
		int j = (int)d;
		
		System.out.println(b1);
		System.out.println(j);
		
		/*
		 * 강제 타입변환 할 때 주의할 점은 
		 * 받아들일 수 없는 값이 들어오면
		 * 쓰레기값을 저장
		 * overflow, underflow
		 */
		int k = 500;
		byte b = (byte)k;
		
		System.out.println(b);
	}
}
