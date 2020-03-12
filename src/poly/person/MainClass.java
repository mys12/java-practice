package poly.person;

public class MainClass {

	public static void main(String[] args) {
		
		//다형성을 왜 사용하는 가? - 타입을 통일해서 사용하기 위함
		/*
		Student s1 = new Student("홍길동", 20, "123");
		Student s2 = new Student("박찬호",50,"456");
		Student s3 = new Student("김유신", 40, "123");
		
		
		Teacher t1 = new Teacher("홍길자", 30, "수학");
		Teacher t2 = new Teacher("안중근", 45, "역사");
		
		Employee e1 = new Employee("이순신", 50, "행정");
		
		Mother m = new Mother("김여사님", 50);

		Student[] students = {s1, s2, s3};
		Teacher[] teachers = {t1, t2};
		Employee[] e = {e1};
		Mother[] moms = {m};
		
		for(Student s : students ) {
			System.out.println(s.info());
		}
		*/
		
		Person s1 = new Student("홍길동", 20, "123");
		Person s2 = new Student("박찬호",50,"456");
		Person s3 = new Student("김유신", 40, "123");
		
		
		Person t1 = new Teacher("홍길자", 30, "수학");
		Person t2 = new Teacher("안중근", 45, "역사");
		
		Person e1 = new Employee("이순신", 50, "행정");
		
		Person m = new Mother("김여사님", 50);
		
		Person[] p = {s1,s2,s3,t1,t2,e1,m};
		for(Person people : p) {
			System.out.println(people.info()); //오버라이딩 된 메서드 실행
		}
		
		System.out.println("-------문제----------");
		
		//House 객체 생성
		House h = new House();
		h.setIn(s1);
		h.setIn(s2);
		h.setIn(s3);
		h.setIn(t1);
		h.setIn(t2);
		h.setIn(e1);
		h.setIn(m);
		h.print();
		
	}
}
