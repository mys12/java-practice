package encap.bad;

public class MyInfo {

	public int year;
	public int month;
	public int day;
	public String ssn;
	
	public void dateInfo() {
		System.out.println("내 생일은 : " + year + "년" + month + "월" + day + "일");
		System.out.println("주민번호: " + ssn);
	}
}
