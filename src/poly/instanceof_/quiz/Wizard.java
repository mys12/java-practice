package poly.instanceof_.quiz;

public class Wizard extends Player {

	public Wizard(String name) {
		this.name = name;
		this.hp = 500;
		this.mp = 1000;
	}
	public void iceArrow() {
		System.out.println("얼음화살 사용");
	}
	
	public void Blizzard(Player[] players) {
	
		System.out.println("------------");
		System.out.println(this.name + "님의 눈보라 시전!");
		
		for(Player p : players) {
			int damage = (int)((Math.random()*6)+10);
			p.hp -= damage;
			System.out.println(p.name+ "님이 " + damage + "피해를 입었습니다");
		}
	}
}
