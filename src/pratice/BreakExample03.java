package pratice;

import java.util.Scanner;

public class BreakExample03 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int ocount = 0;
		int xcount = 0;
		while(true) {
		int ran1 = (int)(Math.random()*100)+1;
		int ran2 = (int)(Math.random()*100)+1;
		System.out.println("--------------------");
		System.out.println(ran1+ "+" +ran2 + "= ?");
		System.out.println("[문제를 그만 푸시려면 0을 입력하세요.");
		System.out.print("> ");
		int num = scan.nextInt();
		if(num == ran1 + ran2) {
			System.out.println("정답!");
			ocount++;
		}else if(num == 0) {
			System.out.println("프로그램 종료");
			break;
		} else {
			xcount++;
			
		}
	
		}
		System.out.println("정답횟수 : " + ocount + "회");
		System.out.println("틀린횟수 :" + xcount + "회");
		scan.close();
	}
}
