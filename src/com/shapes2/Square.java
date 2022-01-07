package com.shapes2;

public class Square extends Shape {
	private int side;

	public Square() {
		super();
		side = 0;
	}

	public Square(int side) {
		super();
		this.side = side;
	}

	public int getSide() {
		return side;
	}

	public void setSide(int side) {
		this.side = side;
	}
	
	@Override
	public double getArea() {
		return side * side;
	}
	
	@Override
	public double getCircumference() {
		return side * 4;
	}
	

}
