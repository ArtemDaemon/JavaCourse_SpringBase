package ru.springbase;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);

        // Get Mechanism beans from the context
         Mechanism circleMechanism = (Mechanism) context.getBean("circleMechanism");
         Mechanism squareMechanism = (Mechanism) context.getBean("squareMechanism");

        // Call method to print messages
         circleMechanism.printArea();
         squareMechanism.printArea();
        
        context.close();
	}

}
