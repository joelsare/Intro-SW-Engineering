package pkg1;

public class Program {
	public static void main(String[] args) {
		Circle c1 = new Circle(1.0, 0, 1.0);
		Circle c2 = new Circle(3.0, 0, 2.0);
		System.out.println(c1.area(Math.PI));
		System.out.println(c1.distance());
	}
}
