package inter.quiz01;

public class BugsMusic implements ISongList{

	String[] list = new String[100];
	int count = 0;
	//ISongList를 상속받아 기능을 완성하세요
	//insertList(song) - list에 순서대로 저장
	//playList() - list를 랜덤으로 출력
	//length() - 저장된 음악 개수 리턴
	//인터페이스의 사용방법 대로 실행
	@Override
	public void insertList(String song) {
		list[count] = song;
		count++;
	}
	@Override
	public void playList() {
//		System.out.println(list[(int)(Math.random()*count)]);
		for(int i = 0; i < count; i++) {
			int r = (int)(Math.random()*count);
			System.out.println(list[r]);
		}
	}
	@Override
	public int length() {
		System.out.println("음악개수 : " + count);
		return count;
	}
	
	
}
