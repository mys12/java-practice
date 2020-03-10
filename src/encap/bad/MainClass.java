package encap.bad;

public class MainClass {

	public static void main(String[] args) {
		//멤버변수를 public으로 선언하면, 잘못된 값이 저장될 수 있음
		MyInfo me = new MyInfo();
		
		me.year = 2020;
		me.month = 3;
		me.day = 100;
		me.ssn = "???";
		me.dateInfo();
	}
}
