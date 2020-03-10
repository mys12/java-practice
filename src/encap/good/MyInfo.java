package encap.good;

public class MyInfo {

	
	private int year;
	private int month;
	private int day;
	private String ssn;

	/*
	 * 1. 은닉을 사용하려면 데이터를 저장할 멤버변수에 private 선언
	 * 2. 은닉된 변수에 접근하기 위해서는 클래스 설계자가 만들어 놓은 getter/setter 메서드 사용
	 * 
	 * - setter 메서드
	 * 은닉변수에 값을 저장하기 위한 메서드
	 * 메서드의 제한자를 public으로 선언하고 이름은 set + 멤버변수명으로 생성
	 * 
	 */
	
	public void setYear(int year) {
		if(year > 2020 || year < 0) {
			System.out.println("잘못된 년도를 입력하셨습니다.");
		}else {
		this.year = year;
		}
		
	}
	/*
	 * - getter 메서드
	 * 은닉변수에 값을 조회하기 위한 메서드
	 * 메서드의 제한자를 public으로 선언하고 이름은 get+멤버변수명으로 생성
	 */
	
	public int getYear() {
		return year;
		
	}
	/*
	 * month, day, ssn에 대한 getter/setter 생성
	 * month는 1~12월까지만 저장가능
	 * day는 1~31Rj까지만 저장가능
	 * ssn는 길이가 13자리이면  저장 가능
	 */
	public void setMonth(int month) {
		if(month < 1 || month >12) {
			System.out.println("잘못된 달을 입력하셨습니다.");
			this.month = 1;
		}else {
			this.month = month;
		}
	}
	
	public int getMonth() {
		return month;
	}
	
	public void setDay(int day) {
		if(day < 1 || day >31) {
			System.out.println("잘못된 일을 입력하셨습니다.");
			this.day = 1;
		}else {
			this.day = day;
		}
	}
	public int getDay() {
		return day;
	}
	
	public void setSsn(String ssn) {
		if(ssn.length() != 13) {
			System.out.println("잘못된 주민등록번호를 입력하셨습니다.");
			this.ssn = "0000000000000";
		}else {
			this.ssn = ssn;
		}
	}
	
	public String getSsn() {
		return ssn;
	}
}
