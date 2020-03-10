package super_.person;

public class Person extends Object { //부모클래스로 사용(공통적인 기능을 적습니다)
	
	String name;
	int age;
	
	Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
		//System.out.println( this );
	}
	
	Person(String name) {
		//this.name = name;
		//this.age = 1;
		this(name, 1);
	}
	
	
	String info() {
		return "이름:" + name + ", 나이:" + age;
	}
}




