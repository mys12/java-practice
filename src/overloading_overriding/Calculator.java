package overloading_overriding;

public class Calculator extends Computer {

	//오버라이딩
	double circle(double r) {
		return r*r*Math.PI;
	}
	
	// 오버로딩
	double Rect(double a) {
		return a*a;
	}
	double Rect(double a, double b) {
		return a*b;
	}
	double Rect(double a, double b, double c) {
		return a*b*c;
	}
}
