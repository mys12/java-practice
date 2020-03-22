package collection.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapExample {

	public static void main(String[] args) {
		//HashMap객체 생성
//		HashMap<Integer, String> map = new HashMap<>();
		Map<Integer, String> map = new HashMap<>();
		
		//map에 값을 추가 put(key, value)
		map.put(1, "홍길동");
		map.put(2, "홍길자");
		map.put(3, "이순신");
		map.put(4, "세종대왕");
		
		//map 크기는 size()
		System.out.println(map.size());
		
		
		//map의 내부값을 문자열로 확인 toString()
		System.out.println(map.toString());
		
		//map은 동일한 키값으로 저장하면 값이 수정됨
		map.put(4, "박찬호");
		System.out.println(map.toString());
		
		//map의 값을 얻을때는 get(key)
		String s = map.get(2);
		System.out.println("2번 키에 해당하는 값 : " + s);
		
		
		//map의 반복문의 처리
		
		//map의 key 값을 순서대로 얻는 방법 keySet()
		Set<Integer> keyList = map.keySet();
		
		for(int i : keyList) {
			System.out.println(map.get(i));
		}
		
		System.out.println(keyList.toString());
		
		// key가 존재하는지 여부
		if(map.containsKey(3)) {
			System.out.println("3번 키는 존재함");
		}
		
	}
}
