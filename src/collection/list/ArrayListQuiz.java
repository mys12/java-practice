package collection.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListQuiz {

	public static void main(String[] args) {
	
		List<Integer> list2 = new ArrayList<>();
		
		//list에 1~10까지 저장(반목문으로 저장)
		for(int i = 1; i <= 10; i++) {
			list2.add(i);
		}
		System.out.println(list2.toString());
		//list에 저장한 값을 반복문으로 출력
		for(int j = 0; j<list2.size(); j++ ) {
			System.out.println(list2.get(j));
		}
		
		System.out.println("-----------------------");
		/*
		 * 1. User클래스를 저장할 수 있는 List를 생성
		 * 2. User1(홍길동, 20) User2(홍길자, 30)를 저장한 후에 list에 객체를 추가
		 * 
		 * 3. List에 있는 모든 객체의 이름, 나이를 for문으로 출력
		 * 4. 홍길자가 있다면 홍길자의 이름과 나이만 출력
		 */
		
		List<User> list = new ArrayList<>();
		User user1 = new User("홍길동", 20);
		User user2 = new User("홍길자", 30);
		
		list.add(user1);
		list.add(user2);

		/*
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i).getName());
			System.out.println(list.get(i).getAge());
			
			
		}
		*/
		for(User u : list) {
			System.out.println("이름 : " + u.getName());
			System.out.println("나이 : " + u.getAge());
		}
		

		System.out.println("----------------");
		for(User u : list) {
			if(u.getName().equals("홍길자")) {
				System.out.println(u.getName());
				System.out.println(u.getAge());
			}
		}
	}
}
