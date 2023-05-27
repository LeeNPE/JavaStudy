package chap06;

public class Circle {
		static double PI = 3.141592;
		double radius;
		Circle(double radius) {
			this.radius = radius;
	}
	double area() {
		return this.radius * this.radius * PI;
	}
	double perimeter(){
		return 2 *this.radius * PI;
	}

}
