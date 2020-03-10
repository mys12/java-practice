package super_.person;

public class MainClass {

	public static void main(String[] args) {
		
		Student s = new Student("홍길동", 20, "123");
		Teacher t = new Teacher("홍길자", 30, "수학");
		Mother m = new Mother("김여사님", 50);
		
		
		System.out.println(s.info());
		System.out.println(t.info());
		System.out.println(m.info());
	}
}
