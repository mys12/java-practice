package api.lang.wrapper;

public class Quiz01 {

	public static void main(String[] args) {
		//str에 1,2,3,4,5의 합계 sum을 구하세요
		String str = "12345";
		int sum = 0;
		for(int i = 0; i<str.length(); i++) {
//			String s = (str.charAt(i) + "");
//			String result = String.valueOf(str.charAt(i));
			sum += Integer.parseInt(String.valueOf(str.charAt(i)));
			
		}
		System.out.println(sum);
	}
}
