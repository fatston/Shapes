package com.shapes;

public class Shape {
	protected String colour;

	public Shape() {
		super();
		this.colour = "Colourless";
	}

	public Shape(String colour) {
		super();
		this.colour = colour;
	}	
	
	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public double getArea() {
		return 0;
	}
	
	public double getCircumference() {
		return 0;
	}
	
}
