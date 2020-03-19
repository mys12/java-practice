package api.util.date;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateExample {

	public static void main(String[] args) {
		//현재 날짜를 구해오는 기능
		Date date = new Date();
		System.out.println(date);
		
		//원하는 형태로 변경할때는 SimpleDateFormat 클래스
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		String now = sdf.format(date);
		System.out.println(now);
	}
}
