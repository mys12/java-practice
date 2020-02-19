package pratice;

public class OperaterExample02 {
	public static void main(String[] args) {
		
		//2항 연산자
		int k = 7 * 3;
		int i = 7 / 3;
		int j = 7 % 3;
		
		System.out.println("7에서 3을 나눈 몫 : " + i);
		System.out.println("7에서 3을 나눈 나머지 : " + j);
		
		//비교연산
		System.out.println(i == j); //f
		System.out.println(i != j); //t
		System.out.println(i >= j); //t
		System.out.println(i < j); //f
		System.out.println(k != 21); //f
		System.out.println(k % 2 == 0); //f
		
		// 비트 연산자
		byte a = 5; //0000 0101
		byte b = 3; //0000 0011
		
		System.out.println(a & b); // 두 비트가 같으면 1, 아니면 0
		System.out.println(a | b); // 두 비트가 하나만 1이면 1, 아니면 0
		System.out.println(a ^ b); // 다르면 1, 같으면 0
		
		//비트 쉬프트 >> <<
		int i2 = 192; // 1100 0000
		System.out.println(i2 << 3); // 0110 0000 0000
		System.out.println(i2 >> 2); // 0011 0000
		
		
		
		
	}
}
