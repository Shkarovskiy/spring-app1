package ru.shkarovskii.springcourse;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
public class ClassicalMusic implements Music{
	public void doMyInint() {
		System.out.println("MyInit");
	}
	
	public void doMyDestroy() {
		System.out.println("MyDestroy");
	}
	
	@Override
	public String getSong() {
		return "Classiacl Song";
	}
}
