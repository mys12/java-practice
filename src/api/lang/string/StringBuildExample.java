package api.lang.string;

public class StringBuildExample {

	public static void main(String[] args) {
		/*
		 * 문자열을 다루는 클래스 StringBuilder
		 * append, delete, insert 메서드를 통해서 하나의 문자열을 재사용하는 형태로 사용하기 때문에
		 * 자주 변경되는 상황에서 효율적
		 */
		StringBuilder sb = new StringBuilder("A");
		
		System.out.println(sb);
		sb.append("B");
		sb.append("C");
		
		System.out.println(sb);
		
		String str = "A";
		System.out.println(str);
		str += "B";
		str += "C";
		System.out.println(str);
		
		Byte b = 1;
		byte bb = 1;
		
	}
	
}
