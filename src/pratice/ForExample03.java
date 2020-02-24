package pratice;

public class ForExample03 {
	public static void main(String[] args) {
		
		//7~100까지 정수 중의 7의 배수를 가로로 출력
		//for (int i = 7; i <= 100; i +=7)
		System.out.println("7의 배수");
		for (int i = 7; i <=100; i++) {
			if(i%7 == 0) {
				System.out.print(i + " ");
			}
		}
		
		//1~200까지 정수 중의 5의 배수를 가로로 출력
		System.out.println("\n\n5의 배수");
		for (int i = 1; i <= 200; i++) {
			if(i % 5 == 0) {
				System.out.print(i + " ");
			}
			
		}	
		
		// 1~200까지 정수 중의 8의 배수이면서, 16의 배수가 아닌 수를 모두 출력
		System.out.println("\n\n8의 배수이면서 16의 배수 x");
		for (int i = 1; i <= 200; i++) {
			if(i%8 == 0 && i%16 != 0) {
				System.out.print(i + " ");
			}
			
		}
		
		//1~500 까지 정수 중의 11의 배수의 개수
		System.out.println("\n\n11의 배수의 개수");
		int count = 0;
		for (int i = 1; i < 500; i++) {//65~90까지 회전하는 반복문
			if(i % 11 == 0) {
				count++;
			}
		}
		System.out.println(count);
		
		//ABCD...Z 붙여서 가로로 출력
		System.out.println("\n알파벳 출력");
		String str = "";
		for (char c = 'A'; c <='Z'; c++) {
//			System.out.print(c + " ");
			str += c;
			System.out.println(str);
		}
		
		//배열의 값을 for문으로 출력, 합계
		System.out.println("\n\n배열");
		int[] arr = {2,4,6,8,10};
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");	
			sum += arr[i];
		}
		System.out.println("\n합계 : " + sum);
		System.out.println("평균: " +(double)sum/arr.length);;
	}
}
