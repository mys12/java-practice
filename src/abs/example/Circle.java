package abs.example;

public class Circle extends Shape {

	//  생성자와, 오버라이딩 적절하게 사용
	private int radius;
	
	// private 변수는 상속되지 않기 때문에 super()를 통해서 부모 생성자를 통해 name 값 저장
	public Circle(String name, int radius) {
		super(name);
		this.radius = radius;
	}
	
//	public int getRadius() {
//		return radius;
//	}
	
	// 추상 메서드 오버라이딩
	@Override
	public double getArea() {
		
		return radius * radius * Math.PI;
	}

}
