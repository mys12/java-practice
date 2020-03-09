package overriding.quiz01;

public class Student extends People {

	/*
	 * 모든 멤버변수를 초기화 하는 생성자
	 * People을 상속
	 * 모든 메서드를 오버라이딩해서 사용
	 * getTotal() : 국+영+수 합계반환
	 * getAvg() : 평균을 반환
	 * info() : 이름 합계 평균을 문자열로 반환
	 */
	String name;
	int no;
	int kor;
	int eng;
	int math;
	
	Student(String sName, int sNo, int sKor, int sEng, int sMath ){
		name = sName;
		no = sNo;
		kor = sKor;
		eng = sEng;
		math = sMath;
	}
	
	int getTotal() {
		return kor+eng+math;
	}
	
	double getAvg() {
//		return (kor+eng+math)/3;
		return getTotal()/3.0;
	}
	
	String info() {
		System.out.println("정보");
		return "이름 : " + name + ", 학번 : " + no + ", 합계 : " + getTotal() + ", 평균 : " + getAvg();
		
	}
}
