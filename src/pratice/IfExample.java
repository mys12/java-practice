package pratice;

public class IfExample {

	public static void main(String[] args) {
		//0~100까지 랜덤정수
		int point = (int)(Math.random()*101);
		System.out.println("점수 : " + point );
	
		if(point>=60) {
			System.out.println("합격");
		} else {
			System.out.println("불합격");
		}
		
		//삼항식으로
		String result = point >=60 ? "합격" : "불합격";
		System.out.println(result);
	}
}
