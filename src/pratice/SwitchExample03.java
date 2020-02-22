package pratice;

public class SwitchExample03 {
	public static void main(String[] args) {
		String[] arr = {"안녕", "hello", "니하오", "#$%"};
		
		/*
		 * Math.random() 사용해서 0~3까지 랜덤수 발생.
		 * 랜덤수를 배열에 인덱스에 적용해서, 선택된 단어가, 한국어, 중국어, 영어 , 알수없는 구문
		 * 분기하는 switch문
		 */
		
//		int r = (int)(Math.random()*4);
		int r = (int)(Math.random()*arr.length);
		switch (arr[r]) {
		case "안녕":
			System.out.println("한국어");
			break;
		case "hello":
			System.out.println("영어");
			break;
		case "니하오":
			System.out.println("중국어");
			break;

		default:
			System.out.println("알 수 없음");
			break;
		}
		
	}
}
