package api.lang.string;

public class Quiz02 {

	public static void main(String[] args) {
		
		System.out.println(palindrome("아 좋다 좋아"));
		System.out.println(palindrome("다시 합창 합시다"));
		System.out.println(palindrome("안녕하세요"));
	}
	
	public static String palindrome(String word) {
		//회문이라면 "회문입니다"
		//회문이 아니라면 "회문이 아닙니다"
		
		word = word.replace(" ", "");
		
		boolean result = false;
		for(int i = 0; i <= (word.length()/2)-1; i++) {//가운데 값 -1까지 회전
			if(word.charAt(i) == word.charAt(word.length()-1-i)) { //첫번째와 마지막 인덱스번째를 순서대로 비교
				result = true;
				
			}else {
				result = false;
				break;
			}
			
		}
		if(result == true) {
			return "회문입니다";
			
		}else {
			return "회문이 아닙니다";
		}
				
	}
}
