package collection.list;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class ArrayListExample {

	public static void main(String[] args) {
		
		//ArrayList
//		Collection<String> list = new ArrayList<>();
//		ArrayList<String> list = new ArrayList<>();
		
		List<String> list = new ArrayList<>();
		
		//list에 값을 저장하는 메서드 add()
		list.add("JAVA");
		list.add("JSP");
		list.add("DataBase");
		list.add("SPRING");
		list.add("JAVA");
		
		// list에 크기를 확인하는 메서드 size()
		System.out.println("리스트의 크기 : " + list.size());

		// list의 저장된 내부를 문자열로 보는 기능 toString()
		System.out.println(list.toString());
		
		// list에 중간에 추가. add(index, 값)
		list.add(3, "ORACLE");
		System.out.println(list.toString());
		
		// list의 값 수정 set(index, 값)
		list.set(2, "DB");
		System.out.println(list.toString());
		
		// list의 값 얻기 get(index)
		String s = list.get(2);
		System.out.println("2번째 인덱스의 저장된 값 : " + s);
		
		// list의 검색 contains(값) -값이 들어있는 지 확인해서 true, false 반환
		if (list.contains("SPRING")) {
			System.out.println("스프링이 포함되어 있음");
		}
		
		// list의 삭제 remove(index), clear()
		list.remove(2);
		System.out.println(list.toString());
		
		
 	}
}
