package overriding.quiz01;

public class MainClass {

	public static void main(String[] args) {
		Student s = new Student("홍길동", 1, 90, 85, 95);
				
		System.out.println(s.getTotal());
		System.out.println(s.getAvg());
		System.out.println(s.info());
	}
}
