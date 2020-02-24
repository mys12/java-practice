package pratice;

public class MultiForExample02 {
	public static void main(String[] args) {
		for(int i = 0; i < 3; i++ ) {
			for(int j = 0; j < 4; j++) {
			System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("------------------");
		for(int i = 0; i<5; i++) {
			for(int j = 0; j<i+1; j++) {
				System.out.print("*");
				
			}
			System.out.println();
		}
		System.out.println("------------------");
		int star = 5;
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j<star-i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
