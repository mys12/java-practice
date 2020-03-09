package overriding.person;

public class MainClass {

	public static void main(String[] args) {
		Student s = new Student();
		s.name = "홍길자";
		s.age = 20;
		s.studentId = "1234";
		System.out.println(s.info());
	
		Teacher t = new Teacher();
		t.name = "홍길동";
		t.age = 30;
		System.out.println(t.info());
	
		Employee e = new Employee();
		e.name = "이순신";
		e.age = 40;
		e.department = "구매부";
		System.out.println(e.info());
		
	}
}
