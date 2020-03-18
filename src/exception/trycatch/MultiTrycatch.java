package exception.trycatch;

public class MultiTrycatch {

	public static void main(String[] args) {
		/*
		 * main 메서드 실행인자값을 전달하는 방법
		 * 
		 * run 탭 -> run configurations -> argument 탭 -> ${string_prompty}
		 */
		try {
			String data1 = args[0];
			String data2 = args[1];
			
			System.out.println(data1);
			System.out.println(data2);
			
			//문자열 ->숫자 변경
			int var1 = Integer.parseInt(data1);
			int var2 = Integer.parseInt(data2);
			
			System.out.println("더하기 결과: " + (var1+var2));
			
			// 기타 예외
			String str = null;
			str.charAt(0);
			
		} catch (ArrayIndexOutOfBoundsException e) { // catch 구문에는 발생할 에러의 클래스가 정확히 선언되어야 함.
			System.out.println("실행 매개값이 반드시 필요!");
			System.out.println("두 개 이상 전달하세요");
		} catch(NumberFormatException e) { //종류별로 다르게 에러를 처리하려면 catch를 추가하면 됨
			System.out.println("매개값을 반드시 숫자로 전달하세요.");
		} catch(Exception e) { // exception은 예외 클래스의 부모 클래스
			System.out.println("기타 예외입니다.");
		}
	}
}
