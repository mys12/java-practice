package encap.quiz01;

public class User {

	private String name;
	private int rrn;
	
	//기본 생성자
	public User(){
		
	}
	
	//멤버변수를 초기화 하는 생성자
	public User(String name, int rrn) {
		super();
		this.name = name;
		this.rrn = rrn;
	}
	
	//getter setter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRrn() {
		return rrn;
	}

	public void setRrn(int rrn) {
		this.rrn = rrn;
	}

}
