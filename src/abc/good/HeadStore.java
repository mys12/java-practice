package abc.good;

public abstract class HeadStore {

	/*
	 * 1. 메서드에 abstract를 붙이면 추상 메서드가 되고, 반드시 자식 클래스에서
	 *	    오버라이딩 해야함
	 * 2. 추상 메서드는 {}가 없는 메서드의 선언을 의미
	 * 3. 추상 메서드를 사용하려면 반드시 추상 클래스가 되어야 함.
	 * 4. 추상 클래스는 일반 메서드, 멤버변수, 생성자 모두 사용 가능
	 * 5. 자식 클래스에서 반드시 오버라이딩 해야하는 메서드가 있다면, 추상클래스(추상메서드)를 사용하게 됨
	 * 
	 */
	private String storeName = "호식이두마리 과일과게";
	
	public HeadStore() {
		System.out.println("생성자 호출");
	}
	
	public String getStoreName() {
		return "상호명 : " + storeName; 
	}
	
	public abstract void apple();
	public abstract void orange();
	public abstract void grape();
	public abstract void melon();
	
	
	
}
