package pratice;

public class MethodQuiz04 {

	public static void main(String[] args) {
		System.out.println(primeNum(5));
	}
	
	static int primeNum(int a) {
		int result = 0;
		for(int i=2; i<=a; i++) {
			int count = 0;
			for(int j=1; j<=i; j++) {
				if(i%j == 0) {
					count++;
				}
				//if(count>2) break;
			}
			if(count == 2) {
				result++;
			}
		}
		return result;
	}
	
}
