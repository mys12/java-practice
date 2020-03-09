package this_.person;

public class Student extends Person{

	String studentId; //학번
	
	// this 키워드를 이용해서, 이름, 나이, 학번을 초기화 하는 생성자
	
	Student(String name, int age, String studentId) {
		this.name =name;
		this.age =age;
		this.studentId = studentId;
		
	}
	String info() {
		return "이름 :" + name + ", 나이 : " + age + ", 학번: " + studentId;
	}
}
