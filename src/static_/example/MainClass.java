package static_.example;

public class MainClass {

	public static void main(String[] args) {
		/*
		 * 1. 빨간색, 파란색, 계산기를 2개 생성
		 * 2. 각각 계산기 색상을 출력확인
		 * 3. circle을 사용해서 pi를 통해 원의 넓이 출력
		 */
		
		Calculator red = new Calculator();
		Calculator blue = new Calculator();
		
		red.paint("빨강색");
		blue.paint("파란색");
		
		System.out.println("계산기 색상 : " + red.getColor());
		System.out.println("계산기 색상 : " + blue.getColor());
		
		System.out.println("원의 넓이 :" + Calculator.circle(4));
		
//		ArrayPrint ap = new ArrayPrint();
		ArrayPrint.printArray(new int[3]);
		
		// Math math = new Math();
		Math.random();
		
		
	}
}
