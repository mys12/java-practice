package pratice;

import java.util.Scanner;

public class WhileQuiz01 {
	public static void main(String[] args) {
		//quiz01
		int a = 1;
		while(a<=10) {
			System.out.println(a+"번 학생의 출석을 체크합니다.");
			a++;
		}
		
		//quiz02
		//스캐너로 단 수를 입력받아서 해당하는 단의 구구단
		Scanner scan = new Scanner(System.in);
		System.out.print("단 > ");
		int num = scan.nextInt();
		int i = 1;
		while(i<=9) {
			System.out.println(num+"x"+i+ " = " + (i*num));
			i++;
		}
		scan.close();
	}
}
