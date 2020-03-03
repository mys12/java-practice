package pratice;

public class BreakExample05 {
	public static void main(String[] args) {
		//중첩반복문에서 탈출하는 방법
		
		/*
		 * 내부 반복문에 break를 사용해서 바깥 반복문까지 탈출시키려면
		 * 바깥 반복문에 이름을 붙인다.
		 * 
		 */
		boolean bool = false;
		//A의 유니코드값 65, Z값 90
		apple: for(char u = 'A'; u<='Z'; u++) {
			for(char l = 'a'; l<='z'; l++) {
				System.out.println(u + "-" + l);
				
				if(l == 'd') {
					bool = true;
					break apple;
				}
			}
			if(bool == true) break;
		}
	}
}
