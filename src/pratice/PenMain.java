package pratice;

public class PenMain {
	public static void main(String[] args) {
		// Pen클래스의 기능, 속성을 사용하려면
		// Pen 클래스를 통해 Pen 객체를 생성해야함
		// 객체의 기능, 속성을 사용할 때 참조연산자 .을 사용
		
		Pen black = new Pen();
		
		black.ink = "검정";
		black.price = 500;
		
		black.write();
		black.info();
		
		Pen red = new Pen();
		red.ink = "빨강";
		red.price = 1000;
		
		red.write();
		red.info();
		
		// Calculator가 필요하다면?
		Calculator cal = new Calculator();
		cal.add(1);

		
	}
}
