package pratice;

public class PracticeVariable {
	public static void main(String[] args) {
		//정수형
		int num1, num2, num3;
		num1 = 10;
		num2 = 20;
		num3 = 0;
		
		if(num1 > 1) {
			num3 = num1+num2;
			
		}
		System.out.println(num3);
		// 실수형
		float f1 = 3.14F;
		double d1 = 3.14;
		
		System.out.println(f1);
		System.out.println(d1);
		
		float f2 = 1.234567891234F;
		double d2 = 1.234567891234;
		
		System.out.println(f2);
		System.out.println(d2);
		
		//문자열
//		System.out.println(1 + 2);
//		System.out.println("100" + 200);
//		System.out.println(10 + 20 +"30");
//		System.out.println("10" + 20 + 30);
//		
//		System.out.println('A'+10);
//		
		// 형변환
//		byte b = 10;
//		int i = b;
//		System.out.println(i);
//		
//		byte b1 = 20;
//		short s1 = b1;
//		System.out.println(s1);
//		
//		char c = '가';
//		int j = c;
//		System.out.println("가의 유니코드 : " + j);
//		
//		int k = 500;
//		double d = k;
//		System.out.println(k);
		
		char c = 'B';
		int i = 2;
		
		int ii = c + i;
		char cc = (char)(c+i);
		System.out.println(ii);
		System.out.println(cc);
		
		int j = 10;
		double d = j + 3.14;
		System.out.println(d);
		
		byte b3 = 10;
		int i3 = 10;
		int result = i3 + b3;
		System.out.println(result);
				
	}
}
