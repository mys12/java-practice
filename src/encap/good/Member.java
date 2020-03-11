package encap.good;

public class Member {

	private String id;
	private String pw;
	private String studentId;
	private String email;
	private String address;
	private int phone;
	private int point;
	
	
	public Member(String id, String pw, String studentId, String email, String address, int phone, int point) {
		super();
		this.id = id;
		this.pw = pw;
		this.studentId = studentId;
		this.email = email;
		this.address = address;
		this.phone = phone;
		this.point = point;
	}
	
	//getter, setter를 자동 생성하는 단축키 (Alt + Shift + s)
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public String getStudentId() {
		return studentId;
	}
	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getPhone() {
		return phone;
	}
	public void setPhone(int phone) {
		this.phone = phone;
	}
	public int getPoint() {
		return point;
	}
	public void setPoint(int point) {
		this.point = point;
	}
	
	
}
