package this_.person;

public class MainClass {

	public static void main(String[] args) {
		Person p1 = new Person("홍길동", 20);
		Person p2 = new Person("홍길자");
		Person p3 = new Person();
		System.out.println(p2.info());
		System.out.println(p3.info());
		
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
	}
}
