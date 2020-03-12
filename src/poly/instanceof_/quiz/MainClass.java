package poly.instanceof_.quiz;

public class MainClass {

	public static void main(String[] args) {
		System.out.println("---------문제 (10-1)----------");
		Warrior me = new Warrior("강한친구대한전사");
		
		Wizard play2 = new Wizard("구르미그린마법사");
		Warrior play3 = new Warrior("전사약해요");
		
		System.out.println("---나의 케릭 배쉬스킬 사용---");
		me.bash(play2);
		me.bash(play3);
		
		play2.info();
		play3.info();
		
		
		me.bash(play2);
		me.bash(play3);
		
		
		play2.info();
		play3.info();
		System.out.println("--------문제(10-2)--------------");
		Warrior w1 = new Warrior("강한친구");
		Wizard w2 = new Wizard("구르미");
		Warrior me2 = new Warrior("나의 캐릭터");
		
		Player[] p = {w1, me2};
		for(int i = 0; i<=4; i++) {
		w2.Blizzard(p);
		}
				
	}
}
