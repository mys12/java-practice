package poly.person;

public class Employee extends Person {

	String department;
	
	Employee(String name, int age, String department) {
		super(name,age);
		this.name = name;
		this.age = age;
		this.department = department;
	}
	String info() {
		return super.info() + ", 부서: " + department;
	}
}
