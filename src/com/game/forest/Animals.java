package com.game.forest;
import com.game.forest.enums.*;

public abstract class Animals {
	private Emotions emotion;
	private String name;
	private int strength;
	private String type;
	
	
	public abstract void eat();
	
	void behaviour()
	{
		System.out.println("Animals are moving through the forest");
	}
	
	
	
	public Emotions getEmotion() {
		return emotion;
	}
	public void setEmotion(Emotions emotion) {
		this.emotion = emotion;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public int getStrength() {
		return strength;
	}
	public void setStrength(int strength) {
		this.strength = strength;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}

	

	
	

}
