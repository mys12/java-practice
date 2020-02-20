package pratice;

import java.util.Scanner;

public class IfQuiz02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("정수 두개 입력");
		System.out.print(">");
		int x = scan.nextInt();
		System.out.print(">");
		int y = scan.nextInt();
		
		if(x > y) {
			System.out.println(x+"이 큰 수");
		} else if(x == y) {
			System.out.println("같은 수");
		} else {
			System.out.println(y+"이 큰 수 ");
		}
		scan.close();
		
	}
}
