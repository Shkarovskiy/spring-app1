package ru.shkarovskii.springcourse;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Music music = context.getBean("jazzMusic", JazzMusic.class);
		System.out.println(music.getSong());
		MusicPlayer musicPlayer = new MusicPlayer(music);
		musicPlayer.playMusic();
		
		context.close();
	}
}
