package inter.example03;

public class LG implements Printed {

	@Override
	public void turnOn() {
		System.out.println("Life is good");
		System.out.println("전원을 켭니다.");
		
	}

	@Override
	public void turnOff() {
		System.out.println("Life is good");
		System.out.println("전원을 끕니다.");
		
	}

	@Override
	public String print(String document) {
		System.out.println("Life is good");
		System.out.println("문서내용: " + document);
		return document;
	}

	@Override
	public String colorPrint(String document, String color) {
		System.out.println("Life is good");
		System.out.println(color + "색 출력 : " + document);
		
		return document;
	}

	@Override
	public int copy(int n) {
		System.out.println("Life is good");
		System.out.println(n + "장 복사 완료");
		return n;
	}

}
