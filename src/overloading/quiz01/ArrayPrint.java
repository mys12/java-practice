package overloading.quiz01;

import java.util.Arrays;

public class ArrayPrint {

	void printArray(String[] s) {
		for(String sArr : s) {
			System.out.print(sArr + " ");
		}
		System.out.println("");
	}
	
	void printArray(int[] i) {
		for(int iArr : i) {
			System.out.print(iArr + " ");
		}
		System.out.println("");
	}
	
	void printArray(char[] c) {
		for(char cArr : c) {
			System.out.print(cArr + " ");
		}
		System.out.println("");
	}
}
