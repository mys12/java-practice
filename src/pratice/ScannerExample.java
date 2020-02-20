package pratice;

import java.util.Scanner;

public class ScannerExample {

	public static void main(String[] args) {
		//1. 스캐너 생성
		Scanner scan = new Scanner(System.in);
		
		//2. 스캐너가 가지고 있는 기능을 사용해서 입력받음
		System.out.print("이름 >");
		String name = scan.next();
		
		System.out.print("나이 >");
		int age = scan.nextInt();
		
		System.out.println("---------------------");
		
		System.out.println("이름은 :" + name + ", 나이는 : " + age);

		//스캐너 자원 반납
		scan.close();
	}
}
