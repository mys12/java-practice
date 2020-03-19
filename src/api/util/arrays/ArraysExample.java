package api.util.arrays;

import java.util.Arrays;

public class ArraysExample {

	public static void main(String[] args) {
		//Arrays클래스 - 배열 관련된 유용한 기능
		//전부 static 메서드로 선언되어 있음
		
		int[] arr = {3,1,4,2,5,6};
		
		System.out.println(Arrays.toString(arr));
		
		Arrays.sort(arr); //정렬
		System.out.println(Arrays.toString(arr));
		
		//단, 탐색전에 정렬되어야 함
		int index = Arrays.binarySearch(arr,4); //탐색
		System.out.println("4가 있는 인덱스: " +index);
		
		int[] copy = Arrays.copyOfRange(arr, 3, arr.length);
		System.out.println(Arrays.toString(copy));
	}
}
