package com.shapes2;

public class Driver {

	public static void main(String[] args) {
		Shape s = new Shape();
		System.out.println("colour: " + s.getColour());
		s.setColour("Orange");
		System.out.println("new colour: " + s.getColour());
		
		Square a = new Square(5);
		System.out.println("\nSquare details");
		System.out.println("Area: " + a.getArea());
		System.out.println("Circumference: " + a.getCircumference());
		
		Rectangle b = new Rectangle(4,5);
		System.out.println("\nRectangle details");
		System.out.println("Area: " + b.getArea());
		System.out.println("Circumference: " + b.getCircumference());
		
		Circle c = new Circle(5);
		System.out.println("\nCircle details");
		System.out.println("Area: " + c.getArea());
		System.out.println("Circumference: " + c.getCircumference());
		System.out.println("Colour: " + c.getColour());
		
		Circle d = new Circle("Yellow", 10);
		System.out.println("\nYellow Circle details");
		System.out.println("Area: " + d.getArea());
		System.out.println("Circumference: " + d.getCircumference());
		System.out.println("Colour: " + d.getColour());
		
		Triangle t = new Triangle("Blue", 1, 2, 3);
		System.out.println("\nBlue Triangle details");
		System.out.println("Area: " + t.getArea());
		System.out.println("Circumference: " + t.getCircumference());
		System.out.println("Colour: " + t.getColour());
	}

}
