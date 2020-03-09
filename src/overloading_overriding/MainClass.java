package overloading_overriding;

public class MainClass {

	/*
	 * Computer 클래스, Computer를 상속받는 Calcalator클래스 생성
	 * 
	 * Computer 클래스에는 circle() 메서드를 생성.
	 * 반환유형: double,  매개변수: double,
	 * 
	 * 매개변수를 이용해서 원의 넓이를 구하는 circle() 을 완성하세요.
	 * 
	 * Calcalator 클래스에서는 circle()메서드를 오버라이딩 하고,
	 * 3.14를 대신 하는 Math.PI를 사용해서 원의 넓이를 구하세요.
	 * 
	 *
	 * Calculator 클래스에서는 다음 메서드를 오버로딩 하세요
	*
	 * 반환유형 : double , 매개변수: double 인
	 * 정사각형의 넓이를 구하는 Rect
	 * 직사각형의 넓이를 구하는 Rect
	 * 직육면체의 부피를 구하는 Rect
	 * 
	 * 메인클래스에서 호출.
	 */
	
	public static void main(String[] args) {
		
		Calculator cal = new Calculator();
		System.out.println("계산기 : " + cal.circle(5));
		System.out.println(cal.Rect(4));
		System.out.println(cal.Rect(4, 5));
		System.out.println(cal.Rect(2, 4, 5));
		
		Computer c = new Computer();
		System.out.println("컴퓨터 : " + c.circle(5));
		
	
	}
	
}
