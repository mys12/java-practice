package pratice;

import java.util.Scanner;

public class MultiForExample03 {
	public static void main(String[] args) {
		
		System.out.print("가로 > ");
		Scanner sc = new Scanner(System.in);
		int w = sc.nextInt();
		System.out.print("세로 > ");
		int h = sc.nextInt();
		
		for(int i = 1; i <= h; i++) {
			for(int j = 1; j<=w; j++) {
				if(i == 1 || i == h) {
					System.out.print("*");
				} else {
					if(j == 1 || j == w) {
						System.out.print("*");
					} else {
						System.out.print(" ");
					}
				}
			}
			System.out.println();
		}
		sc.close();
	}
}
