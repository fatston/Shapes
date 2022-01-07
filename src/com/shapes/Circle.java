package com.shapes;

public class Circle extends Shape {
	private int radius;

	public Circle() {
		super();
	}
	
	public Circle(String colour) {
		super(colour);
	}

	public Circle(int radius) {
		super();
		this.radius = radius;
	}
	
	public Circle(String colour, int radius) {
		super(colour);
		this.radius = radius;
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	@Override
	public double getArea() {
		return Math.PI * radius * radius;
	}
	
	@Override
	public double getCircumference() {
		return 2 * Math.PI * radius;
	}
}
