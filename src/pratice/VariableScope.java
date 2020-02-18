package pratice;

public class VariableScope {
	public static void main(String[] args) {
		
		// 같은 타입변수라면 ','로 나열해서 선언할 수 있음
		int num1 = 10, num2 = 20;
		int num4 = 100;
		
		if(num1 >= 1) {
			int num3 = num1 + num2;
			num4 = 50;
		}
		
		int num3 = 100;
		System.out.println(num3);
		System.out.println(num4);
	}
}
