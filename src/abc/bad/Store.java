package abc.bad;

public class Store extends HeadStore {


	public void apple() {
		System.out.println("서울 지점 사과는 500원");
	}
	
	public void orange() {
		System.out.println("서울 지점 오렌지는 600원");
	}
	
	public void grape() {
		System.out.println("서울 지점 포도는 700원");
	}
	
	//프로그래머가 실수로 반드시 오버라이딩 해야하는 메서드를 빼먹었다면?
	
}
