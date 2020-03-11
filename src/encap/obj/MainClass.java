package encap.obj;

public class MainClass {

	public static void main(String[] args) {
		//클래스를 전달하는 방법
		Hotel h = new Hotel();
		Employee emp1 = new Employee(); 
		h.setEmp(emp1);
		Employee emp = h.getEmp();
		emp.work();
		
	}
	
}
