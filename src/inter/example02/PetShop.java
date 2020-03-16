package inter.example02;

public class PetShop implements IPet{

	// 3. carePet() 메서드 선언
	// 매개변수는 Dog, Cat, GoldFish를 모두 받을 수 있는 형태로 선언
	// 기능 - instanceof를 써서 전달되는 클래스에 따라 "~~강아지를 돌봐요"
	
	public void carePet(IPet i) {
		if(i instanceof Dog) {
			System.out.println("강아지를 돌봐요");
		} else if(i instanceof Cat) {
			System.out.println("고양이를 돌봐요");
		} else {
			System.out.println("금붕어를 돌봐요");
		}
	}


	@Override
	public void play() {
		
		
	}
}

