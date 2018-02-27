package Model;

public class Item {
	//Fields
	private String name;
	private String status;
	private int buff;
	
	//Methods
	public Item(String name, String status, int buff) {
		super();
		this.name = name;
		this.status = status;
		this.buff = buff;
	}
	
	//Getters & Setters
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public int getBuff() {
		return buff;
	}
	public void setBuff(int buff) {
		this.buff = buff;
	}
	
	
}
