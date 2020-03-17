package inter.example02;

public class PetShop implements IPet {

	// 3. carePet() 메서드 선언
	// 매개변수는 Dog, Cat, GoldFish를 모두 받을 수 있는 형태로 선언
	// 기능 - instanceof를 써서 전달되는 클래스에 따라 "~~강아지를 돌봐요"

	 public void carePet(IPet p) {
	      if(p instanceof Dog) {
	    	  Dog d = (Dog)p;
	    	  System.out.println(d.name + "를 돌봐요");
	      } else if(p instanceof Cat) {
	    	 Cat c = (Cat)p;
	         System.out.println(c.name + "를 돌봐요");
	      } else if(p instanceof GoldFish){
	    	  GoldFish g = (GoldFish)p;
	         System.out.println("금붕어를 돌봐요");
	      } else {
	    	  System.out.println("잘못된 인스턴스입니다.");
	      }
	      
	   }

	@Override
	public void play() {
		
	}

}
