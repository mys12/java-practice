package poly.instanceof_;

public class Person { //부모클래스로 사용(공통적인 기능을 적는다)
	String name;
	int age;
	
	
	Person(String name, int age) {
		this.name = name;
		this.age = age;
		//System.out.println(this);
	}
	

	Person(String name) {
//		this.name = name;
//		this.age = 1;
		this(name, 1);
	}
	
//	Person(){
////		this.name = "이름 없음";
////		this.age = 1;
//		this("이름없음", 1);
//	}
	
	String info() {
		return "이름 : " + name + ", 나이 : " + age;
		
	}

}
