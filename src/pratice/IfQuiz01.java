package pratice;

import java.util.Scanner;

public class IfQuiz01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("키와 나이를 입력하세요");
		System.out.print("키 : ");
		double height = scan.nextDouble();
		System.out.print("나이 : ");
		int age = scan.nextInt();
		
		System.out.println("=====================");
		
		if(height >=140 && age >=8 ) {
			System.out.println("놀이기구 탑승 가능");
		} else {
			System.out.println("놀이기구 탑승 불가");
		}
		scan.close();
	}
	
}
