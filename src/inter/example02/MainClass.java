package inter.example02;

public class MainClass {

	public static void main(String[] args) {
		Animal baduk = new Dog();
		Animal nabi = new Cat();
		Animal hodol = new Tiger();

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

		//baduk은 Animal 타입이므로 바로 들어 갈 수 없고, 다만 IPet의 기능을 가지고 있기 때문에
		//형변환이 가능
		IPet[] i = new IPet[3];
		i[0] = (IPet)baduk;
		i[1] = (IPet)nabi;
		i[2] = new GoldFish();
		
//		IPet iBaduk = (IPet)baduk;
//		IPet iNabi = (IPet)nabi;
//		IPet iGoldFish = (IPet)new GoldFish();
//		IPet[] arr = {iBaduk, iNabi, iGoldFish};

		for(IPet iPet : i) {
			iPet.play();
		}

		System.out.println("-----------------------------");


		// 3. 
		PetShop ps1 = new PetShop();
		ps1.carePet((IPet)baduk);
		ps1.carePet((IPet)nabi);
		ps1.carePet(new GoldFish());

	}
}
