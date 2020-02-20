package pratice;

import java.util.Arrays;

public class ArrayExample {

	public static void main(String[] args) {
		
		//1. 배열의 선언
		int[] arr;
		
		//2. 배열의 생성 - 상자를 만드는 과정
		arr = new int[5]; //크기 바꿀 수 x
		System.out.println(arr); //0번째 상자가 만들어진 위치
		
		//3. 배열의 초기화 - 배열의 값을 저장하는 과정
		arr[0] = 45;
		arr[1] = 60;
		arr[2] = 43;
		arr[3] = 87;
		arr[4] = 90;
		
		//4. 배열의 사용
		
		System.out.println("배열의 3번째 데이터: " + arr[2]);
		arr[2] = 100;
		System.out.println("배열의 3번째 데이터: " + arr[2]);
		
		//5. 배열의 생김새를 문자열의 형태로 확인해보는 기능 Arrays.toString(배열명);
		System.out.println(Arrays.toString(arr));
		
		//6. 배열의 선언과 생성을 동시에
		byte[] arr2 = new byte[7];
		
		//7. 배열의 선언과 생성, 초기화 동시에
		char[] arr3 = {'가','나','다','라'};
		System.out.println(Arrays.toString(arr3));
		
		//8. 배열의 길이를 알아보는 명령어 배열명.length
		System.out.println("배열의 길이 :" + arr3.length);
		
		
		//9. 배열의 초기값을 지정하지 않으면 자동으로 기본값으로 초기화
		byte[] arr4 = new byte[10];
		System.out.println(Arrays.toString(arr4)); // [0,0,0,0,0,0,0,0,0,0]
		
		System.out.println("-----------------------------");
		//String 배열에 가,나,다,라,마를 저장
		//마를 홍길동으로 변경
		String[] arr5 = {"가", "나", "다", "라", "마"};
		System.out.println(Arrays.toString(arr5));
		arr5[4] = "홍길동";
		System.out.println(Arrays.toString(arr5));
		
		// 크기가 3인 int 배열에 1~5 랜덤값을 각각 저장
		//0번째 상자가 2의 배수라면 2의 배수입니다. 출력
		
		int[] num = new int[3];
		num[0] = (int)(Math.random()*5) + 1;
		num[1] = (int)(Math.random()*5) + 1;
		num[2] = (int)(Math.random()*5) + 1;
		
		String result = num[0]%2 ==0 ? "2의 배수":"2의 배수x";
		System.out.println(Arrays.toString(num));
		System.out.println(result);
	}
}
