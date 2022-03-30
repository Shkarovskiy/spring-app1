package ru.shkarovskii.springcourse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Computer {
	private MusicPlayer musicPlayer;
	private int id;
	
	@Autowired
	public Computer(MusicPlayer musicPlayer) {
		this.id = 1;
		this.musicPlayer = musicPlayer;
	}
	
	@Override
	public String toString() {
		return "Computer " + id + " " + musicPlayer.playMusic();
	}

}
