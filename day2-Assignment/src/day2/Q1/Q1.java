package day2.Q1;
/*
   Implement following UML diagram, Write a program to test circle class
 */

class Circle {
	private double radius;
	private String color;

	public Circle() {
		radius = 1;
		color = "Red";
	}

	public Circle(double r) {
		radius = r;
	}

	public double getRadius() {
		return radius;
	}

	public double getArea() {
		return 3.14 * radius * radius;
	}
}

public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle circle = new Circle();
		Circle circle2=new Circle(1.5);
		System.out.println("Radius is: " + circle.getRadius());
		System.out.println("Area is: " + circle.getArea());
		System.out.println("Radius is: " + circle2.getRadius());
		System.out.println("Area is: " + circle2.getArea());

	}

}
