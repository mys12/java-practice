package poly.instanceof_.quiz;

public class Warrior extends Player {

	//생성자
	public Warrior(String name) {
		this.name = name;
		this.hp = 1000;
		this.mp = 500;
	}
	
	
	public void bash(Player p) {
		System.out.println(p.name + "님  배쉬 스킬 적중");
		if(this.mp < 100) {
			System.out.println("스킬 사용 x");
			return; //메서드 종료
		}
		this.mp -= 100;
		
		if(p instanceof Wizard) {
			p.hp -= 100;
		}else if(p instanceof Warrior) {
			p.hp -= 200;
		}
	}
}
