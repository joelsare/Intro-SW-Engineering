package pkg1;

public class Circle {
	protected double x, y, radius;

	public Circle(double d, double e, double f) {
		this.x = d;
		this.y = e;
		this.radius = f;
	}

	
	public double distance() {
		return 1.0;
	}
	public double area(double pi) {
		return pi * radius * radius;
	}

}
