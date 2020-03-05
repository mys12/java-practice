package pratice;

public class PhoneMain {
	public static void main(String[] args) {
		Phone basic = new Phone();
		basic.info();
		
		Phone white = new Phone("화이트");
		white.info();
	
		Phone galaxy = new Phone("화이트","갤럭시");
		galaxy.info();
		
		Phone iphone = new Phone("검정", 1000000);
		iphone.info();
		
		// 그린, 샤오미, 900000
		//3가지 멤버변수를 초기화하는 생성자를 만들고
		//객체로 생성
		
		Phone shaomi = new Phone("골드", "샤오미", 900000);
		shaomi.info();
				
	}
}
