package inter.example03;

public class MainClass {

	public static void main(String[] args) {
		Printed print; // 인터페이스 타입 선언
//		print = new LG();
		print = new Samsung();
//		LG l = new LG();
		print.turnOn();
		print.print("가나다라");
		print.colorPrint("마바사", "검정");
		print.copy(10);
		print.turnOff();
	}
}
