package ar.edu.unlp.info.oo1.ParcialOO1TikTok;

import java.util.ArrayList;

public abstract class Account {
	private ArrayList<Sound> sounds;
	
	public Account(ArrayList<Sound> sounds) {
		super();
		this.sounds = sounds;
	}

	public ArrayList<Sound> getSounds() {
		return sounds;
	}
	
}
