package static_.init;

public class Marine {

	public int x;
	public int y;
	
	public static int hp;
	public static int attack;
	public static int armor;
	
	//일반변수의 초기화는 생성자에서
	public Marine() {
		System.out.println("생성자 호출");
		this.x = 1;
		this.y = 1;
		
	}
	
	//static변수 초기화는 static{}에서 - 클래스 호출시 1번 실행
	static {
		System.out.println("static 초기화자 호출");
		hp = 60;
		attack = 5;
		armor = 1;
		
	}
	
}
