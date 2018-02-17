package domain;

public class Action {
	//Fields
	private String name;
	private String note;
	private String difficulty;
	private String tag;
	
	//Methods
	public Action(String name, String note, String difficulty, String tag) {
		super();
		this.name = name;
		this.note = note;
		this.difficulty = difficulty;
		this.tag = tag;
	}
	
	//Getters & Setters
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getNote() {
		return note;
	}
	public void setNote(String note) {
		this.note = note;
	}
	public String getDifficulty() {
		return difficulty;
	}
	public void setDifficulty(String difficulty) {
		this.difficulty = difficulty;
	}
	public String getTag() {
		return tag;
	}
	public void setTag(String tag) {
		this.tag = tag;
	}
	
	
	
	
}
