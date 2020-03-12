package poly.person;

public class Student extends Person{

	String studentId; //학번
	
	// this 키워드를 이용해서, 이름, 나이, 학번을 초기화 하는 생성자
	
	Student(String name, int age, String studentId) {
//		super(); //자동으로 생략되어있음.
		super(name,age);
		this.name =name;
		this.age =age;
		this.studentId = studentId;
		
	}
	String info() {
		return super.info() + ", 학번: " + studentId;
	}
}
