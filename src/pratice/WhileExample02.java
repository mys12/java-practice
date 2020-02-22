package pratice;

import java.util.Scanner;

public class WhileExample02 {

	public static void main(String[] args) {
		// 정수를 입력받아서 소수인지 판별
		Scanner scan = new Scanner(System.in);
		System.out.print("정수 입력 > ");
		int num = scan.nextInt();
		int a = 2;
		while((num % a) != 0) {
			
			a++;
		}
		
		if(num == a) {
			System.out.println(num + "은 소수");
		} else {
			System.out.println(num + "은 소수가 아님");
		}
		scan.close();
	}
}
