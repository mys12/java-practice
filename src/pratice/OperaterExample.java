package pratice;

public class OperaterExample {

	public static void main(String[] args) {
		
		// 단항 연산자
		
		// 부호 연산자
		int i = -3;
		int i2 = -i;
		System.out.println(i2);
		
		// 증감 연산자 ++, --
		int k = 1;
		int j = k++; //후위 연산자 : 먼저 값을 대입하고, 그 다음에 증가
		
		System.out.println("k의 값 :" + k);
		System.out.println("j의 값 :" + j);
		
		int x = 1;
		int y = ++x; //전위 연산자 : 먼저 값을 증가하고, 그 다음에 대입
		
		System.out.println(x);
		System.out.println(y);
		
		x = 1;
		y = 1;
		
		System.out.println(x++);
		System.out.println(++x);
		
		x = 1;
		int result = (x++) + (x++) + 10 + (++y);
		System.out.println(result);
		
		System.out.println("x의 값 : " + x);
		System.out.println("y의 값 :" + y);
		
		y++; //일반적인 표현
		++y;
		
		System.out.println("---------------------");
		
		//비트 반전연산자 ~
		byte b = 8; //0000 1000
		System.out.println(~b); // 1111 0111 (+ 0000 1001)하면 0이 되므로 -9
		
		// 논리반전 연산자 !
		System.out.println(!true);
		System.out.println(!false);
		
		boolean bool = !true;
		System.out.println(bool);
	}
}
