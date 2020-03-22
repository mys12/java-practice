package api.io.outputstream;

import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.Scanner;

public class OutputStreamExample {

	public static void main(String[] args) {
		/* 
		 * 1. 파일을 쓸 때 (byte형 기반) FileOutPutStream 클래스를 사용
		 * 2. io 패키지의 모든 클래스는 throws 구문을 던지고 있기 때문에,
		 * 	    반드시 try ~catch 구문안에서 사용
		 * 3. 사용한 이후에는 시스템 자원에 직접 접근하는 형태이므로
		 * 	  close() 메서드를 통해 자원을 반납
		 */
		
		Scanner sc = new Scanner(System.in);
		OutputStream fos = null;
		
		try {
		
			//생성자의 매개변수로 파일을 저장할 위치가 들어감	
			fos = new FileOutputStream("D:\\java\\upload\\test.txt");
			
			System.out.print("문장입력 : ");
			String str = sc.nextLine();
			
			/*
			 * OutputStream 클래스는 오직 바이트 데이터만 출력이 가능
			 * 즉, 문자열을 byte형으로 변환 해야함
			 * 
			 */
			byte[] arr = str.getBytes();
			fos.write(arr); // 해당 메서드로 바이트 배열을 읽어서 파일을 씀
			
			System.out.println("파일이 정상적으로 저장되었습니다.");
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				fos.close();
			} catch (Exception e2) {

			}
		}
	}
}
