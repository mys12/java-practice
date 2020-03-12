package poly.person;

public class House {

	/*
//	Student[] students = new Student[100];
	private Student[] students;
	private Teacher[] teachers;
	private Employee[] employees;
	private Mother[] mothers;
	
	
	private int count1 = 0;
	private int count2 = 0;
	private int count3 = 0;
	private int count4 = 0;
	
	
	public House() {
		this.students = new Student[100];
		this.teachers = new Teacher[100];
		this.employees = new Employee[100];
		this.mothers = new Mother[100];
	}
	
	public void setIn(Student s) {
		students[count1] = s;
		count1++;
	}
	*/
	
	/*
	 * 1. 400개의 크기의 person 배열을 생성
	 * 2. count변수를 선언
	 * 3. setIn() 모든 자식 클래스를 받아서 Person 배열에 저장하도록 선언
	 * 4. print() Person배열의 순서대로 info() 출력하는 기능
	 * 5. MainClass에서 setIn() 메서드에  7명의 Person을 전달 
	 */
	
	private Person[] people;
	private int count = 0;
	
	House() {
		this.people = new Person[400];
		
	}
	public void setIn(Person p) {
		
		people[count] = p;
		count++;
	}
	
	public void print() {
		for(int i = 0; i< count; i++) {
		System.out.println(people[i].info());
		}
	}
	
}
