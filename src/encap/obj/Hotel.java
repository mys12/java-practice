package encap.obj;

public class Hotel {

	private Chef chef;
	private Employee emp;
	
	public Hotel(){
		this.chef = new Chef();
		this.emp = new Employee();
	}
	
	//chef의 setter
	public void setChef(Chef chef) {
		this.chef = chef;
	}
	//chef의 getter
	public Chef getChef() {
		return chef;
	}
	
	public void setEmp(Employee emp) {
		this.emp = emp;
	}
	
	public Employee getEmp() {
		return emp;
	}
}
