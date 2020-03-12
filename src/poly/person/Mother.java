package poly.person;

public class Mother extends Person{

	//이름과 나이를 받아서 초기화 해주는 생성자를 
	Mother(String name, int age) {
		super(name,age);
	}
	
	String info() {
		return super.info();
	}
}
