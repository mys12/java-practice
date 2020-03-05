package pratice;

public class Person {
	String name;
	int age;
	int tall;
	
	Person(){
		
	}
	
	//프로그래머가 생성자를 직접 선언하면, 기본생성자를 자동으로 만들어주지 않음
	Person(String pName, int pAge, int pTall){
		name = pName;
		age = pAge;
		tall =pTall;	
		
	}
	
	void info() {
		System.out.println(name);
		System.out.println(age + "세");
		System.out.println("키 : " + tall);
	}
}
