package pratice;

public class MethodExample02 {
	public static void main(String[] args) {
		/*
		 * 매개변수(parameter)
		 * 1. 매개변수는 매서드 호출에 필요한 값을 전달하는 매개체
		 * 2. 매개변수를 여러개 받아주고 싶다면 ','로 연결
		 * 3. 매개변수는 하나도 받지 않을 수 있음. 이때는 () 비워둠
		 */
		System.out.println("1~10까지의 합: " + calSum(10));
	
		System.out.println("1~20까지의 합: " + calSum(20));
		int result1 = calSum(30);
		System.out.println("1~30까지의 합: " + result1);
		int result2 = calSum2(10 , 20);
		System.out.println("10~20까지의 합: " + result2);
	}
	
	static int calSum(int end) {
		int sum = 0;
		for(int i =1; i<=end; i++) {
			sum += i;
		}
		return sum;
	}
	static int calSum2(int start, int end) {
		int sum = 0;
		for(int i = start; i<= end; i++) {
			sum += i;
			
		}
		return sum;
	}
}
