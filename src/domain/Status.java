package domain;

public class Status {
	//Fields
	private int strength;
	private int intelligence;
	private int constitution;
	private int perception;
	
	//Methods
	public Status() {
		super();
		this.strength = 0;
		this.intelligence = 0;
		this.constitution = 0;
		this.perception = 0;
	}
	
	//Getters & Setters
	public int getStrength() {
		return strength;
	}
	public void setStrength(int strength) {
		this.strength = strength;
	}
	public int getIntelligence() {
		return intelligence;
	}
	public void setIntelligence(int intelligence) {
		this.intelligence = intelligence;
	}
	public int getConstitution() {
		return constitution;
	}
	public void setConstitution(int constitution) {
		this.constitution = constitution;
	}
	public int getPerception() {
		return perception;
	}
	public void setPerception(int perception) {
		this.perception = perception;
	}
}
