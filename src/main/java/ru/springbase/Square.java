package ru.springbase;

public class Square implements Shape {
	private double side;
	
	public Square(double side) {
		this.side = side;
	}
	
	public void setSide(double side) {
		this.side = side;
	}
	
	@Override
	public double calculateArea() {
		return side * side;
	}
}
