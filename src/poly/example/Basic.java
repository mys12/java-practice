package poly.example;

/*
 * 자바의 하나의 파일에는 여러 클래스를 선언할 수 있음
 * 단, 파일명과 동일한 클래스가 존재해야 하며, 해당 클래스만 public이어야 함
 */
class A {
	
}
class B extends A{
	
}
class C extends A {
	
}
class D extends B {
	
}
class E extends C{
	
}
public class Basic {

	A a = new A();
	B b = new B();
	C c = new C();
	D d = new D();
	E e = new E();
	
	A a1 = b; //B -> A형으로 형변환
	A a2 = new B();
	
	int x = 1;
	double y = x; //int -> double형으로 형변환
	
	A a3 = new C();
	A a4 = new D();
	A a5 = new E();
	
	//상속 관계가 없다면 저장 X
//	B b1 = new E();
	
	//Object 타입에는 모든 객체를 저장할 수 있음
	Object obj1 = new A();
	Object obj2 = new B();
	Object obj3 = "문자열도 저장가능";
	Object obj4 = 1;
}
