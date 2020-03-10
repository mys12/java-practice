package encap.good;

public class MainClass {

	public static void main(String[] args) {
		MyInfo me = new MyInfo();
		me.setYear(2020);
		me.setMonth(10);
		me.setDay(32);
		me.setSsn("1234567891234");
		int year = me.getYear();
		int month = me.getMonth();
		int day= me.getDay();
		String ssn = me.getSsn();
		System.out.println("년 : " + year + ", 월 : " + month + ", 일 : " + day + ", 주민등록번호 : " + ssn);
	}
}
