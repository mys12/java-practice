package pratice;

import java.util.Scanner;

public class IfExample02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("점수 입력> ");
		int point = scan.nextInt();
		
		if(point >= 90) {
			
			if(point >= 95) {
				System.out.println("A+");
			}else {
				System.out.println("A");
			}
//			System.out.println("A");
		} else if(point >= 80) {
			System.out.println("B");
		} else if(point >= 70) {
			System.out.println("C");
		} else {
			System.out.println("F");
		}
		
		scan.close();
	}
}
