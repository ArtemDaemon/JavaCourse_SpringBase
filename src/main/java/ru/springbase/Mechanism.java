package ru.springbase;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

public class Mechanism {
	private Shape shape;
	
	public Mechanism(Shape shape) {
		this.shape = shape;
	}
	
	public void printArea() {
		double area = shape.calculateArea();
		System.out.println("Area of the shape: " + area);
	}
	
	@PostConstruct
	public void init() {
		System.out.println("Mechanism bean initialized with shape class: " + shape.getClass());
	}
	
	@PreDestroy
	public void destroy() {
		System.out.println("Cleaning up Mechanism bean with shape class: " + shape.getClass());
	}
}
