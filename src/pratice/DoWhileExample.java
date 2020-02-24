package pratice;

public class DoWhileExample {
	public static void main(String[] args) {
		int i = 1; //제어변수
		int sum = 0;
		
		do {
			sum += i;
			System.out.println(sum);
			i++;
		} while (i<=10);
		System.out.println("----------------------");
		int a = 1;
		int sum2 = 0;
		while(a <= 10){
			sum2 += a;
			System.out.println(sum2);
			a++;
		}
	}
}
