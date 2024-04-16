package ru.springbase;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:config.properties")
public class SpringConfig {
	
	@Bean
	public Circle circle() {
		return new Circle(5);
	}
	
	@Value("${square.sideLength}")
	private double side;
	
	@Bean
	public Square square() {
		return new Square(side);
	}
	
	@Bean
	public Mechanism circleMechanism() {
		return new Mechanism(circle());
	}
	
	@Bean
	public Mechanism squareMechanism() {
		return new Mechanism(square());
	}
}
