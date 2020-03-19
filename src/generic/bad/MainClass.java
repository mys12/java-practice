package generic.bad;

public class MainClass {

	public static void main(String[] args) {
		
		//ABC클래스는 저장할 때는 편리할 수 있지만, 반대로 값을 얻어올 때
		//잘못 캐스팅하거나, 잘못 사용하면 에러로 이어짐.
		
		
		ABC abc = new ABC();
		
		abc.setObj("홍길동");
		String result =(String)abc.getObj();
		
		
		ABC abc2 = new ABC();
		abc2.setObj(new Person());
//		String result2 = (String)abc.getObj(); //error 발생
		Person result2 = (Person)abc.getObj();
	}
}
