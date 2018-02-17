package domain;

public class Habit extends Action {
	//Fields
	private boolean influence;
	
	//Methods
	public Habit(String name, String note, String difficulty, String tag, boolean influence) {
		super(name, note, difficulty, tag);
		this.influence = influence;
	}
	
	//Getters & Setters
	public boolean isInfluence() {
		return influence;
	}

	public void setInfluence(boolean influence) {
		this.influence = influence;
	}
	
}
