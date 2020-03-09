package overloading.example;

public class MainClass {

	public static void main(String[] args) {
		
		Basic b = new Basic();
		b.input(1);
		b.input("1");
		b.input("hi", 3.14);
		b.input(3.14, "hi");
		b.input(1, 'a', 3.14);
		
	}
	
}
