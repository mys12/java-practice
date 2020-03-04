package pratice;

import java.util.Arrays;

public class MethodQuiz01 {
	public static void main(String[] args) {
		
		method1();
		method2("hi");
		System.out.println(method2("hi"));
		method3(1,2,3.0);
		System.out.println(method3(1,2,3.0));
		method4(5);
		System.out.println(method4(5));
		maxNum(3,5);
		System.out.println(maxNum(3,5));
		abs(-9);
		System.out.println(abs(-9));
		method6(15);
		System.out.println(method6(15));
		int[] a = {1,2,3,4,5};
		method7(a);
		System.out.println(method7(a));
		String s1 = "안녕";
		String s2 = "hello";
		method8(s1,s2);
		System.out.println(Arrays.toString(method8(s1,s2)));
	}
	
	static void method1() {
		System.out.println("안녕");
	}
	
	static String method2(String s) {
		return s;
	}
	
	static double method3(int a, int b, double c) {
		return a+b+c;
	}
	
	static String method4(int d) {
		if(d%2 == 0 ) {
			return "짝수";
			
		} else {
			return "홀수";
		}
	}
	
	static void method5(String s, int a) {
		for(int i = 1; i<=a; i++) {
			System.out.println(s);
		}
	}
	
	static int maxNum(int a, int b) {
		if(a>b) {
			return a;
		} else {
			return b;
		}
	}
	
	static int abs(int a) {
		if(a >=0 ) {
			return a;
		} else {
			return -a;
		}
	}
	
	static int method6(int a) {
		int sum = 0;
		for(int i = 0; i<=a; i++) {
			sum += i;
		}
		return sum;
	}
	
	static int method7(int[] a) {
		return a.length;
		
	}
	
	static String[] method8(String s1, String s2) {
		String[] result = {s1 , s2};
		return result;
	}
}
