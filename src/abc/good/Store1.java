package abc.good;

public class Store1 extends HeadStore{

//	Store1(){ //생략되어 있음
//		super();
//	}
	
	@Override
	public void apple() {
		System.out.println("서울 지점 사과  1000원");
		
		
	}

	@Override
	public void orange() {
		System.out.println("서울 지점 오렌지 2000원");
		
	}

	@Override
	public void grape() {
		System.out.println("서울 지점 포도 3000원");
		
	}

	@Override
	public void melon() {
		System.out.println("서울 지점 멜론 4000원");
		
	}

}
