package pratice;

//설계용 클래스는 메인 메서드를 작성하지 x
public class Pen {

	//클래스의 속성을 멤버변수(field)라고 함
	String ink;
	int price;
	
	//클래스의 기능을 메서드라고 함
	void write() {
		System.out.println(ink + "색 글을 씁니다.");
		
	}
	
	void info() {
		System.out.println("---펜의 정보---");
		System.out.println("펜의 색상 : " + ink);
		System.out.println("펜의 가격 : " + price);
	}
	
}
