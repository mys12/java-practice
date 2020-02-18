package pratice;

public class CastingExample01 {
	public static void main(String[] args) {
		
		/*
		 * 크기가 작은 데이터 타입을 큰 타입에 저장할 때는 JVM(자바 가상머신)이 
		 * 자동으로 형 변환해서 저장 
		 *
		 */
		byte b = 10;
		int i = b; //byte -< int형 자동형변환
		
		System.out.println(i);
		
		byte b1 = 20;
		short s1 = b1;
		
		char c = '가';
		int j = c; //char -> int형 자동형변환
		System.out.println("가의 유니코드:" + j);
		
		int k = 500;
		double d = k; //int -> double형 자동형변환
		
		System.out.println(d);
		
	}
}
