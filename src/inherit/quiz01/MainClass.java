package inherit.quiz01;

public class MainClass {

	public static void main(String[] args) {
		Warrior wr = new Warrior();
		wr.name  = "구르미그린달빛";
		wr.hp = 500;
		wr.mp = 1000;
		System.out.println("---마법사---");
		wr.info();
		wr.bash();
		
		Wizard wz = new Wizard();
		wz.name = "강한친구대한전사";
		wz.hp = 1000;
		wz.mp = 500;
		System.out.println("---전사---");
		wz.info();
		wz.iceArrow();
		
		
	}
}
