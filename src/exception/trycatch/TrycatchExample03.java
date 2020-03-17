package exception.trycatch;

import java.util.Scanner;

public class TrycatchExample03 {

	public static void main(String[] args) {
		//스캐너 에러 처리
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			
			try {
				System.out.print(">");
				int num = scan.nextInt(); //엔터값을 제외하고 숫자만 받아들임
				System.out.println("입력받은 수 : " + num);
				
			} catch (Exception e) {
				System.out.println("반드시 숫자를 입력하세요.");
				scan.nextLine(); //엠터값을 기준으로 포함해서 받아들임
			}
		}
		
	}
	
}
