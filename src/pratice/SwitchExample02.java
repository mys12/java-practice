package pratice;

import java.util.Scanner;

public class SwitchExample02 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("점수 입력:");
		int point = scan.nextInt();

		//연산식이 정수형이면 switch 소괄호 안에 들어 갈 수 있음
		switch (point/10) {
		case 9:
			
			if(point >= 95) {
				System.out.println("A+");
			} else {
				System.out.println("A");
			}
			break;
		case 8:
			System.out.println("B");
			break;
		case 7:
			System.out.println("C");
			break;

		default:
			System.out.println("F");
			break;
		}
		scan.close();
	}
}
