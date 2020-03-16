package inter.example02;

public class MainClass {

	public static void main(String[] args) {
		Animal baduk = new Dog();
		Animal nabi = new Cat();
		Animal hodol =new Tiger();
		
		baduk.name = "바둑이";
		nabi.name = "나비";
		hodol.name = "호돌이";
		
		// 1. Animal[] 생성후에 baduk, nabi, hodol 저장후에 향상된 포문으로 공통 기능을 출력
		Animal[] a = {baduk, nabi, hodol};
		for(Animal animal : a) {
			System.out.println(animal.name);
			animal.eat();
			
		}
		
		System.out.println("----------------------------------------");
		// 2. IPet[]을 생성후에, 클래스에 캐스팅을 통해서 baduk, nabi, new GoldFish()를 저장
		// 향상된 포문으로 공통기능 출력
		
		IPet iBaduk = (IPet)baduk;
		IPet iNabi = (IPet)nabi;
		IPet iGoldFish = (IPet)new GoldFish();
		IPet[] i = {iBaduk, iNabi, iGoldFish};
		
		for(IPet iPet : i) {
			iPet.play();
		}
		
		System.out.println("-----------------------------");
		PetShop ps1 = new PetShop();
		ps1.carePet(iBaduk);
		ps1.carePet(iNabi);
		ps1.carePet(iGoldFish);
		
		
	}
}
