package static_.example;

public class Calculator {

	/*
	 * 계산기별로 결과값이, 색깔은 다르기 때문에 color, result는 공유되서는 안됨
	 * 객체별로 데이터를 따로 관리한다면 일반 멤버변수로 선언
	 *
	 * 원주율은 동일하기 때문에 데이터를 공유시켜서 사용하는 편이 좋음
	 * 이런 변수들은 static 변수로 선언
	 */
	private String color;
	private int result;
	public static double pi = 3.14;
	
	/*
	 * 일반 멤버변수를 사용하면 정적메서드로 선언하면 안됨
	 */
	public void paint(String color) {
		this.color = color;
	}
	
	public String getColor() {
		return color;
	}
	/*
	 * 메서드 내부에서 일반 멤버변수를 사용하지 않고
	 * 범용성있게 사용되는 메서드는 static 메서드로 만드는 편이 좋음
	 * 
	 */
	public static double circle(int r) {
		return r*r*pi;
	
	
	}
	
}
