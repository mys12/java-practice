package api.lang.string;

import java.util.Arrays;

public class StringExample {

	public static void main(String[] args) {
		//charAt
		String str1 = "안녕하세요";
		char c = str1.charAt(0);
		System.out.println(c);
		
		//indexof(문자열)
		int a = str1.indexOf("하");
		System.out.println("문자열이 포함된 인덱스 : " + a);
		
		//length()
		int i = str1.length();
		System.out.println("문자열 길이 : " + i);
		
		//replace()
		String str2 = "자바는 어렵습니다. 하지만 자바는 재밌습니다.";
		String s = str2.replace("자바", "java");
		System.out.println(s);
		
		//해당 문자열의 공백을 제거
		String result = str2.replace(" ", "");
		System.out.println(result);
		
		//substring()
		String ssn = "123456-7891234";
		String result2 = ssn.substring(7); // 매개값을 하나 주면 해당 인뎃그 앞을 제거
		System.out.println(result2);
		
		String result3 = ssn.substring(7, ssn.length());
		System.out.println(result3); //매개값을 두 개 주면 해당문자열을 추출
		
		//split()
		String phone = "010-1234-5678-abc-DEFT";
		String[] result4 = phone.split("-");
		System.out.println(Arrays.toString(result4));
		
		
		
	}
}
