package pratice;

public class PersonMain {
	public static void main(String[] args) {
		
		Person p1 = new Person("홍길동", 20, 180);
//		p1.name = "홍길동";
//		p1.age = 19;
		p1.info();
	
		System.out.println("-------------");
		
		Person p2 = new Person();
		p2.name = "김길동";
		p2.age = 30;
		p2.tall = 170;
		p2.info();
	}
}
