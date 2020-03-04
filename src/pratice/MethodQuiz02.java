package pratice;

public class MethodQuiz02 {

	public static void main(String[] args) {
		String str = java(6);
		System.out.println(str);
	}
	
	static String java (int a) {
		String result = "";
		for(int i = 1; i<=a; i++) {
			if(i%2 == 1) {
				result += "자";
			} else {
				result += "바";
			}
		}
		return result;
		
	}
}
