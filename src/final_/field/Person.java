package final_.field;

public class Person {

	/*
	 * final 변수는 값의 변경의 금지, 선언시에 초기화 하기나, 생성자를 초기화로
	 * 반드시 값이 저장되도록 해야함
	 * 
	 * 생성자를 통한 초기화인 경우, 객체마다 다른 값을 가질 수 있음(상수 x)
	 */
	public final String nation = "한국";
	public final int ssn; //주민등록번호
	public String name;
	
	public Person(int ssn , String name) {
		this.ssn = ssn;
		this.name = name;
	}
	
	

}
