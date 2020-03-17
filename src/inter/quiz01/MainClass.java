package inter.quiz01;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		//벅스 뮤직으로 실행시키도록 선언하세요
//		BugsMusic bm = new BugsMusic();
		ISongList list;
		list = new BugsMusic();
		
		
		while(true) {
			System.out.print("[1.입력 2.재생 3.끝내기] \n>");
			String menu = scan.next();
			
			if(menu.equals("1")) {
				System.out.print("재생음악을 추가하세요>");
				String song = scan.next();
				
				//입력받은 음악을 추가하는 메서드를 실행하세요
				list.insertList(song);
				
			
			} else if(menu.equals("2")) {
				//입력받은 음악을 재생하는 메서드를 실행하세요
				list.playList();
				
				
			} else if(menu.equals("3")){
				//while문을 탈출하세요
				break;
			}
		}
		
	}
}
