package pratice;

public class MethodExample01 {
	public static void main(String[] args) {
		/*
		 * 1. 메소드는 선언하는 과정, 호출하는 과정이 있다.
		 * 2. 메서드 선언은 메서드 내부에 할 수 x
		 * 3. 메서드를 호출하는 과정은 메서드 실행결과를 호출부로 다시 전달
		 */
		System.out.println("1~100까지 합 : " + calSum());
		System.out.println("합 : " + randomNumber());
		double result1 = randomNumber();
		System.out.println(result1);
		String result2 = randomColor();
		System.out.println(result2);
	} // end main
	
	static int calSum() {
		int sum = 0;
		for(int i = 1; i<=100; i++) {
			sum +=i;
		}
		
		return sum;
	}
	
	static double randomNumber() {
		double num1 = Math.random();
		double num2 = Math.random();
		
		
		return num1+num2;
	}
	
	static String randomColor() {
		double d = Math.random();
		if(d> 0.66) {
			return "빨강색";
		} else if(d > 0.33) {
			return "파란색";
		} else {
			return "하얀색";
			
		}
	}
	
	
}
