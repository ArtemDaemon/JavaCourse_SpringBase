package ru.springbase;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

public class Circle implements Shape {
	private double radius;
	
	public Circle() {}
	
	public Circle(double radius) {
		this.radius = radius;
	}
	
	@Override
	public double calculateArea() {
		return Math.PI * radius * radius;
	}
	
	@PostConstruct
	public void init() {
		System.out.println("Circle bean initialized with radius: " + radius);
	}
	
	@PreDestroy
	public void destroy() {
		System.out.println("Cleaning up Circle bean with radius: " + radius);
	}
}
