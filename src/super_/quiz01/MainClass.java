package super_.quiz01;

public class MainClass {

	public static void main(String[] args) {
		SuperSonicAp s = new SuperSonicAp("sun");
		s.takeOff();
		s.flyMode = 0;
		s.fly();
		
		s.flyMode = 1;
		s.fly();
		s.land();
	}
}
