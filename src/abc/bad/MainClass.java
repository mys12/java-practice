package abc.bad;

public class MainClass {

	public static void main(String[] args) {
		// 반드시 재정의해야하는 오버라이딩을 빼먹었다면,
		// 잘못된 메서드의 실행으로 이어질 수 있다는 뜻
		
		
		Store s = new Store();
		s.apple();
		s.grape();
		s.orange();
		s.melon();
	}
}
