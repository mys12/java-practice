package poly.instanceof_;

public class MainClass {

	public static void main(String[] args) {
		
		
		Person s1 = new Student("홍길동", 20, "123");
		
		
		Person t1 = new Teacher("홍길자", 30, "수학");
		
		Person e1 = new Employee("이순신", 50, "행정");
		
		printInfo(s1);
		printInfo(e1);
		printInfo(t1);
		
		
	}
	
	public static void printInfo(Person p) {
		if(p instanceof Student) { //p가 Student 객체라면 true 반환
			Student s = (Student)p;
			System.out.println(s.info());
			} else if(p instanceof Teacher) {
			Teacher t = (Teacher)p;
			System.out.println(t.info());
			
			
		}else if(p instanceof Employee) {
			Employee e = (Employee)p;
			System.out.println(e.info());
			
		}
	}
}
