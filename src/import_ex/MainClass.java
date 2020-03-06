package import_ex;

import java.util.Scanner;

import com.student.Student;

//패키지명 아래, 클래스 선언 위에 import 선언을 통해 사용할 클래스를 적어줘야 함
import fruit.*; //fruit안에 모든 클래스를 가져옴
//import fruit.Melon;
//import fruit.Peach;

public class MainClass {

	public static void main(String[] args) {
		Melon m = new Melon();
		Peach p = new Peach();
		
		Student s = new Student();
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println(m);
		System.out.println(p);
		System.out.println(s);
		System.out.println(scan);
		
	}
}
