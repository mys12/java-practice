package pratice;

public class Phone {
	//멤버변수
	String color;
	String model;
	int price;
	
	//생성자 선언
	//생성자는 일반적으로 멤버변수를 초기화하는 역할
	//생성자 클래스 이름과 대/소문자까지 같아야 하며 반환유형은 없음
	Phone(){
		System.out.println("생성자 호출");
		color = "검정";
		model = "애니콜";
		price = 200000;
		
	
	}
	//1. 생성자는 중복해서 여러개 선언 가능
	//2. 단, 매개변수의 종류나 개수가 달라야함
	Phone(String pColor){
		color = pColor;
		model = "팬택&큐리텔";
		price = 300000;
	}
	
	Phone(String pColor, String pModel){
		color = pColor;
		model = pModel;
		price = 500000;
	}
	
	Phone(String pColor, int pPrice){
		color = pColor;
		model = "아이폰";
		price = pPrice;
		
		
	}
	
	Phone(String pColor, String pModel, int pPrice){
		color = pColor;
		model = pModel;
		price = pPrice;
	}
	//메서드
	void info() {
		System.out.println("--- 폰의 정보 ---");
		System.out.println("색상 : " + color);
		System.out.println("모델명 : " + model);
		System.out.println("가격 : " + price);
	}
}
