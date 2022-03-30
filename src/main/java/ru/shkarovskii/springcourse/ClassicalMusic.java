package ru.shkarovskii.springcourse;

public class ClassicalMusic implements Music{
	private ClassicalMusic() {}
	
	public static ClassicalMusic getClassicalMusic() {
		System.out.println("mady by fabric metho");
		return new ClassicalMusic();
	}
	
	public void myInit() {
		System.out.println("This is myInit method");
	}
	
	public void myDestroy() {
		System.out.println("This is myDestroy method");
	}
	
	@Override
	public String getSong() {
		return "Classiacl Song";
	}

}
