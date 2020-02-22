package pratice;

public class WhileQuiz02 {
	public static void main(String[] args) {
		//1~1000까지 홀수의 합
		int a = 1;
		int sum = 0;
		while(a<=1000) {
			if(a%2 == 1) {
				sum +=a;
			}
			a++;
			
//			a+=2;
//			sum += a;
		}
		System.out.println("1~1000까지 홀수 합 : " + sum);
	}
}
