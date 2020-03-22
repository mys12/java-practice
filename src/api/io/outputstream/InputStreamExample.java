package api.io.outputstream;

import java.io.FileInputStream;
import java.io.InputStream;

public class InputStreamExample {

	public static void main(String[] args) {
		/*
		 * 파일을 입력받을 때 사용하는 클래스는 FileInputStream
		 * 
		 * Stream클래스는 byte 기반 처리이기 때문에 한글을 처리하기엔 적합하지 않음.
		 */
		InputStream ios = null;
		try {
			
			ios = new FileInputStream("D:\\java\\upload\\test.txt");
			//file을 읽을 때는 read()를 쓰고 데이터를 1byte단위로 읽어서 int로 반환
			//더 이상 읽을 데이터가 없다면 -1을 반환
			while(true) {
				int data = ios.read(); // 한 글자를 읽음
				System.out.print((char)data); // 문자형으로 변경해서 출력
				if(data == -1) break;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
