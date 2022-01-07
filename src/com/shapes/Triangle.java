package com.shapes;

public class Triangle extends Shape {
	
	protected int s1, s2, s3;

	public Triangle() {
		// TODO Auto-generated constructor stub
		s1 = 0;
		s2 = 0;
		s3 = 0;
	}

	public Triangle(int s1, int s2, int s3) {
		super();
		this.s1 = s1;
		this.s2 = s2;
		this.s3 = s3;
	}

	public Triangle(String colour, int s1, int s2, int s3) {
		super(colour);
		this.s1 = s1;
		this.s2 = s2;
		this.s3 = s3;
	}

	public int getS1() {
		return s1;
	}

	public void setS1(int s1) {
		this.s1 = s1;
	}

	public int getS2() {
		return s2;
	}

	public void setS2(int s2) {
		this.s2 = s2;
	}

	public int getS3() {
		return s3;
	}

	public void setS3(int s3) {
		this.s3 = s3;
	}
	
	public double getArea() {
		return 0.5 * s1 * s2 * Math.sin(s3);
	}
	
	public double getCircumference() {
		return s1 + s2 + s3;
	}

}
