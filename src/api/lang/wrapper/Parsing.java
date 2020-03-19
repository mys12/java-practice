package api.lang.wrapper;

public class Parsing {

	public static void main(String[] args) {
		// 기존의 wrapper의 사용방법
		int var = 1;
		Integer i = new Integer(var); //객체형변환(boxing)
	
		int result = i.intValue(); //기본형변환(unboxing)
		
		
		//Autoboxing 자동형변환을 지원해줌
		Integer var1 = 1;
		int var2 = 1;
		System.out.println(var1);
		System.out.println(var2);
		
		//Autoboxing 이후에 wrapper 클래스들은 문자열을 기본형으로 변환하는 기능으로 자주 사용
		int val1 = Integer.parseInt("10");
		double val2 = Double.parseDouble("3.14");
		
	}
}
