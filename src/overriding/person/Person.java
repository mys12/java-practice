package overriding.person;

public class Person { //부모클래스로 사용(공통적인 기능을 적는다)
	String name;
	int age;
	
	String info() {
		return "이름 : " + name + ", 나이 : " + age;
		
	}

}
