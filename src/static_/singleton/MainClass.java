package static_.singleton;

public class MainClass {

	public static void main(String[] args) {
//		Singleton.instance = null;
		
		Singleton s1 = Singleton.getInstance();
		Singleton s2 = Singleton.getInstance();
		Singleton s3 = Singleton.getInstance();
		Singleton s4 = Singleton.getInstance();
		
		// 1개로 제한
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		
	
	}
}
