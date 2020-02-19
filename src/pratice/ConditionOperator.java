package pratice;

public class ConditionOperator {
	public static void main(String[] args) {
		
		//랜덤값을 발생시키는 기능 Math.random() - 0.0이상 1.0 미만
//		System.out.println(Math.random());
	/*
		double d =Math.random() * 10;
		int r = (int)d + 1;
		System.out.println("랜덤값 : " + r); // 1~10 정수 랜덤값
		*/
//		int r = (int)(Math.random() * 10) +1;
//		
//		String result = r>5 ? "5보다 큼" : "5보다 작음";
//		System.out.println("r의 값 : " + r);
//		System.out.println(result);
		
		System.out.println("-------------------------");

		// QUIZ01
		int r = (int)(Math.random() * 100) + 1;
		System.out.println("r의 값 : " + r);
		
		String result = (r%2) == 0 ? "짝수" : "홀수";
		System.out.println("결과 : " + result);
		
		// QUIZ02
		int r1 = 5 - (int)(Math.random() * 11);
		System.out.println("r1의 값: " + r1);
		
		int result1 = r1 < 0 ? -r1 : r1;
		System.out.println("결과 : " + result1);
		
		//
		String result2 = r1 ==0 ? "0":(r1>0)? "양수" : "음수";
		System.out.println("결과 : " + result2 );
		
		System.out.println("-----------------------------------------------");
		
		
	}
}
