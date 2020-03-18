package api.lang.obj;

public class Person {

	String name;
	
	Person(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		
		return "이름 : " + name;
	}

	@Override
	public boolean equals(Object obj) {
		//객체 안에 name 값이 동일한지 확인해서 맞으면 true를 
		// 다르면 false 반환하도록 처리
		if(obj instanceof Person) {
		
			Person p = (Person)obj;
			if(name.equals(p.name)) {
				return true;
			}
		}
		return false;
	}
	
	
}
