package abs.example;

public abstract class Shape { //부모 클래스

	private String name;
	
	public Shape(String name) {
		this.name = name;
		
	}
	// 자식 클래스에서 반드시 구현할 메서드는 추상 메서드로 선언
	public abstract double getArea();
	
	// 오버라이딩을 강요하지 않는다면, 일반 메서드로 선언
	public String getName() {
		return "도형이름 : " + name;
	}
	
}
