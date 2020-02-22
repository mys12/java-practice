package pratice;

public class WhileQuiz03 {
	public static void main(String[] args) {
		/*
		System.out.print("수를 입력하세요 >");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		int i = 0;
		int[] iarr = new int[num];
		while(i<iarr.length) {
			iarr[i] = i+1;
			i++;
		}
		System.out.println("배열 iarr는 :" +Arrays.toString(iarr));
//		scan.close();
		*/
		
		System.out.println("-------------------");
		int[] arr2 = {500,100,50,10};
		int money = 2680;
		int i = 0;
//		int a = 0;
		while (i < arr2.length) {
//			if(money>=arr2[i]) {
//				a = money/arr2[i];
//				System.out.println(arr2[i]+"원 :" + a);
//			}
//			money = money - (arr2[i]*a);
			System.out.println(arr2[i] + "원  :" + money/arr2[i]);
			money = money % arr2[i];
			i++;
		}
		
	}
}
