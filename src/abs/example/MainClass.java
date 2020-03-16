package abs.example;

public class MainClass {

	public static void main(String[] args) {
		/* Circle */ Shape c = new Circle("원", 4);
		System.out.println(c.getName()); // 상속받은 메서드
//		System.out.println("반지름 : " + c.getRadius());
		System.out.println("넓이 : " + c.getArea()); //오버라이딩
		
	
		/* Rect */ Shape r = new Rect("사각형" ,5);
		System.out.println(r.getName());
//		System.out.println("길이 : " + r.getSide());
		System.out.println("넓이 : " + r.getArea());
	}
}
