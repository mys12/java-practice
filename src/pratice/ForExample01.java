package pratice;

public class ForExample01 {
	public static void main(String[] args) {

		int sum = 0;
		for (int i = 1; i <=10; i++) {

			sum += i;
		}
		System.out.println("1~10까지 합: " + sum);
		System.out.println("-----------------");

		for (int j = 10; j >= 1; j--) {
			System.out.println(j);
		}

	}
}
