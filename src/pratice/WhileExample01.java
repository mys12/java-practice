package pratice;

public class WhileExample01 {
	public static void main(String[] args) {
		
		int a = 1; //제어변수 : 반복문의 횟수를 제어할 변수
		int sum = 0; //합계 변수: 값을 누적시킬 변수(while문 밖에 선언)
		
		while(a<=10) {
			sum += a;
//			System.out.println("a의 값: "+ a +", 총합 : " + sum);
			a++; //증감식
		}
		System.out.println("1~10까지 합: " + sum);
	}
}
