package abc.bad;

public class HeadStore { //부모 클래스 (꼭 각각의 기능으로 오버라이딩 해야되는 메서드가 있음)
	
	public void apple() {
		System.out.println("사과는 지점에서 가격을 제시해야 합니다.");
	}
	
	public void orange() {
		System.out.println("오렌지는 지점에서 가격을 제시해야 합니다.");
	}
	
	public void grape() {
		System.out.println("포도는 지점에서 가격을 제시해야 합니다.");
	}
	
	public void melon() {
		System.out.println("멜론은 지점에서 가격을 제시해야 합니다.");
	}

}
