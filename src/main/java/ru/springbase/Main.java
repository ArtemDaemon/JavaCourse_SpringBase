package ru.springbase;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");

        // Get Mechanism beans from the context
        Mechanism circleMechanism = (Mechanism) context.getBean("circleMechanism");
        Mechanism squareMechanism = (Mechanism) context.getBean("squareMechanism");

        // Call method to print messages
        circleMechanism.printArea();
        squareMechanism.printArea();
        
        context.close();
	}

}
