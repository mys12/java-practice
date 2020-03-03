package pratice;

public class BreakExample01 {
	public static void main(String[] args) {
		/*
		 * 무한루프
		 * -반목문의 반복횟수를 정확히 모를 때 사용하며, 
		 * 특정조건하에 반복문을 종료시키는 형태로 사용
		 */
		
		int i = 1;
		
		while(true) {
			if(i == 12) {
				break;
			}
			System.out.println(i);
			i++;
			
		}
	}
}
