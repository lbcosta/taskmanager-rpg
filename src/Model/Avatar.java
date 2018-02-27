package Model;

import java.util.ArrayList;

public class Avatar {
	//Fields
	private String name;
	private int level;
	private int health;
	private double experience;
	private Status status;
	private int gold;
	private ArrayList<Item> items;
	
	//Methods
	public Avatar() {}
	
	public Avatar(String name, int level, int health, double experience, Status status, int gold, ArrayList<Item> items) {
		super();
		this.name = name;
		this.level = level;
		this.health = health;
		this.experience = experience;
		this.status = status;
		this.gold = gold;
		this.items = items;
	}
	
	//Getters && Setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		this.health = health;
	}

	public double getExperience() {
		return experience;
	}

	public void setExperience(double experience) {
		this.experience = experience;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	public int getGold() {
		return gold;
	}

	public void setGold(int gold) {
		this.gold = gold;
	}

	public ArrayList<Item> getItems() {
		return items;
	}

	public void setItems(ArrayList<Item> items) {
		this.items = items;
	}
	
	
	
	
	
	
}
