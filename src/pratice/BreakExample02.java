package pratice;

import java.util.Scanner;

public class BreakExample02 {
	public static void main(String[] args) {
		//반복문안에서 스캐너 사용
		Scanner scan = new Scanner(System.in);
		while(true) {
			int ran = (int)(Math.random()*100)+1;
			System.out.println("--------------");
			System.out.println("3x"+ ran +" = ?");
			System.out.print(">");
			int num = scan.nextInt();
			
			if( num == ran * 3) {
				System.out.println("정답!");
				break;
			}
		}
		scan.close();
	}
}
