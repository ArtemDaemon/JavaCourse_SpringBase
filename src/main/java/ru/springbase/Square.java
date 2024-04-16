package ru.springbase;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

public class Square implements Shape {
	private double side;
	
	public Square() {}
	
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
	
	@PostConstruct
	public void init() {
		System.out.println("Square bean initialized with side: " + side);
	}
	
	@PreDestroy
	public void destroy() {
		System.out.println("Cleaning up Square bean with side: " + side);
	}
}
