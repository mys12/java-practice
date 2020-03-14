package final_.field;

public class MainClass {


	public static void main(String[] args) {
		Person p1 = new Person(123123, "홍길동");
		Person p2 = new Person(345345, "홍길자");
		
		p1.name = "김한국";
//		p1.nation = "미국";
//		p1.ssn = 345345;
		
		System.out.println(p1.name); 
		System.out.println(p1.nation); 
		System.out.println(p1.ssn);//final 변수는 다른값을 가질 수 있음
		
		System.out.println(p2.name);
		System.out.println(p2.nation);
		System.out.println(p2.ssn); // final 변수는 다른 값을 가질 수 있음
	}
}
