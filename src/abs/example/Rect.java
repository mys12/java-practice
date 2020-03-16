package abs.example;

public class Rect extends Shape{

	public int side;
	
	public Rect(String name, int side) {
		super(name);
		this.side = side;
	}
//	public int getSide() {
//		return side;
//	}

	@Override
	public double getArea() {
		return side*side;
	}

	
}
