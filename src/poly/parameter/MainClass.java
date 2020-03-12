package poly.parameter;

public class MainClass {

	public static void main(String[] args) {
		//drive 메서드에 taxi 객체와 bus객체를 전달
		Driver d = new Driver();
		d.drive(new Taxi());
		d.drive(new Bus());
		
//		List list = new ArrayList();
	}
}
