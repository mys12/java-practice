package api.lang.obj;

public class MainClass {

	public static void main(String[] args) {
		Person p1 = new Person("홍길동");
		Person p2 = new Person("홍길동");
		
		System.out.println(p1.toString());
		System.out.println(p1.equals(p2));
		
		
		
	}
}
