package this_.quiz;

public class Car {
	
	String model;
	int speed;
	
	Car(String model) {
		//멤버변수를 매개변수로 초기화하세요
		this.model = model;
		this.speed = 0;
	
	}
	
	void accel(int speed) {
		/*
		멤버변수 speed가 150 이상이라면 "속도를 올릴 수 없습니다" 를 출력
		그렇지 않으면 멤버변수를 매개변수로 변경하세요
		*/
		if(this.speed >= 150) {
			System.out.println("속도를 올릴 수 없습니다.");
			
		}else {
			this.speed = speed;
		}

	}
	
	void run() {
		/*	
		0-200 까지 30씩 증가하는 for문을 생성하고, 
		for문안에서 accel()를 호출하세요
		멤버변수 speed도 출력하세요
		*/
		for(int i =0; i <=200; i+=30) {
			this.accel(i);
			System.out.println(this.model+ "의 시속 : " + this.speed );
		}

	}
}







