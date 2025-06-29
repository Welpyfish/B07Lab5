package lab4;

public class Circle {
	Point origin;
	double radius;
	
	public Circle(Point origin, double radius) {
		this.origin = origin;
		this.radius = radius;
	}
	
	public double circumference() {
		return 2 * this.radius * Math.PI;
	}
	
	public double area() {
		return Math.PI * this.radius * this.radius;
	}
	
	public boolean isGreater(Circle circle) {
		return this.radius > circle.radius;
	}
	
	public boolean pointInCircle(Point point) {
		return this.radius >= this.origin.distance(point);
	}
}
