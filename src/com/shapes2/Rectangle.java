package com.shapes2;

public class Rectangle extends Shape {
	private int length;
	private int breadth;
	
	public Rectangle() {
		super();
		length = 0;
		breadth = 0;
	}

	public Rectangle(int length, int breadth) {
		super();
		this.length = length;
		this.breadth = breadth;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getBreadth() {
		return breadth;
	}

	public void setBreadth(int breadth) {
		this.breadth = breadth;
	}
	
	@Override
	public double getArea() {
		return length * breadth;
	}
	
	@Override
	public double getCircumference() {
		return 2 * (length + breadth);
	}
}
