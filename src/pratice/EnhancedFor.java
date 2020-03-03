package pratice;

public class EnhancedFor {
	public static void main(String[] args) {
		
		String[] arr = {"월","화","수","목","금","토","일"};
		/*
		for(int i = 0; i< arr.length; i++) {
			System.out.println(arr[i] + "요일");
			
		}
		*/
		
		for(String s : arr) {
			System.out.println(s + "요일");
		}
		
		System.out.println("---------------------");
		
		//1. 향상된 포문으로 출력
		char[] arr2 = {'a','b','c','d'};
		
		for(char c : arr2) {
			System.out.println(c);
		}
		//2. 향상된 포문으로 총점, 평균을 출력
		
		int[] arr3 = {45,34,65,34,76};
		int sum = 0;
		
		for(int i : arr3) {
			sum += i;
		}
		double avg = (double)sum / arr3.length;
	
		System.out.println("합계 : " + sum);
		System.out.println("평균 : " + avg);
	}
}
