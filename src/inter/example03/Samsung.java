package inter.example03;

public class Samsung implements Printed {

	@Override
	public void turnOn() {
		System.out.println("삼성 프린트 시작");
		System.out.println("전원을 켭니다.");
	}

	@Override
	public void turnOff() {
		System.out.println("전원을 끕니다.");
	}

	@Override
	public String print(String document) {
		System.out.println("출력시작");
		System.out.println("문서 : " + document);
		return document;
	}

	@Override
	public String colorPrint(String document, String color) {
		System.out.println(color + "색 출력");
		System.out.println("문서 : " + document);
		return document;
	}

	@Override
	public int copy(int n) {
		for(int i = 1; i <= n; i++) {
			System.out.println(i +"장 출력!");
		}
		return 0;
	}

}
