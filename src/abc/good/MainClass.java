package abc.good;

public class MainClass {

	public static void main(String[] args) {
		
		// 1. (추상 클래스)추상 메서드 사용하면 오버라이딩이 강제화 되기 때문에, 
		// 프로그래머의 오버라이딩 실수를 줄일 수 있고,
		
		// 2. 다형성을 안전하게 사용 할 수 있게 해주는  원리
//		Store1 s1 = new Store1();
		HeadStore s1 = new Store1(); // 위보다 더 선호
		System.out.println(s1.getStoreName());
		s1.apple();
		s1.grape();
		s1.orange();
		s1.melon();
		
		System.out.println("----------------------");
		HeadStore s2 = new Store2();
		System.out.println(s1.getStoreName());
		s2.apple();
		s2.grape();
		s2.orange();
		s2.melon();
	}
}
