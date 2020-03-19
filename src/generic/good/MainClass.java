package generic.good;

public class MainClass {

	public static void main(String[] args) {
		//제네릭 클래스는 생성할 때, <>안에 지정될 타입을 전달함.
		ABC<String> abc = new ABC<String>();
		
		abc.setC("홍길동");
		String name = abc.getC();
		
		System.out.println(name);
		
		ABC<Person> abc2 = new ABC<>(); //뒤에 있는 제네릭은 생략 가능
		
		abc2.setC(new Person());
		Person p = abc2.getC();
		System.out.println(p);
	}
}
