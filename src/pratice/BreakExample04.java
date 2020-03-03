package pratice;

import java.util.Scanner;

public class BreakExample04 {
	public static void main(String[] args) {
		
		int ran = (int)(Math.random()*100)+1;
		Scanner scan = new Scanner(System.in);
		int count = 0;
		while(true) {
			System.out.print("1~100사이의 값을 입력하세요 : ");
			int num = scan.nextInt();
			count++;
			if(num < ran) {
				System.out.println("더 큰 수를 입력");
			} else if(num > ran) {
				System.out.println("더 작은 수 입력");
				
			} else {
				System.out.println("정답!");
				break;
			}
		}
		System.out.println("시도횟수 : " + count);
		System.out.println("정답 : " + ran);
		scan.close();
	}
}
