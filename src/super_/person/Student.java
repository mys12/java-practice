package super_.person;

public class Student extends Person {

	String studentId; //학번
	
	//this키워드를 이용해서, 이름, 나이, 학번을 초기화하는 생성자
	Student(String name, int age, String studentId) {
		super(name, age);
		this.studentId = studentId;
	}
	
	String info() {
		return super.info() + ", 학번:" + studentId;
	}
}
