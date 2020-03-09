package overriding.quiz01;

public class People {

	int getTotal() {
		System.out.println("재정의 해야합니다.");
		return 0;
	}
	
	double getAvg() {
		System.out.println("재정의 해야합니다.");
		return 0;
		
	}
	
	String info() {
		System.out.println("재정의 해야합니다.");
		return "";
	}
}
