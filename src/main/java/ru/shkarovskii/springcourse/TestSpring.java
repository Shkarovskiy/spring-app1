package ru.shkarovskii.springcourse;

import java.awt.SecondaryLoop;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		ClassicalMusic classicalMusic = context.getBean("musicBean", ClassicalMusic.class);
		System.out.println(classicalMusic.getSong());
		ClassicalMusic classicalMusic2 = context.getBean("musicBean", ClassicalMusic.class);
		System.out.println(classicalMusic2.getSong());
		
		
		
		context.close();
	}
}
