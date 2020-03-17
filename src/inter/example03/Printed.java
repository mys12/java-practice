package inter.example03;

//MS사에서 정의한 프린트 프로그램 사용 방법
public interface Printed {

	//메서드 사용방법을 추상메서드로 선언
	public void turnOn();
	public void turnOff();
	public String print(String document);
	public String colorPrint(String document, String color);
	public int copy(int n);
}
