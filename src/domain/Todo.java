package domain;

import java.util.Date;

public class Todo extends ComplexAction {
	//Fields
	private Frequency frequency;
	
	//Methods
	public Todo(String name, String note, String difficulty, String tag, String[] checklist, Date[] reminders,
			Frequency frequencia) {
		super(name, note, difficulty, tag, checklist, reminders);
		this.frequency = frequencia;
	}
	
	//Getters & Setters
	public Frequency getFrequencia() {
		return frequency;
	}

	public void setFrequencia(Frequency frequencia) {
		this.frequency = frequencia;
	}
}
