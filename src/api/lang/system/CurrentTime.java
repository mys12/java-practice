package api.lang.system;

public class CurrentTime {

	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		long sum = 0;
		for(long i = 1; i <= 10000000000L; i++) {
			sum += i;
		}
		
		
		long end = System.currentTimeMillis();
		System.out.println("걸린 시간: " + (end-start)*0.001);
	}
}
