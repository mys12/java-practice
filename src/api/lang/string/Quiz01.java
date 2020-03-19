package api.lang.string;

import java.util.Scanner;

public class Quiz01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
		
			System.out.print("아이디 등록 : ");
			String id = sc.nextLine();
			id = id.replace(" ", ""); //공백제거
			
			if(id.length() < 5 ) {
				System.out.println("아이디는 5글자 이상으로 등록하세요.");
			} else {
				System.out.println("아이디 : " + id + "가 등록되었습니다.");
				break;
			}
		}
		
		System.out.println("------------------------");
		while(true) {
			System.out.print("주민번호 13자리를 입력하세요 : ");
			String ssn = sc.nextLine();
			ssn = ssn.replace("-", "");
			if(ssn.charAt(6) == '1') {
				System.out.println("남성");
			} else {
				System.out.println("여성");
			}
			break;
		}
		sc.close();
	}
}
