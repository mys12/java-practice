package static_.init;

public class MainClass {

	public static void main(String[] args) {
		
		/*
		 * 정적초기화자는 클래스가 처음 호출될 때 가장 먼저 1번만 실행
		 * 즉 static 멤버들은 1개만 생성된다는 뜻
		 */
//		Marine m1 = new Marine();
//		Marine m2 = new Marine();
//		Marine m3 = new Marine();
		
		System.out.println(Marine.attack);
		System.out.println(Marine.armor);
		
	}
}
