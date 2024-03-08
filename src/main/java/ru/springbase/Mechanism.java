package ru.springbase;

public class Mechanism {
	private Shape shape;
	
	public Mechanism(Shape shape) {
		this.shape = shape;
	}
	
	public void printArea() {
		double area = shape.calculateArea();
		System.out.println("Area of the shape: " + area);
	}
}
