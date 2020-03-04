package pratice;

public class MethodQuiz05 {

	public static void main(String[] args) {
		System.out.println("7~9의 사이 수의 합 : " + sumNum(7,9));
	
		System.out.println("9~7의 사이 수의 합 : " + sumNum(9,7));
		
		System.out.println("5~5의 사이 수의 합 : " + sumNum(5,5));
		
	}
	
	static int sumNum(int a, int b) {
		int tmp = 0;
		int sum = 0;
		if(a>b) {
			tmp = a;
			a = b;
			b = tmp;
		}
		for(int i = a; i<=b; i++ ) {
			sum += i;
		}
		return sum;
	}
}
